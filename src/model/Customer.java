package model;

public class Customer extends Person {
    private String customerId;
    private String customerClass;
    private String address;

    public Customer() {
    }

    public Customer(String name, String birthday, String sex, String citizenId, String phoneNumber, String email, String customerId, String customerClass, String address) {
        super(name, birthday, sex, citizenId, phoneNumber, email);
        this.customerId = customerId;
        this.customerClass = customerClass;
        this.address = address;
    }
}
