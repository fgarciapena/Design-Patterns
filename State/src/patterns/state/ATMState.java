package patterns.state;

public interface ATMState {
    float extractFunds(User user, ATMMachine teller, float funds) throws NotEnoughFundsException;
}
