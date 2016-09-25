package patterns.factory;

public abstract class Product {
    private String name;

    public abstract void sayHi();

    public Product(){
        this.setName("none");
    }
    public Product(String name){
        this.setName(name);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
