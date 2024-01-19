package model.imp;

import model.Customer;
import model.Employee;
import model.IPersonFactory;
import model.Person;

import java.time.LocalDate;

public class CustomerFactory implements IPersonFactory {
    @Override
    public Person createPerson(String[] csvArray) {
        Customer c = new Customer();
        c.setName(csvArray[0]);
        c.setBirthday(LocalDate.parse(csvArray[1]));
        c.setSex(csvArray[2]);
        c.setCitizenId(csvArray[3]);
        c.setPhoneNumber(csvArray[4]);
        c.setEmail(csvArray[5]);
        c.setCustomerId(csvArray[6]);
        c.setCustomerClass(Customer.CustomerClass.valueOf(csvArray[7]));
        c.setAddress(csvArray[8]);
        return c;
    }
}
