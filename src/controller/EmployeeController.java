package controller;

import model.Employee;
import service.impl.EmployeeService;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EmployeeController {
    private EmployeeService employeeService = new EmployeeService();

    public void add(Employee employee) {
        employeeService.add(employee);
    }
    public ArrayList<Employee> getAll() {
        return employeeService.getAll();
    }
}
