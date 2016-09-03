package patterns.strategy;

public class SavingsAccount implements Transferable{

    public void transfer(Account emitterAccount, Account targetAccount, float funds) throws IllegalOperationException{
        float fundsAfterTransfer = emitterAccount.getBalance() - (funds + this.calculateCommission(funds));
        if(fundsAfterTransfer < 0){
            throw new IllegalOperationException("You have insufficient funds for this transference.");
        }else{
            targetAccount.depositFunds(funds);
            emitterAccount.extractFunds(funds + this.calculateCommission(funds));
        }
    }

    public float calculateCommission(float funds) {
        return 1;
    }
}
