package springdemo3;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("springdemo3") //This tells the configuration of where all all components are, which is the package
public class AppConfig {

}
