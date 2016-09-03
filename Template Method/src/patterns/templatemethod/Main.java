package patterns.templatemethod;

public class Main {

    public static void main(String[] args) {
	    Account savingsAccount = new SavingsAccount(1, 500);
        Account checkingAccount = new CheckingAccount(2, 1000);

        savingsAccount.depositFunds(200);
        checkingAccount.extractFunds(200);

        try{
            savingsAccount.transfer(checkingAccount, 700);
        }catch(InvalidOperationException e){
            System.out.println(e.toString());
        }

        try{
            savingsAccount.transfer(checkingAccount, 400);
        }catch(InvalidOperationException e){
            System.out.println(e.toString());
        }

        System.out.println(savingsAccount.getBalance());

        try{
            checkingAccount.transfer(savingsAccount, 1000);
        }catch(InvalidOperationException e){
            System.out.println(e.toString());
        }

        try{
            checkingAccount.transfer(savingsAccount, 600);
        }catch(InvalidOperationException e){
            System.out.println(e.toString());
        }

        System.out.println(checkingAccount.getBalance());

    }
}
