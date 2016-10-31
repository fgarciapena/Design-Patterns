package designpatterns.decorator;

import java.util.List;

public class DecoratorB extends Decorator{
    public DecoratorB() {
        super();
    }

    public void doSomething() {
        for (Component c : this.getComponents())
            System.out.println("I really like trucks.");
    }

    public void doSomethingSingleComponent(Component c) {
        System.out.println("I really like to look at trucks by myself.");
    }
}
