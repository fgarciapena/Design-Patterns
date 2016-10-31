package designpatterns.facade;

/**
 * Created by juanamari on 10/30/16.
 */
public class UserClassB implements Request {
    public void request(Facade facade) {
        System.out.println("I'm User Class B and I'm requesting something.");
        facade.performClassBOperation();
    }
}
