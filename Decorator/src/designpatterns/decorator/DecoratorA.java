package designpatterns.decorator;

public class DecoratorA extends Decorator implements Component{

    public DecoratorA(Component component) {
        super(component);
    }

    public void operation() {
        super.getComponent().operation();
        System.out.println("I'm Decorator A and I added something to the one above me.");
    }
}
