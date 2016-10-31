package designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {
    private List<Component> components;

    public Folder(String name) {
        super(name);
        this.components = new ArrayList<Component>();
    }

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    public void open() {
        System.out.println("I'm a Folder and I'm open.");
    }

    public void close() {
        System.out.println("I'm a Folder and now I'm closed.");
    }

    public void rename(String name) {
        this.setName(name);
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }
}
