package patterns.abstractfactory;

public abstract class ProductA {
    private String name;

    public abstract void sayHi();

    public ProductA(){
        this.name = "none";
    }

    public ProductA(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
