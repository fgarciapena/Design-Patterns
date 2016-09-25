package patterns.abstractfactory;

public class ProductB2 extends ProductB {
    public ProductB2() {
        super();
    }

    public ProductB2(String name) {
        super(name);
    }

    public void sayHi() {
        System.out.println("Hi, I'm a ProductB2 and my name is: " + this.getName());
    }
}
