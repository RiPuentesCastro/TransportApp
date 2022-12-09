package TransportAppMain.model.common;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Response {

    private Object data;
    private boolean status;
    private String message;
    private int code;
}
