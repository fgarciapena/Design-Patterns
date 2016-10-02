package patterns.prototype;

public class Main {

    public static void main(String[] args) {
        Contact contact = new Contact(new Address("NY Blvd. 2419 Apt B"), new PhoneNumber("+123", "4567891"));
        System.out.println(contact.clone().toString());
        System.out.println(contact.getPhoneNumber().clone().toString());
        System.out.println(contact.getAddress().clone().toString());
    }
}
