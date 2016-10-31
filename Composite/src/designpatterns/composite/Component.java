package designpatterns.composite;

public abstract class Component {
    private String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void open();
    public abstract void close();
    public abstract void rename(String name);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Hi! I'm " + this.getName();
    }
}
