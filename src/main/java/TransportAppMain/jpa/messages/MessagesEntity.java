package TransportAppMain.jpa.messages;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Table(name = "messages")
@Entity
public class MessagesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_message", nullable = false, unique = true)
    private Long idMessage;

    @Column(name = "date_send", nullable = false, unique = true)
    private LocalDate dateSend;

    @Column(name = "content", nullable = false, unique = true)
    private String content;

    @Column(name = "user_to", nullable = false, unique = true)
    private Long userTo;

    @Column(name = "user_from", nullable = false, unique = true)
    private Long userFrom;

    @Column(name = "status", nullable = false, unique = true)
    private String status;

}
