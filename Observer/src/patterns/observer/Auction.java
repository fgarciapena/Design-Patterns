package patterns.observer;

import java.util.List;

public interface Auction {
    float getMaximumBid();
    Bidder getCurrentWinner();
    void addBidder(Bidder bidder);
    void removeBidder(Bidder bidder);
    void notifyBidders();
    void buy(Bidder bidder, float amount) throws IllegalBidException;
}
