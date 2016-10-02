package patterns.builder;

public class Main {

    public static void main(String[] args) {
	    CreditCardBuilder builder1 = new CreditCardBuilder();
        CreditCardBuilder builder2 = new CreditCardBuilder();
        CreditCard card1 = builder1.addNumber(1000).addOwner("George Lopez").build();
        System.out.println(card1.getNumber() + " " + card1.getOwner());
        CreditCard card2 = builder2.addNumber(1234).addOwner("George Benitez").addLimit(9999).build();
        System.out.println(card2.getNumber() + " " + card2.getOwner() + " " + card2.getLimit());
    }
}
