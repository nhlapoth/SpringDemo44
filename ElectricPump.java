package springdemo3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ElectricPump implements Pump{

    @Override
    @Primary
    public void features() {
        System.out.println("This pump is an "
                + "electric pump");
    }    
}
