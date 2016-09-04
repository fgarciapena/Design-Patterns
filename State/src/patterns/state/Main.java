package patterns.state;

public class Main {

    public static void main(String[] args) {
        User user = new User(1, 1000);
        ATMMachine teller = new ATMMachine(1, 1000, new ATMNotEmpty());
        user.extractMoneyFromATM(teller, 1500);
        user.extractMoneyFromATM(teller, 1000);
        user.extractMoneyFromATM(teller, 1);
        System.out.println(user.getBalance());
    }
}
