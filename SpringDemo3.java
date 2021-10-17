package springdemo3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Here I'm not using XML configuration and using 
 * Singleton Design Pattern
 */
public class SpringDemo3 {

    public static void main(String[] args) {        
        /* What are the beans  * What are the dependencies of these beans
         * Where to search for these beans*/
        
       ApplicationContext context = 
               new  AnnotationConfigApplicationContext(AppConfig.class);
       /* This mothod is without using the AutoWire Spring feature to identify dependancies
       Laptop l1  = context.getBean(Laptop.class);
       ClientA mCliientA = context.getBean(ClientA.class);
       mCliientA.setComp(l1);
       mCliientA.doSomething();*/
       
       //Second approache is after wiring Computer inside Client bean
       //ClientA mCliientA = context.getBean(ClientA.class);
       //mCliientA.doSomething();
       ServiceB mServiceB = context.getBean(ServiceB.class);
       mServiceB.doSomething();
     
    }    
}