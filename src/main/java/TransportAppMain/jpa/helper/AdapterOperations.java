package TransportAppMain.jpa.helper;


import org.reactivecommons.utils.ObjectMapper;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.StreamSupport.stream;

@SuppressWarnings("unchecked")

public abstract class AdapterOperations <E, D, I, R extends CrudRepository<D, I> & QueryByExampleExecutor<D>>{
    protected R repository;
    private Class<D> dataClass;
    protected ObjectMapper mapper;
    private Function<D, E> toEntityFn;
    private Long cacheLastUpdate = 0L;
    private List<E> cacheEntityData;
    private int CACHE_PERIOD = 3600000;

    public AdapterOperations(R repository, ObjectMapper mapper, Function<D, E> toEntityFn, int cacheLifespan) {
        this.repository = repository;
        this.mapper = mapper;
        ParameterizedType genericSuperclass = (ParameterizedType) this.getClass().getGenericSuperclass();
        this.dataClass = (Class<D>) genericSuperclass.getActualTypeArguments()[1];
        this.toEntityFn = toEntityFn;
        if(cacheLifespan >= 600){
            this.CACHE_PERIOD = cacheLifespan*1000;
        }
        else {
            this.CACHE_PERIOD = 0;
        }
    }

    protected D toData(E entity) {
        return mapper.map(entity, dataClass);
    }

    protected E toEntity(D data) {
        return data != null ? toEntityFn.apply(data) : null;
    }

    public E save(E entity){
        D data = toData(entity);
        return toEntity(saveData(data));
    }

    public List<E> toList(Iterable<D> iterable) {
        return stream(iterable.spliterator(), false).map(this::toEntity).collect(Collectors.toList());
    }

    protected D saveData(D data) {
        return repository.save(data);
    }

    private void updateCache(){
        this.cacheEntityData = this.toList(repository.findAll());
        this.cacheLastUpdate = System.currentTimeMillis();
    }

    public List<E> getAllCache(){
        if ((System.currentTimeMillis() - this.cacheLastUpdate) >= CACHE_PERIOD){
            this.updateCache();
        }
        return this.cacheEntityData;
    }
}
