package designpatterns.decorator;

public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("I'm a concrete component.");
    }
}
