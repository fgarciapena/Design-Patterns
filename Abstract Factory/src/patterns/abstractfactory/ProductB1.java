package patterns.abstractfactory;

public class ProductB1 extends ProductB {
    public ProductB1() {
        super();
    }

    public ProductB1(String name) {
        super(name);
    }

    public void sayHi() {
        System.out.println("Hi, I'm a ProductB1 and my name is: " + this.getName());
    }
}
