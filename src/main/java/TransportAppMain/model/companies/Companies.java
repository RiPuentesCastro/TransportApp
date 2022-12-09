package TransportAppMain.model.companies;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Companies {

    private Long idCompany;
    private String name;
    private String address;
    private String city;
    private int creditScore;
    private int daysToPay;
    private int pickUpDate;
    private String email;
    private Long userId;
}
