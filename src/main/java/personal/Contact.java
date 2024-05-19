package personal;

public class Contact {
    private String name;
    private String email;
    private String phoneNumber;
    private int orderQuantity;
    private boolean membership;

    public Contact(String name, String email, String phoneNumber, boolean membership, int orderQuantity) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.membership = membership;
        this.orderQuantity = orderQuantity;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public boolean isMembership() {
        return membership;
    }

    @Override
    public String toString() {
        System.out.println("---------------------");
        return "Name: " + name + ", Email: " + email + ", Phone: " + phoneNumber + ", Membership: " + membership + ", Order Quantity: " + orderQuantity;

    }
}
