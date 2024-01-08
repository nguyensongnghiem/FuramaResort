package service;

import model.Employee;

import java.util.ArrayList;

public interface IEmployeeService extends IService<Employee> {

    @Override
    public ArrayList<Employee> getAll();

    @Override
    public String add(Employee employee) ;


    @Override
    public String delete(String employeeId) ;

    @Override
    public String update(Employee employee);

    @Override
    public Employee get(String employeeId) ;
}
