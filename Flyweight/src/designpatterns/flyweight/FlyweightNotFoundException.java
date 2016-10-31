package designpatterns.flyweight;

public class FlyweightNotFoundException extends Exception {
    public FlyweightNotFoundException() {
    }

    public FlyweightNotFoundException(String message) {
        super(message);
    }
}
