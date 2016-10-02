package patterns.builder;

public class CreditCardBuilder {
    private CreditCard card;

    public CreditCardBuilder() {
        card = new CreditCard();
    }

    public CreditCardBuilder addNumber(int num) {
        card.setNumber(num);
        return this;
    }

    public CreditCardBuilder addOwner(String owner) {
        card.setOwner(owner);
        return this;
    }

    public CreditCardBuilder addLimit(float limit) {
        card.setLimit(limit);
        return this;
    }

    public CreditCard build(){
        return card;
    }
}
