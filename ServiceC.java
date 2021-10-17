package springdemo3;
import org.springframework.stereotype.Component;

@Component //This is a bean
public class ServiceC implements Service{

    @Override
    public void doSomething() {
        System.out.println("We have a electric pump running here");
    }    
}
