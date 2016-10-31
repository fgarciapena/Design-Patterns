package designpatterns.facade;

public class Main {

    public static void main(String[] args) {
        FunctionalityClassA classA = new FunctionalityClassA();
        FunctionalityClassB classB = new FunctionalityClassB();
	    Facade facade = Facade.getInstance();
        facade.setClassA(classA);
        facade.setClassB(classB);
        UserClassA userA = new UserClassA();
        UserClassB userB = new UserClassB();
        userA.request(facade);
        userB.request(facade);
    }
}
