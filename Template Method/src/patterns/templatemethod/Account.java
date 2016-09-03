package patterns.templatemethod;

public abstract class Account {
    private float balance;
    private int accountId;

    public Account(float balance, int accountId) {
        this.setBalance(balance);
        this.setAccountId(accountId);
    }

    public abstract float calculateCommission(float amount);

    public final void transfer(Account account, float amount) throws InvalidOperationException {
        float finalAmount = this.getBalance() - (amount + this.calculateCommission(amount));
        if(finalAmount < 0) {
            throw new InvalidOperationException("Not enough funds for this transaction.");
        }else{
            this.setBalance(finalAmount);
            account.setBalance(account.getBalance() + amount);
        }
    }

    public void extractFunds(float amount){
        this.setBalance(this.getBalance() - amount);
    }

    public void depositFunds(float amount){
        this.setBalance(this.getBalance() + amount);
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
}
