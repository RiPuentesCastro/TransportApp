package TransportAppMain;

import TransportAppMain.model.cities.CitiesRepository;
import TransportAppMain.model.companies.CompaniesRepository;
import TransportAppMain.model.loads.LoadsRepository;
import TransportAppMain.model.messages.MessagesRepository;
import TransportAppMain.model.notifications.NotificationsRepository;
import TransportAppMain.model.trucks.TrucksRepository;
import TransportAppMain.model.users.UsersRepository;
import TransportAppMain.usecases.*;
import org.reactivecommons.utils.ObjectMapperImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public ObjectMapperImp createObjectMapper() {
        return new ObjectMapperImp();
    }

    @Bean
    public CitiesUseCase createGamesUseCase(CitiesRepository citiesRepository){
        return new CitiesUseCase(citiesRepository);
    }

    @Bean
    public CompaniesUseCase createCompaniesUseCase(CompaniesRepository companiesRepository){
        return new CompaniesUseCase(companiesRepository);
    }

    @Bean
    public LoadsUseCase createPlayersUseCase(LoadsRepository loadsRepository){
        return new LoadsUseCase(loadsRepository);
    }

    @Bean
    public MessagesUseCase createMessageUseCase(MessagesRepository messagesRepository){
        return new MessagesUseCase(messagesRepository);
    }

    @Bean
    public NotificationsUseCase createTournamentUseCase(NotificationsRepository notificationsRepository){
        return new NotificationsUseCase(notificationsRepository);
    }

    @Bean
    public TrucksUseCase createTrucksUseCase(TrucksRepository trucksRepository){
        return new TrucksUseCase(trucksRepository);
    }

    @Bean
    public UsersUseCase createUsersUseCase(UsersRepository usersRepository){
        return new UsersUseCase(usersRepository);
    }

}
