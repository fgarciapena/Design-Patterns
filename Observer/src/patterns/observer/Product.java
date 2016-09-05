package patterns.observer;

public class Product {
    private String productName;
    private float baseCost;

    public Product(String productName, float baseCost) {
        this.setProductName(productName);
        this.setBaseCost(baseCost);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(float baseCost) {
        this.baseCost = baseCost;
    }
}
