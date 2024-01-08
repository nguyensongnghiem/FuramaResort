package repository.impl;

import model.Customer;
import repository.ICustomerRepository;
import utils.FileIo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CustomerRepository implements ICustomerRepository {
    private static final String filePath = "src/data/customers.csv";

    @Override
    public ArrayList<Customer> getAll() {

        FileIo<Customer> fileio = new FileIo<>(filePath);
        ArrayList<Customer> list = fileio.readAll(Customer.class);
        return list;
    }

    @Override
    public void replaceAll(ArrayList<Customer> list) {

    }


    @Override
    public String add(Customer customer) {
        FileIo<Customer> fileio = new FileIo<>(filePath);
        fileio.write(customer);
        return null;
    }

    @Override
    public String delete(String customerId) {

        return null;
    }

    @Override
    public String update(Customer customer) {

        return null;
    }

    @Override
    public Customer get(String id) {
        return null;
    }

    @Override
    public boolean isExist(String customerId) {
        File file = new File(filePath);
        if (file.exists()) {
            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader(file));
                String line = null;
                while ((line = br.readLine()) != null) {

                }
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {

        }

        return false;
    }
}


