package TransportAppMain.model.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum HttpStatusEnum {
    OK(200),
    ACCEPTED(202),
    UNAUTHORIZED(401),
    NOT_ACCEPTABLE(406),
    INTERNAL_SERVER_ERROR(500);

    private final int code;

}
