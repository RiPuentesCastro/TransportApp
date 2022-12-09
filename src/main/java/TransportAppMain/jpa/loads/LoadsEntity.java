package TransportAppMain.jpa.loads;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Table(name = "loads")
@Entity
public class LoadsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_load", nullable = false, unique = true)
    private Long idLoad;

    @Column(name = "origin", nullable = false, unique = true)
    private String origin;

    @Column(name = "destination", nullable = false, unique = true)
    private String destination;

    @Column(name = "date_from", nullable = false, unique = true)
    private LocalDate dateFrom;

    @Column(name = "date_to", nullable = false, unique = true)
    private LocalDate dateTo;

    @Column(name = "full_partial", nullable = false, unique = true)
    private String fullPartial;

    @Column(name = "truck_type", nullable = false, unique = true)
    private String truckType;

    @Column(name = "length", nullable = false, unique = true)
    private int length;

    @Column(name = "weight", nullable = false, unique = true)
    private int weight;

    @Column(name = "number_contact", nullable = false, unique = true)
    private String numberContact;

    @Column(name = "comments", nullable = false, unique = true)
    private String comments;

    @Column(name = "type_loads", nullable = false, unique = true)
    private String typeLoads;

    @Column(name = "value_kilogram", nullable = false, unique = true)
    private Double valueKilogram;

    @Column(name = "rating", nullable = false, unique = true)
    private Double rating;

    @Column(name = "status", nullable = false, unique = true)
    private String status;

    @Column(name = "user_id", nullable = false, unique = true)
    private Long userId;

    @Column(name = "lat_origin", nullable = false, unique = true)
    private Float latOrigin;

    @Column(name = "lng_origin", nullable = false, unique = true)
    private Float lngOrigin;

    @Column(name = "address_components_origin", nullable = false, unique = true)
    private String addressComponentsOrigin;

    @Column(name = "lat_destination", nullable = false, unique = true)
    private Float latDestination;

    @Column(name = "lng_destination", nullable = false, unique = true)
    private Float lngDestination;

    @Column(name = "address_components_destination", nullable = false, unique = true)
    private String addressComponentDestination;

}
