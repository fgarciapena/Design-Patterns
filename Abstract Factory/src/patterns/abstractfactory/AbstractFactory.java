package patterns.abstractfactory;

public interface AbstractFactory {
    ProductA createProductA();
    ProductA createProductA(String msg);
    ProductB createProductB();
    ProductB createProductB(String msg);
}