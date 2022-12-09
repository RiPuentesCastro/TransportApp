package TransportAppMain.jpa.notifications;

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
public interface NotificationsERepository extends CrudRepository<NotificationsEntity, Long>, QueryByExampleExecutor<NotificationsEntity> {

    @Query(value = "SELECT * FROM `notifications` WHERE user_show = :idUser ORDER BY id_notifications;", nativeQuery = true)
    List<NotificationsEntity> getAllNotificationsByUserId(@Param("idUser") Long idUser);

    @Query(value = "SELECT * FROM `notifications` WHERE `notifications`.`id_notifications` = :idNotification ORDER BY id_notifications ;", nativeQuery = true)
    NotificationsEntity getNotificationById(@Param("idNotification") Long idNotification);

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO `notifications` (`type_notification`, `user_show`, `message`, `type_users`, `date_notification`, `status`) " +
            "VALUES ( :typeNotification , :userShow , :message , :typeUsers , :dateNotification , :status );", nativeQuery = true)
    int createNotification(@Param("typeNotification") String typeNotification, @Param("userShow") Long userShow, @Param("message") String message,
                           @Param("typeUsers") String typeUsers, @Param("dateNotification") LocalDate dateNotification, @Param("status") String status);

    @Transactional
    @Modifying
    @Query(value = "UPDATE `notifications` SET `type_notification` = :typeNotification , `user_show` = :userShow , " +
            "`message` = :message , `type_users` = :typeUsers , `date_notification` = :dateNotification, " +
            "`status` = :status WHERE `notifications`.`id_notifications` = :idNotification ;", nativeQuery = true)
    int updateNotification(@Param("idNotification") Long idNotification, @Param("typeNotification") String typeNotification, @Param("userShow") Long userShow,
                           @Param("message") String message, @Param("typeUsers") String typeUsers, @Param("dateNotification") LocalDate dateNotification,
                           @Param("status") String status);

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM `notifications` WHERE id_notifications = :idNotification ;", nativeQuery = true)
    int deleteNotification(@Param("idNotification") Long idNotification);
}