package springdemo3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class WaterPump implements Pump{

    @Override    
    public void features() {
        System.out.println("This pump is pumping"
                + " water");
    }    
}
