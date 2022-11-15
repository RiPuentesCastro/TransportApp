package TransportAppMain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(scanBasePackages={"TransportAppMain","TransportAppMain.Controllers"})
public class TransportAppMainClass {

    public static void main(String[] args) {
        SpringApplication.run(TransportAppMainClass.class,args);
    }
}
