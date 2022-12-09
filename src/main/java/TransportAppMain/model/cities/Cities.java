package TransportAppMain.model.cities;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cities {

    private Long idCity;
    private String alfa2;
    private String name;
    private int number;
    private String alfa3;
}
