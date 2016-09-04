package patterns.state;

public class User {
    private int userId;
    private float balance;

    public User(int userId, float balance){
        this.setUserId(userId);
        this.setBalance(balance);
    }

    public void extractMoneyFromATM(ATMMachine teller, float funds){
        try {
            teller.performExtraction(this, funds);
        }catch(IllegalOperationException exception){
            System.out.println(exception.toString());
        }
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
