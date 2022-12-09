package TransportAppMain.jpa.notifications;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Table(name = "notifications")
@Entity
public class NotificationsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_notifications", nullable = false, unique = true)
    private Long idNotifications;

    @Column(name = "type_notification", nullable = false, unique = true)
    private String typeNotification;

    @Column(name = "user_show", nullable = false, unique = true)
    private Long userShow;

    @Column(name = "message", nullable = false, unique = true)
    private String message;

    @Column(name = "type_users", nullable = false, unique = true)
    private String typeUsers;

    @Column(name = "date_notification", nullable = false, unique = true)
    private LocalDate dateNotification;

    @Column(name = "status", nullable = false, unique = true)
    private String status;

}
