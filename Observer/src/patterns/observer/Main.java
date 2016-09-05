package patterns.observer;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Auction auction = new ConcreteAuction(null, new Product("Lamp", 50), 50, null);
        Bidder sum = new Sum(1000);
        Bidder percentile = new Percentile(1000);
        Bidder sum2 = new Sum(1500);
        sum.bid(auction);
        percentile.bid(auction);
        sum2.bid(auction);
    }
}
