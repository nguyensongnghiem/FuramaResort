package model;

import java.time.LocalDate;
import java.util.Objects;

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


    public Customer(String name, LocalDate birthday, String sex, String citizenId, String phoneNumber, String email, String customerId, CustomerClass customerClass, String address) {
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

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", customerClass=" + customerClass +
                ", address='" + address + '\'' +
                ", citizenId='" + citizenId + '\'' +
                '}';
    }

    @Override
    public String getId() {
        return getCustomerId();
    }
    @Override
    public String toCsvLine() {
        final String CSV_SEPARATOR = ";";
        StringBuilder str = new StringBuilder();
        str.append(getName());
        str.append(CSV_SEPARATOR);
        str.append(getBirthday());
        str.append(CSV_SEPARATOR);
        str.append(getSex());
        str.append(CSV_SEPARATOR);
        str.append(getCitizenId());
        str.append(CSV_SEPARATOR);
        str.append(getPhoneNumber());
        str.append(CSV_SEPARATOR);
        str.append(getEmail());
        str.append(CSV_SEPARATOR);
        str.append(getCustomerId());
        str.append(CSV_SEPARATOR);
        str.append(getCustomerClass());
        str.append(CSV_SEPARATOR);
        str.append(getAddress());
        return str.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(customerId, customer.customerId);
    }


    @Override
    public int hashCode() {
        return Objects.hash(customerId);
    }
}
