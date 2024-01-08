package controller;

import model.Employee;
import service.impl.EmployeeService;

import java.util.ArrayList;

public class EmployeeController {
    private EmployeeService employeeService = new EmployeeService();

    public String add(Employee employee) {
        return employeeService.add(employee);
    }
    public ArrayList<Employee> getAll() {
        return employeeService.getAll();
    }
    public String delete(String employeeId) {
        return employeeService.delete(employeeId);
    }
    public String update(Employee employee) {
        return employeeService.update(employee);
    }
}
