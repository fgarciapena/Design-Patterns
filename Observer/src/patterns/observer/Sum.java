package patterns.observer;

public class Sum implements Bidder {
    private float maximum;

    public Sum(float amount){
        this.setMaximum(amount);
    }

    public void bid(Auction auction) {
        try {
            if(!(auction.getCurrentWinner() == this))
                auction.buy(this, auction.getMaximumBid() + 50);
        } catch (IllegalBidException e) {
            System.out.println(e.toString());
        }
    }

    public float getMaximum() {
        return this.maximum;
    }

    public void setMaximum(float maximum) { this.maximum = maximum; }
}
