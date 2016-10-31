package designpatterns.decorator;

import java.util.List;

public class DecoratorA extends Decorator {
    public DecoratorA() {
        super();
    }

    public void doSomething() {
        for (Component c : this.getComponents())
            System.out.println("I really like trains.");
    }

    public void doSomethingSingleComponent(Component c) {
        System.out.println("I really like to look at trains by myself.");
    }
}
