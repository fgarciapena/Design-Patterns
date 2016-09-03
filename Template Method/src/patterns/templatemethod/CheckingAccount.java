package patterns.templatemethod;

public class CheckingAccount extends Account{

    public CheckingAccount(int accountId, float balance){
        super(balance, accountId);
    }

    @Override
    public float calculateCommission(float amount) {
        return (float) (amount*0.01);
    }
}
