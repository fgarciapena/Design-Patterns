package patterns.prototype;

public class Address implements Clonable {
    private String address;

    public Address(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return this.getAddress();
    }

    public Object clone() {
        return new Address(this.getAddress());
    }
}
