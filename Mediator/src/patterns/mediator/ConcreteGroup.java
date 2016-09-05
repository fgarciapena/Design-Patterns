package patterns.mediator;

import java.util.List;
// This is the mediator implementation.
public class ConcreteGroup implements Group {
    private List<User> users;

    public ConcreteGroup(List<User> users) {
        this.users = users;
    }

    public void send(String message, User user) {
        this.getUsers().stream().filter(u -> u != user).forEach(u -> u.read(message));
    }

    public void addUser(User user) {
        this.getUsers().add(user);
    }

    public void removeUser(User user) {
        this.getUsers().remove(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
