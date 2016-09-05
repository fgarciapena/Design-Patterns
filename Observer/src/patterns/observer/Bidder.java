package patterns.observer;

public interface Bidder {
    void bid(Auction auction);
    float getMaximum();
    void setMaximum(float amount);
}
