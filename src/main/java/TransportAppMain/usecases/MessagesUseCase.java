package TransportAppMain.usecases;

import TransportAppMain.model.common.HttpStatusEnum;
import TransportAppMain.model.common.Response;
import TransportAppMain.model.messages.Messages;
import TransportAppMain.model.messages.MessagesRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
@RequiredArgsConstructor
public class MessagesUseCase {

    private final MessagesRepository messagesRepository;

    public Response getAllMessagesByUserId(Long idUser, String type){
        try{
            List<Messages> listMessages;

            if(type.equals("enviados")){
                listMessages = messagesRepository.getAllMessagesSendByUserId(idUser);
            }else{
                listMessages = messagesRepository.getAllMessagesReceivedByUserId(idUser);
            }
            return Response.builder().data(listMessages).code(HttpStatusEnum.OK.getCode()).status(Boolean.TRUE)
                    .message("List of messages").build();
        }catch (Exception e){
            return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                    .message("Error getting list of messages").build();
        }
    }

    public Response getMessageById(Long idMessage){
        try{
            return Response.builder().data(messagesRepository.getMessageById(idMessage)).code(HttpStatusEnum.OK.getCode()).status(Boolean.TRUE)
                    .message("Message found successfully").build();
        }catch (Exception e){
            return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                    .message("Error locating the message").build();
        }
    }

    public Response createMessage(Messages message){
        try{
            int create = messagesRepository.createMessage(message);
            if(create == 1){
                return Response.builder().data(Boolean.TRUE).code(HttpStatusEnum.OK.getCode()).status(Boolean.TRUE)
                        .message("Message created successfully").build();
            }else{
                return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                        .message("An error occurred creating the message").build();
            }
        }catch (Exception e){
            return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                    .message("Error creating the message").build();
        }
    }

    public Response updateMessage(Messages message){
        try{
            int update = messagesRepository.updateMessage(message);
            if(update == 1){
                return Response.builder().data(Boolean.TRUE).code(HttpStatusEnum.OK.getCode()).status(Boolean.TRUE)
                        .message("Message successfully updated").build();
            }else{
                return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                        .message("It was not possible to update the message information").build();
            }
        }catch (Exception e){
            return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                    .message("Error updating message information").build();
        }
    }

    public Response deleteMessage(Long idMessage){
        try{
            int delete = messagesRepository.deleteMessage(idMessage);
            if(delete == 1){
                return Response.builder().data(Boolean.TRUE).code(HttpStatusEnum.OK.getCode()).status(Boolean.TRUE)
                        .message("Message deleted successfully").build();
            }else{
                return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                        .message("It was not possible to delete the selected message").build();
            }
        }catch (Exception e){
            return Response.builder().data(null).code(HttpStatusEnum.INTERNAL_SERVER_ERROR.getCode()).status(Boolean.FALSE)
                    .message("Error deleting the message").build();
        }
    }
}
