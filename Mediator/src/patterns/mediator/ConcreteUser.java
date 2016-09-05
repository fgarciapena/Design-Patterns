package patterns.mediator;

public class ConcreteUser implements User {
    private Group group;

    public ConcreteUser(Group group) {
        this.group = group;
    }

    public void write(String message) {
        group.send(message, this);
    }

    public void read(String message) {
        System.out.println(message);
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
