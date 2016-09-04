package patterns.state;

public class ATMMachine {
    private int tellerId;
    private float availableFunds;
    private ATMState currentState;

    public ATMMachine(int tellerId, float availableFunds, ATMState currentState){
        this.setTellerId(tellerId);
        this.setAvailableFunds(availableFunds);
        this.setCurrentState(currentState);
    }

    public void performExtraction(User user, float funds) throws IllegalOperationException{
        try {
            if(user.getBalance() - funds >= 0)
                user.setBalance(user.getBalance() + currentState.extractFunds(user, this, funds));
            else
                throw new IllegalOperationException("You lack the funds to perform this operation.");
        }catch(NotEnoughFundsException exception){
            System.out.println(exception.toString());
        }
    }

    public ATMState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(ATMState currentState) {
        this.currentState = currentState;
    }

    public int getTellerId() {
        return tellerId;
    }

    public void setTellerId(int tellerId) {
        this.tellerId = tellerId;
    }

    public float getAvailableFunds() {
        return availableFunds;
    }

    public void setAvailableFunds(float availableFunds) {
        this.availableFunds = availableFunds;
    }
}
