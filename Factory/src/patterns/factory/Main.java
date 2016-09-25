package patterns.factory;

public class Main {

    public static void main(String[] args) {
        ConcreteFactory.getInstance().createProductA().sayHi();
        ConcreteFactory.getInstance().createProductA("Robert").sayHi();
        ConcreteFactory.getInstance().createProductB().sayHi();
        ConcreteFactory.getInstance().createProductB("Norbert").sayHi();
    }
}
