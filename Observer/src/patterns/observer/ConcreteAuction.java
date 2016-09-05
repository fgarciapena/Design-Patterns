package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAuction implements Auction {
    private List<Bidder> bidders;
    private Product product;
    private float maximumBid;
    private Bidder currentWinner;

    public ConcreteAuction(List<Bidder> bidders, Product product, float maximumBid, Bidder currentWinner) {
        if(bidders == null)
            this.setBidders(new ArrayList<Bidder>());
        else
            this.setBidders(bidders);
        this.setProduct(product);
        this.setMaximumBid(maximumBid);
        this.setCurrentWinner(currentWinner);
    }

    public void addBidder(Bidder bidder) {
        bidders.add(bidder);
    }

    public void removeBidder(Bidder bidder) {
        bidders.remove(bidder);
    }

    public void notifyBidders() {
        for(Bidder bidder : bidders) {
            bidder.bid(this);
        }
    }

    public void buy(Bidder bidder, float amount) throws IllegalBidException{
        if(!bidders.contains(bidder))
            addBidder(bidder);
        if(bidder.getMaximum() > amount && amount > this.getMaximumBid()){
            this.setCurrentWinner(bidder);
            this.maximumBid = amount;
            System.out.println("We have a new winning bid.");
            notifyBidders();
        }else{
            throw new IllegalBidException("This auction's current bid is above your maximum.");
        }
    }

    public List<Bidder> getBidders() {
        return bidders;
    }

    public void setBidders(List<Bidder> bidders) {
        this.bidders = bidders;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public float getMaximumBid() {
        return maximumBid;
    }

    public void setMaximumBid(float maximumBid) {
        this.maximumBid = maximumBid;
    }

    public Bidder getCurrentWinner() {
        return currentWinner;
    }

    public void setCurrentWinner(Bidder currentWinner) {
        this.currentWinner = currentWinner;
    }
}
