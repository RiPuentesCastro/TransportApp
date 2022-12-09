package TransportAppMain;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


@Configuration
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class JpaConfig {

    @Bean
    public DataSource datasource() {
        return DataSourceBuilder.create()
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .url("jdbc:mysql://192.168.80.23:13306/transportapp")
                .username("transportapp")
                .password("TransPortApp2022*")
                .build();
    }

}