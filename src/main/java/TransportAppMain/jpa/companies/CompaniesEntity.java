package TransportAppMain.jpa.companies;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "companies")
@Entity
public class CompaniesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_company", nullable = false, unique = true)
    private Long idCompany;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "address", nullable = false, unique = true)
    private String address;

    @Column(name = "city", nullable = false, unique = true)
    private String city;

    @Column(name = "credit_score", nullable = false, unique = true)
    private int creditScore;

    @Column(name = "days_to_pay", nullable = false, unique = true)
    private int daysToPay;

    @Column(name = "pick_up_date", nullable = false, unique = true)
    private int pickUpDate;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "user_id", nullable = false, unique = true)
    private Long userId;

}
