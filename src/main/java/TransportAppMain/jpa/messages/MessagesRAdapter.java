package TransportAppMain.jpa.messages;

import TransportAppMain.jpa.helper.AdapterOperations;
import TransportAppMain.model.messages.Messages;
import TransportAppMain.model.messages.MessagesRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessagesRAdapter extends AdapterOperations<Messages, MessagesEntity, Long, MessagesERepository> implements MessagesRepository {

    public MessagesRAdapter(MessagesERepository repository, ObjectMapper mapper){
        super(repository, mapper, d -> mapper.mapBuilder(d, Messages.MessagesBuilder.class).build(), 3600);
    }

    @Override
    public List<Messages> getAllMessagesSendByUserId(Long idUser){
        return toList(repository.getAllMessagesSendByUserId(idUser));
    }

    @Override
    public List<Messages> getAllMessagesReceivedByUserId(Long idUser){
        return toList(repository.getAllMessagesReceivedByUserId(idUser));
    }

    @Override
    public Messages getMessageById(Long idMessage){
        return toEntity(repository.getMessageById(idMessage));
    }

    @Override
    public int createMessage(Messages message){
        return repository.createMessage(message.getDateSend(), message.getContent(), message.getUserTo(), message.getUserFrom(), message.getStatus());
    }

    @Override
    public int updateMessage(Messages message){
        return repository.updateMessage(message.getIdMessage(), message.getDateSend(), message.getContent(), message.getUserTo(), message.getUserFrom(), message.getStatus());
    }

    @Override
    public int deleteMessage(Long idMessage){
        return repository.deleteMessage(idMessage);
    }
}
