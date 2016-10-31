package designpatterns.decorator;

import java.util.ArrayList;
import java.util.List;

public abstract class Decorator {
    private List<Component> components;

    public Decorator() {
        this.components = new ArrayList<Component>();
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

    public void addComponent(Component c) {
        components.add(c);
    }

    public void removeComponent(Component c) {
        components.remove(c);
    }

    public abstract void doSomething();

    public abstract void doSomethingSingleComponent(Component c);
}
