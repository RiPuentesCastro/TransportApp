package TransportAppMain.model.loads;

import java.util.List;

public interface LoadsRepository {
    List<Loads> getAllLoads();
    Loads getLoadById(Long idLoad);
    List<Loads> getLoadByUserId(Long userId);
    int createLoad(Loads load);
    int updateLoad(Loads load);
    int deleteLoad(Long idLoad);
}
