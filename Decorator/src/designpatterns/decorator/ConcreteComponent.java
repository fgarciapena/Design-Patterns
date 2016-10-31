package designpatterns.decorator;

public class ConcreteComponent implements Component {
    public void operation() {
        System.out.println("I'm an operation, and I'm not sure if I like trains.");
    }
}
