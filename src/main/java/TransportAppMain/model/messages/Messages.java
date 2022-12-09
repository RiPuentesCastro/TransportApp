package TransportAppMain.model.messages;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Messages {

    private Long idMessage;
    private LocalDate dateSend;
    private String content;
    private Long userTo;
    private Long userFrom;
    private String status;

}
