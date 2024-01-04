package repository.impl;

import model.Employee;
import repository.IEmployeeRepository;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EmployeeRepository implements IEmployeeRepository {
    private static final String url = "/data/employees.csv";
    @Override
    public ArrayList<Employee> getAll() {
        return null;
    }

    @Override
    public void add(Employee employee) {
        BufferedWriter br = null;
        try {
            br = new BufferedWriter(new FileWriter(url,true));
            br.write(employeeToString(employee));
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
    public String employeeToString(Employee employee) {
        final String CSV_SEPARATOR =";";
        StringBuilder str = new StringBuilder();
        str.append(employee.getName());
        str.append(CSV_SEPARATOR);
        str.append(employee.getBirthday());
        str.append(CSV_SEPARATOR);
        str.append(employee.getSex());
        str.append(CSV_SEPARATOR);
        str.append(employee.getCitizenId());
        str.append(CSV_SEPARATOR);
        str.append(employee.getPhoneNumber());
        str.append(CSV_SEPARATOR);
        str.append(employee.getEmail());
        str.append(CSV_SEPARATOR);
        str.append(employee.getEmployeeId());
        str.append(CSV_SEPARATOR);
        str.append(employee.getDegree());
        str.append(CSV_SEPARATOR);
        str.append(employee.getJobPosition());
        str.append(CSV_SEPARATOR);
        str.append(employee.getSalary());

        return str.toString();
    }
}
