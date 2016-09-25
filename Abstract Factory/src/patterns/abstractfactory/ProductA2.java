package patterns.abstractfactory;

public class ProductA2 extends ProductA{
    public ProductA2() {
        super();
    }

    public ProductA2(String name) {
        super(name);
    }

    public void sayHi() {
        System.out.println("Hi, I'm a ProductA2 and my name is: " + this.getName());
    }
}
