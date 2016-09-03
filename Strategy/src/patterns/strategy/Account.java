package patterns.strategy;

public class Account {
    private float balance;
    private int accountId;
    private Transferable accountType;

    public Account(float balance, int accountId, Transferable accountType){
        this.setBalance(balance);
        this.setAccountId(accountId);
        this.setAccountType(accountType);
    }

    public void setAccountId(int id){
        this.accountId = id;
    }

    public int getAccountId(){
        return this.accountId;
    }

    public float getBalance(){
        return this.balance;
    }

    public void setBalance(float funds){
        this.balance = funds;
    }

    public void setAccountType(Transferable accountType){
        this.accountType = accountType;
    }

    public Transferable getAccountType(){
        return this.accountType;
    }

    public void extractFunds(float funds) throws IllegalOperationException{
        if(this.getBalance() - funds < 0){
            throw new IllegalOperationException("You have insufficient funds for this extraction.");
        }else{
            this.setBalance(this.getBalance() - funds);
        }
    }

    public void depositFunds(float funds){
        this.setBalance(this.getBalance() + funds);
    }

    public void transfer(Account targetAccount, float funds) throws IllegalOperationException{
        this.getAccountType().transfer(this, targetAccount, funds);
    }
}
