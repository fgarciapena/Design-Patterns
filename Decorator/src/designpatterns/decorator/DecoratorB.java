package designpatterns.decorator;

public class DecoratorB extends Decorator implements Component {
    public DecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("I'm Decorator B and I added something to the one above me.");
    }
}
