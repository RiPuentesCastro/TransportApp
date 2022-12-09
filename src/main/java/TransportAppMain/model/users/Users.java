package TransportAppMain.model.users;


import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Users {

    private Long idUser;
    private String username;
    private String password;
    private String type;
    private String name;
    private String lastname;
    private LocalDate registerDate;
    private String profileImage;
    private String country;
    private String wayToPay;
    private LocalDateTime lastLogin;
    private Long stat;
    private String token;

}
