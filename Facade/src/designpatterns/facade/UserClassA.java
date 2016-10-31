package designpatterns.facade;

/**
 * Created by juanamari on 10/30/16.
 */
public class UserClassA implements Request {
    public void request(Facade facade) {
        System.out.println("I'm User Class A and I'm requesting something.");
        facade.performClassAOperation();
    }
}
