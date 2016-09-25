package patterns.factorymethod;

public class Main {

    public static void main(String[] args) {
	    Creator creator = new ConcreteCreator();
        Product product = creator.createProduct();
        product.sayHi();
    }
}
