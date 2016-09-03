package patterns.strategy;

public class Main {

    public static void main(String[] args) {
	    Account account1 = new Account(500, 1, new SavingsAccount());
        Account account2 = new Account(1000, 2, new CheckingAccount());

        account1.depositFunds(200);
        account2.depositFunds(200);

        try{
            account1.transfer(account2, 700);
        }catch(IllegalOperationException e){
            System.out.println(e.toString());
        }

        try{
            account1.transfer(account2, 400);
        }catch(IllegalOperationException e){
            System.out.println(e.toString());
        }

        System.out.println(account1.getBalance());

        try{
            account2.transfer(account1, 1000);
        }catch(IllegalOperationException e){
            System.out.println(e.toString());
        }

        try{
            account2.transfer(account1, 600);
        }catch(IllegalOperationException e){
            System.out.println(e.toString());
        }

        System.out.println(account2.getBalance());
    }
}
