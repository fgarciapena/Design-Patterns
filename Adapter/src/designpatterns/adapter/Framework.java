package designpatterns.adapter;

public class Framework {
    Adapter adapter;

    public Framework() {
        this.adapter = new Adapter();
    }

    public void performOperation() {
        this.adapter.operation();
    }
}
