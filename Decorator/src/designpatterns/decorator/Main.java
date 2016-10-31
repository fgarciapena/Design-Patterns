package designpatterns.decorator;

public class Main {

    public static void main(String[] args) {
        Component c1 = new ConcreteComponent();
        Component c2 = new ConcreteComponent();
        Component c3 = new ConcreteComponent();
        Decorator decoA = new DecoratorA();
        Decorator decoB = new DecoratorB();
        decoA.addComponent(c1);
        decoB.addComponent(c2);
        decoA.addComponent(c3);
        decoB.addComponent(c3);
        c1.operation();
        c2.operation();
        c3.operation();
        decoA.doSomething();
        decoB.doSomething();
        decoA.doSomethingSingleComponent(c3);
        decoB.doSomethingSingleComponent(c3);
    }
}
