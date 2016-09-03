package patterns.templatemethod;

public class SavingsAccount extends Account{

    public SavingsAccount(int accountId, float balance){
        super(balance, accountId);
    }

    @Override
    public float calculateCommission(float amount) {
        return 1;
    }
}
