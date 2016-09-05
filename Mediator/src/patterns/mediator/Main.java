package patterns.mediator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Group group = new ConcreteGroup(new ArrayList<User>());
        User user1 = new ConcreteUser(group);
        User user2 = new ConcreteUser(group);
        User user3 = new ConcreteUser(group);
        group.addUser(user1);
        group.addUser(user2);
        group.addUser(user3);
        user1.write("Hi, I'm user 1.");
        user2.write("Hi, I'm user 2.");
        user3.write("Hi, I'm user 3.");
    }
}
