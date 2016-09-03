package patterns.strategy;

public interface Transferable{
    void transfer(Account emitterAccount, Account targetAccount, float funds) throws IllegalOperationException;
    float calculateCommission(float funds);
}
