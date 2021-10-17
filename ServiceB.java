package springdemo3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //This is a bean
public class ServiceB implements Service{
    @Autowired  
    @Qualifier("electricpump")      
    private Pump mPump; 
    
    public Pump getMpump() {
        return mPump;
    }
    public void setMpump(Pump mPump) {
        this.mPump = mPump;
    }

    public void doSomething() {
        System.out.println("We have a water"
                + " pump running here");
        mPump.features();
    }    
}
