package TransportAppMain.usecases;

import TransportAppMain.model.common.HttpStatusEnum;
import TransportAppMain.model.common.Response;
import TransportAppMain.model.notifications.Notifications;
import TransportAppMain.model.notifications.NotificationsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequiredArgsConstructor
public class NotificationsUseCase {

    private final NotificationsRepository notificationsRepository;

    public Response getAllNotificationsByUserId(Long idUser){
        try{
            return Response.builder().data(notificationsRepository.getAllNotificationsByUserId(idUser)).code(HttpStatusEnum.OK.getCode()).status(Boolean.TRUE)
                    .message("List of notifications").build();
        }catch (Exception e){
            return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                    .message("Error getting list of notifications").build();
        }
    }

    public Response getNotificationById(Long idNotification){
        try{
            return Response.builder().data(notificationsRepository.getNotificationById(idNotification)).code(HttpStatusEnum.OK.getCode()).status(Boolean.TRUE)
                    .message("Notification found successfully").build();
        }catch (Exception e){
            return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                    .message("Error locating the notification").build();
        }
    }

    public Response createNotification(Notifications notification){
        try{
            int create = notificationsRepository.createNotification(notification);
            if(create == 1){
                return Response.builder().data(Boolean.TRUE).code(HttpStatusEnum.OK.getCode()).status(Boolean.TRUE)
                        .message("Notification created successfully").build();
            }else{
                return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                        .message("An error occurred creating the notification").build();
            }
        }catch (Exception e){
            return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                    .message("Error creating the notification").build();
        }
    }

    public Response updateNotification(Notifications notification){
        try{
            int update = notificationsRepository.updateNotification(notification);
            if(update == 1){
                return Response.builder().data(Boolean.TRUE).code(HttpStatusEnum.OK.getCode()).status(Boolean.TRUE)
                        .message("Notification successfully updated").build();
            }else{
                return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                        .message("It was not possible to update the notification information").build();
            }
        }catch (Exception e){
            return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                    .message("Error updating notification information").build();
        }
    }

    public Response deleteNotification(Long idNotification){
        try{
            int delete = notificationsRepository.deleteNotification(idNotification);
            if(delete == 1){
                return Response.builder().data(Boolean.TRUE).code(HttpStatusEnum.OK.getCode()).status(Boolean.TRUE)
                        .message("Notification deleted successfully").build();
            }else{
                return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                        .message("It was not possible to delete the selected notification").build();
            }
        }catch (Exception e){
            return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                    .message("Error deleting the notification").build();
        }
    }

}
