package designpatterns.adapter;

public class Adapter {
    Adaptee adaptee;

    public Adapter() {
        this.adaptee = new Adaptee();
    }

    public void operation(){
        adaptee.adaptedOperation();
    }
}
