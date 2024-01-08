package service;

import model.Customer;

import java.util.ArrayList;

public interface ICustomerService  extends IService<Customer> {
    @Override
    public ArrayList<Customer> getAll();

    @Override
    public String add(Customer customer) ;

    @Override
    public String delete(String id) ;

    @Override
    public String update(Customer customer);

    @Override
    public Customer get(String customerId) ;
}
