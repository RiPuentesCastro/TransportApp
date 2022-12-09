package TransportAppMain.Controllers.notifications;

import TransportAppMain.model.common.Response;
import TransportAppMain.model.notifications.Notifications;
import TransportAppMain.usecases.NotificationsUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api")
@AllArgsConstructor
public class NotificationsApiRest {

    private final NotificationsUseCase notificationsUseCase;

    @GetMapping("/notifications/getAllNotificationsByUserId/{idUser}")
    public Response getAllNotificationsByUserId(@PathVariable Long idUser) {
        return notificationsUseCase.getAllNotificationsByUserId(idUser);
    }

    @GetMapping("/notifications/getNotificationById/{idNotification}")
    public Response getNotificationById(@PathVariable Long idNotification) {
        return notificationsUseCase.getNotificationById(idNotification);
    }

    @PostMapping("/notifications/postNotification")
    public Response createNotification(@RequestBody Notifications notification) {
        return notificationsUseCase.createNotification(notification);
    }

    @PostMapping("/notifications/updateNotification")
    public Response updateNotification(@RequestBody Notifications notification) {
        return notificationsUseCase.updateNotification(notification);
    }

    @DeleteMapping("/notifications/deleteNotification/{idNotification}")
    public Response deleteNotification(@PathVariable Long idNotification) {
        return notificationsUseCase.deleteNotification(idNotification);
    }

}