package TransportAppMain.jpa.trucks;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Table(name = "trucks")
@Entity
public class TrucksEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_truck", nullable = false, unique = true)
    private Long idTruck;

    @Column(name = "user_id", nullable = false, unique = true)
    private Long userId;

    @Column(name = "image_truck", nullable = false, unique = true)
    private String imageTruck;

    @Column(name = "truck_type", nullable = false, unique = true)
    private String truckType;

    @Column(name = "full_partial", nullable = false, unique = true)
    private String fullPartial;

    @Column(name = "length", nullable = false, unique = true)
    private int length;

    @Column(name = "weight", nullable = false, unique = true)
    private int weight;

    @Column(name = "origin", nullable = false, unique = true)
    private String origin;

    @Column(name = "destination", nullable = false, unique = true)
    private String destination;

    @Column(name = "date_from", nullable = false, unique = true)
    private LocalDate dateFrom;

    @Column(name = "date_to", nullable = false, unique = true)
    private LocalDate dateTo;

    @Column(name = "numbers_contact", nullable = false, unique = true)
    private String numbersContact;

    @Column(name = "comments", nullable = false, unique = true)
    private String comments;

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
