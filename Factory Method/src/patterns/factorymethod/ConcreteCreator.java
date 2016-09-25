package patterns.factorymethod;

/**
 * Created by juanamari on 9/25/16.
 */
public class ConcreteCreator implements Creator {
    // In this case it creates a single product, because this is a factory method. Factory creates several different
    // objects.
    public Product createProduct() {
        return new ConcreteProduct();
    }
}
