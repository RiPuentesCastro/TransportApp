package TransportAppMain.model.notifications;

import java.util.List;

public interface NotificationsRepository {
    List<Notifications> getAllNotificationsByUserId(Long idUser);
    Notifications getNotificationById(Long idNotifications);
    int createNotification(Notifications notification);
    int updateNotification(Notifications notification);
    int deleteNotification(Long idNotification);
}
