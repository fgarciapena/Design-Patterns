package patterns.factory;

public class ProductB extends Product {
    public ProductB(){
        super();
    }
    public ProductB(String name){
        super(name);
    }
    @Override
    public void sayHi() {
        System.out.println("Hi, I'm product B and my name is: " + this.getName());
    }
}
