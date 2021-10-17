package springdemo3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //This is a bean
public class ClientA implements Client{
    @Autowired //Tell spring that Computer is a dependancy
    @Qualifier("desktop") //This gives preferrence to lapto object
    private Computer comp;
    public Computer getComp() {
        return comp;
    }
    public void setComp(Computer comp) {
        this.comp = comp;
    }    
    public void doSomething(){
        System.out.println("I called ClientA "
                + "doSomething function");
        comp.features();
    } 
}
