package patterns.abstractfactory;

public class Main {

    public static void main(String[] args) {
        AbstractFactory product1Factory = ConcreteFactory1.getInstance();
        AbstractFactory product2Factory = ConcreteFactory2.getInstance();
        product1Factory.createProductA().sayHi();
        product1Factory.createProductA("A1Test").sayHi();
        product1Factory.createProductB().sayHi();
        product1Factory.createProductB("B1Test").sayHi();
        product2Factory.createProductA().sayHi();
        product2Factory.createProductA("A2Test").sayHi();
        product2Factory.createProductB().sayHi();
        product2Factory.createProductB("B2Test").sayHi();
    }
}
