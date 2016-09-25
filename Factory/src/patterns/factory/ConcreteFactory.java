package patterns.factory;

public class ConcreteFactory implements Factory{
    private static ConcreteFactory instance;

    private ConcreteFactory(){}

    public static ConcreteFactory getInstance(){
        if(instance == null)
            instance = new ConcreteFactory();
        return instance;
    }

    public ProductA createProductA() {
        return new ProductA();
    }

    public ProductA createProductA(String msg) {
        return new ProductA(msg);
    }

    public ProductB createProductB() {
        return new ProductB();
    }

    public ProductB createProductB(String msg) {
        return new ProductB(msg);
    }
}
