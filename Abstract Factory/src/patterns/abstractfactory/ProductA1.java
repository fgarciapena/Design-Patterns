package patterns.abstractfactory;

public class ProductA1 extends ProductA{
    public ProductA1() {
        super();
    }

    public ProductA1(String name) {
        super(name);
    }

    public void sayHi(){
        System.out.println("Hi, I'm a ProductA1 and my name is: " + this.getName());
    }
}
