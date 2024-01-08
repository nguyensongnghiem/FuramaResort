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
    public String add(Employee employee) {
       return  employeeRepository.add(employee);
    }

    @Override
    public String delete(String employeeId) {
       return employeeRepository.delete(employeeId);
    }

    @Override
    public String update(Employee employee) {
        return employeeRepository.update(employee);
    }

    @Override
    public Employee get(String employeeId) {
        return employeeRepository.get(employeeId);

    }

    @Override
    public boolean isExisted(String id) {
        return get(id)!=null;
    }
}
