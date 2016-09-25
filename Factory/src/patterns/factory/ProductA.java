package patterns.factory;

public class ProductA extends Product {
    public ProductA(){
        super();
    }
    public ProductA(String name){
        super(name);
    }
    @Override
    public void sayHi() {
        System.out.println("Hi, I'm Product A and my name is: " + this.getName());
    }
}
