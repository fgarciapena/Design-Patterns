package patterns.abstractfactory;

public class ConcreteFactory2 implements AbstractFactory {
    private static ConcreteFactory2 ourInstance = new ConcreteFactory2();

    public static ConcreteFactory2 getInstance() {
        return ourInstance;
    }

    private ConcreteFactory2() {
    }

    public ProductA createProductA() {
        return new ProductA2();
    }

    public ProductB createProductB() {
        return new ProductB2();
    }

    public ProductA createProductA(String msg) {
        return new ProductA2(msg);
    }

    public ProductB createProductB(String msg) {
        return new ProductB2(msg);
    }
}
