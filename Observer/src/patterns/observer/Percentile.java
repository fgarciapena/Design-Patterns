package patterns.observer;

public class Percentile implements Bidder {
    private float maximum;

    public Percentile(float amount){
        this.setMaximum(amount);
    }

    public void bid(Auction auction) {
        try {
            auction.buy(this, (float) (auction.getMaximumBid() + auction.getMaximumBid()*0.05));
        } catch (IllegalBidException e) {
            System.out.println(e.toString());
        }
    }

    public float getMaximum() {
        return this.maximum;
    }

    public void setMaximum(float maximum) { this.maximum = maximum; }
}
