package service;

import model.Employee;

import java.util.ArrayList;

public interface IEmployeeService extends IService<Employee> {

    @Override
    public ArrayList<Employee> getAll();

    @Override
    public void add(Employee employee) ;

    @Override
    public void delete(Employee employee) ;

    @Override
    public void update(Employee employee);

    @Override
    public Employee get(String employeeId) ;
}
