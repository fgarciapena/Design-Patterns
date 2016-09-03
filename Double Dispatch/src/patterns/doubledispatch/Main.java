package patterns.doubledispatch;

public class Main {

    public static void main(String[] args) {
	    Element e1 = new Rock();
        Element e2 = new Scissors();
        Element e3 = new Paper();
        System.out.println("Rock");
        e1.play(e1);
        e1.play(e2);
        e1.play(e3);
        System.out.println("Scissors");
        e2.play(e1);
        e2.play(e2);
        e2.play(e3);
        System.out.println("Paper");
        e3.play(e1);
        e3.play(e2);
        e3.play(e3);
    }
}
