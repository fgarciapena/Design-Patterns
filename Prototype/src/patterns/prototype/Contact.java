package patterns.prototype;

public class Contact implements Clonable {
    private Address address;
    private PhoneNumber phoneNumber;

    public Contact(Address address, PhoneNumber phoneNumber) {
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return this.getAddress().toString() + " " + this.getPhoneNumber().toString();
    }

    public Object clone() {
        return new Contact(this.getAddress(), this.getPhoneNumber());
    }
}
