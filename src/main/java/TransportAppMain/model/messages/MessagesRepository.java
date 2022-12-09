package TransportAppMain.model.messages;

import java.util.List;

public interface MessagesRepository {
    List<Messages> getAllMessagesSendByUserId(Long idUser);
    List<Messages> getAllMessagesReceivedByUserId(Long idUser);
    Messages getMessageById(Long idMessage);
    int createMessage(Messages message);
    int updateMessage(Messages message);
    int deleteMessage(Long idMessage);
}
