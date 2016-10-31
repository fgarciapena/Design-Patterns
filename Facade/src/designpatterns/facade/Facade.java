package designpatterns.facade;

public class Facade {
    private static Facade facade;
    private FunctionalityClassA classA;
    private FunctionalityClassB classB;

    public static Facade getInstance(){
        if(facade == null)
            facade = new Facade();
        return facade;
    }

    public void setClassA(FunctionalityClassA classA) {
        this.classA = classA;
    }

    public void setClassB(FunctionalityClassB classB) {
        this.classB = classB;
    }

    public FunctionalityClassA getClassA() {

        return classA;
    }

    public FunctionalityClassB getClassB() {
        return classB;
    }

    public void performClassAOperation() {
        this.getClassA().doOperation();
    }

    public void performClassBOperation() {
        this.getClassB().doOperation();
    }
}
