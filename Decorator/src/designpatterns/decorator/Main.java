package designpatterns.decorator;

public class Main {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Decorator decoa = new DecoratorA(component);
        Decorator decob = new DecoratorB(decoa);
        Decorator decoa2 = new DecoratorA(decob);
        decoa2.operation();
    }
}
