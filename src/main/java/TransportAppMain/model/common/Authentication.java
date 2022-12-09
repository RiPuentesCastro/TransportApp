package TransportAppMain.model.common;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Authentication {

    private String username;
    private String password;
}
