package patterns.mediator;
// This is the Mediator interface.
public interface Group {
    void send(String message, User user);
    void addUser(User user);
    void removeUser(User user);
}
