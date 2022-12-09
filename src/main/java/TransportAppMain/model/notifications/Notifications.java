package TransportAppMain.model.notifications;


import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Notifications {

    private Long idNotifications;
    private String typeNotification;
    private Long userShow;
    private String message;
    private String typeUsers;
    private LocalDate dateNotification;
    private String status;

}
