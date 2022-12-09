package TransportAppMain.jpa.notifications;

import TransportAppMain.jpa.helper.AdapterOperations;
import TransportAppMain.model.notifications.Notifications;
import TransportAppMain.model.notifications.NotificationsRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationsRAdapter extends AdapterOperations<Notifications, NotificationsEntity, Long, NotificationsERepository> implements NotificationsRepository {

    public NotificationsRAdapter(NotificationsERepository repository, ObjectMapper mapper){
        super(repository, mapper, d -> mapper.mapBuilder(d, Notifications.NotificationsBuilder.class).build(), 3600);
    }

    @Override
    public List<Notifications> getAllNotificationsByUserId(Long idUser){
        return toList(repository.getAllNotificationsByUserId(idUser));
    }

    @Override
    public Notifications getNotificationById(Long idNotification){
        return toEntity(repository.getNotificationById(idNotification));
    }

    @Override
    public int createNotification(Notifications notification){
        return repository.createNotification(notification.getTypeNotification(), notification.getUserShow(),
                notification.getMessage(), notification.getTypeUsers(), notification.getDateNotification(), notification.getStatus());
    }

    @Override
    public int updateNotification(Notifications notification){
        return repository.updateNotification(notification.getIdNotifications(), notification.getTypeNotification(), notification.getUserShow(),
                notification.getMessage(), notification.getTypeUsers(), notification.getDateNotification(), notification.getStatus());
    }

    @Override
    public int deleteNotification(Long idNotification){
        return repository.deleteNotification(idNotification);
    }

}