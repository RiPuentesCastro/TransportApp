package TransportAppMain.jpa.cities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "cities")
@Entity
public class CitiesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_city", nullable = false, unique = true)
    private Long idCity;

    @Column(name = "alfa-2", nullable = false, unique = true)
    private String alfa2;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "number", nullable = false, unique = true)
    private int number;

    @Column(name = "alfa-3", nullable = false, unique = true)
    private String alfa3;

}
