package model;

public class Customer extends Person {
    public enum CustomerClass {
        DIAMOND,
        PLATINUM,
        GOLD,
        SILVER,
        MEMBER
    }
    private String customerId;
    private CustomerClass customerClass;
    private String address;

    public Customer() {
    }

    public Customer(String name, String birthday, String sex, String citizenId, String phoneNumber, String email, String customerId, CustomerClass customerClass, String address) {
        super(name, birthday, sex, citizenId, phoneNumber, email);
        this.customerId = customerId;
        this.customerClass = customerClass;
        this.address = address;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public CustomerClass getCustomerClass() {
        return customerClass;
    }

    public void setCustomerClass(CustomerClass customerClass) {
        this.customerClass = customerClass;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
