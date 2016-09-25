package patterns.abstractfactory;

public class ConcreteFactory1 implements AbstractFactory {
    private static ConcreteFactory1 ourInstance = new ConcreteFactory1();

    public static ConcreteFactory1 getInstance() {
        return ourInstance;
    }

    private ConcreteFactory1() {
    }

    public ProductA createProductA() {
        return new ProductA1();
    }

    public ProductB createProductB() {
        return new ProductB1();
    }

    public ProductA createProductA(String msg) {
        return new ProductA1(msg);
    }

    public ProductB createProductB(String msg) {
        return new ProductB1(msg);
    }
}
