package patterns.factory;

public interface Factory {
    ProductA createProductA();
    ProductA createProductA(String msg);
    ProductB createProductB();
    ProductB createProductB(String msg);
}
