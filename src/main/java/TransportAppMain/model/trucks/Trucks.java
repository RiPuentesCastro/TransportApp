package TransportAppMain.model.trucks;


import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Trucks {

    private Long idTruck;
    private Long userId;
    private String imageTruck;
    private String truckType;
    private String fullPartial;
    private int length;
    private int weight;
    private String origin;
    private String destination;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private String numbersContact;
    private String comments;
    private Float latOrigin;
    private Float lngOrigin;
    private String addressComponentsOrigin;
    private Float latDestination;
    private Float lngDestination;
    private String addressComponentDestination;

}
