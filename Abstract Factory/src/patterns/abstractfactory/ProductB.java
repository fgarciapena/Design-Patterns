package patterns.abstractfactory;

/**
 * Created by juanamari on 9/25/16.
 */
public abstract class ProductB {
    private String name;

    public abstract void sayHi();

    public ProductB(){
        this.setName("none");
    }

    public ProductB(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
