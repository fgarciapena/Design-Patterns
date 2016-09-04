package patterns.state;

public class ATMNotEmpty implements ATMState{
    public float extractFunds(User user, ATMMachine teller, float funds) throws NotEnoughFundsException {
        if(teller.getAvailableFunds() - funds < 0){
            throw new NotEnoughFundsException("This ATM lacks the funds to perform this operation.");
        }else if(teller.getAvailableFunds() - funds == 0){
            teller.setAvailableFunds(0);
            teller.setCurrentState(new ATMEmpty());
        }else{
            teller.setAvailableFunds(teller.getAvailableFunds() - funds);
        }

        return funds;
    }
}
