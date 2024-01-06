package repository.impl;

import model.Employee;
import repository.IEmployeeRepository;
import utils.FileIo;

import java.io.*;
import java.util.ArrayList;

public class EmployeeRepository implements IEmployeeRepository {
    private static final String filePath = "src/data/employees.csv";

    @Override
    public ArrayList<Employee> getAll() {

        FileIo<Employee> fileio = new FileIo<>(filePath);
        ArrayList<Employee> list = fileio.readAll();
        return list;
    }

    @Override
    public void add(Employee employee) {
        FileIo<Employee> fileio = new FileIo<>(filePath);
        fileio.write(employee);
    }

    @Override
    public void delete(Employee employee) {

    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public Employee get(String id) {
        return null;
    }

    @Override
    public boolean isExist(String employeeId) {
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


