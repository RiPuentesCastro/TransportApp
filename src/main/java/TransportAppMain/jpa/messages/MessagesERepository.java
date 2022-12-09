package TransportAppMain.jpa.messages;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface MessagesERepository extends CrudRepository<MessagesEntity, Long>, QueryByExampleExecutor<MessagesEntity> {

    @Query(value = "SELECT * FROM `messages` WHERE `messages`.`user_from` = :idUser ORDER BY id_message ;", nativeQuery = true)
    List<MessagesEntity> getAllMessagesSendByUserId(@Param("idUser") Long idUser);

    @Query(value = "SELECT * FROM `messages` WHERE `messages`.`user_to` = :idUser ORDER BY id_message ;", nativeQuery = true)
    List<MessagesEntity> getAllMessagesReceivedByUserId(@Param("idUser") Long idUser);

    @Query(value = "SELECT * FROM `messages` WHERE `messages`.`id_message` = :idMessage ORDER BY id_message ;", nativeQuery = true)
    MessagesEntity getMessageById(@Param("idMessage") Long idMessage);

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO `messages` (`date_send`, `content`, `user_to`, `user_from`, `status`) " +
            "VALUES ( :dateSend , :content , :userTo , :userFrom , :status );", nativeQuery = true)
    int createMessage(@Param("dateSend") LocalDate dateSend, @Param("content") String content, @Param("userTo") Long userTo, @Param("userFrom") Long userFrom,
                    @Param("status") String status);

    @Transactional
    @Modifying
    @Query(value = "UPDATE `messages` SET `date_send` = :dateSend , `content` = :content , `user_to` = :userTo , `user_from` = :userFrom , `status` = :status " +
            " WHERE `messages`.`id_message` = :idMessage ;", nativeQuery = true)
    int updateMessage(@Param("idMessage") Long idMessage,  @Param("dateSend") LocalDate dateSend, @Param("content") String content, @Param("userTo") Long userTo,
                      @Param("userFrom") Long userFrom, @Param("status") String status);

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM `messages` WHERE id_message = :idMessage ;", nativeQuery = true)
    int deleteMessage(@Param("idMessage") Long idMessage);
}
