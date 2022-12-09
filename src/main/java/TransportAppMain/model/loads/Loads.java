package TransportAppMain.model.loads;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Loads {

    private Long idLoad;
    private String origin;
    private String destination;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private String fullPartial;
    private String truckType;
    private int length;
    private int weight;
    private String numberContact;
    private String comments;
    private String typeLoads;
    private Double valueKilogram;
    private Double rating;
    private String status;
    private Long userId;
    private Float latOrigin;
    private Float lngOrigin;
    private String addressComponentsOrigin;
    private Float latDestination;
    private Float lngDestination;
    private String addressComponentDestination;
}
