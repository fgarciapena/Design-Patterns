package patterns.doubledispatch;

public interface Element {
    public void play(Paper paper);
    public void play(Rock rock);
    public void play(Scissors scissors);
    public void play(Element element);
}
