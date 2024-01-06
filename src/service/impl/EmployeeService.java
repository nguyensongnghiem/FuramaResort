package service.impl;

import model.Employee;
import repository.impl.EmployeeRepository;
import service.IEmployeeService;

import java.util.ArrayList;

public class EmployeeService implements IEmployeeService  {
    EmployeeRepository employeeRepository = new EmployeeRepository();
    @Override
    public ArrayList<Employee> getAll() {
        return employeeRepository.getAll();
    }

    @Override
    public void add(Employee employee) {
        employeeRepository.add(employee);
    }

    @Override
    public void delete(Employee employee) {

    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public Employee get(String employeeId) {
        return null;
    }
}
