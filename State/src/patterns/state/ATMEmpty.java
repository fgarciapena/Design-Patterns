package patterns.state;

public class ATMEmpty implements ATMState{
    public float extractFunds(User user, ATMMachine teller, float funds) throws NotEnoughFundsException {
        throw new NotEnoughFundsException("This machine has no funds.");
    }
}
