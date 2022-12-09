package TransportAppMain.jpa.users;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Table(name = "users")
@Entity
public class UsersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user", nullable = false, unique = true)
    private Long idUser;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "password", nullable = false, unique = true)
    private String password;

    @Column(name = "type", nullable = false, unique = true)
    private String type;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "lastname", nullable = false, unique = true)
    private String lastname;

    @Column(name = "register_date", nullable = false, unique = true)
    private LocalDate registerDate;

    @Column(name = "profile_image", nullable = false, unique = true)
    private String profileImage;

    @Column(name = "country", nullable = false, unique = true)
    private String country;

    @Column(name = "way_to_pay", nullable = false, unique = true)
    private String wayToPay;

    @Column(name = "last_login", nullable = false, unique = true)
    private LocalDateTime lastLogin;

    @Column(name = "stat", nullable = false, unique = true)
    private Long stat;

    @Column(name = "token", nullable = false, unique = true)
    private String token;
}
