package patterns.doubledispatch;

public class Scissors implements Element{
    @Override
    public void play(Paper paper) {
        System.out.println("Scissors win.");
    }

    @Override
    public void play(Rock rock) {
        System.out.println("Rock wins.");
    }

    @Override
    public void play(Scissors scissors) {
        System.out.println("It's a tie.");
    }

    @Override
    public void play(Element element) {
        element.play(this);
    }
}
