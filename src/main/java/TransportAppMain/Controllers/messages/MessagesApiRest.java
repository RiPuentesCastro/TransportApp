package TransportAppMain.Controllers.messages;

import TransportAppMain.model.common.Response;
import TransportAppMain.model.messages.Messages;
import TransportAppMain.usecases.MessagesUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;

@RestController
@RequestMapping(path="/api")
@AllArgsConstructor
public class MessagesApiRest {

    private final MessagesUseCase messagesUseCase;

    @GetMapping("/messages/getAllMessagesByUserId/{idUser}/{type}")
    public Response getAllMessagesByUserId(@PathVariable Long idUser, @PathVariable String type) {
        String typeDecode = new String(Base64.getDecoder().decode(type));
        return messagesUseCase.getAllMessagesByUserId(idUser, typeDecode);
    }

    @GetMapping("/messages/getMessageById/{idMessage}")
    public Response getMessageById(@PathVariable Long idMessage) {
        return messagesUseCase.getMessageById(idMessage);
    }

    @PostMapping("/messages/postMessage")
    public Response createMessage(@RequestBody Messages message) {
        return messagesUseCase.createMessage(message);
    }

    @PostMapping("/messages/updateMessage")
    public Response updateMessage(@RequestBody Messages message) {
        return messagesUseCase.updateMessage(message);
    }

    @DeleteMapping("/messages/deleteMessage/{idMessage}")
    public Response deleteMessage(@PathVariable Long idMessage) {
        return messagesUseCase.deleteMessage(idMessage);
    }
}
