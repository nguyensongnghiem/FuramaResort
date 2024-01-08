package repository.impl;

import model.Employee;
import repository.IEmployeeRepository;
import utils.FileString;

import java.util.ArrayList;

public class EmployeeRepository implements IEmployeeRepository {
    private static final String filePath = "src/data/employees.csv";

    @Override
    public ArrayList<Employee> getAll() {
        ArrayList<Employee> result = new ArrayList<>();
        FileString fileString = new FileString(filePath);
        ArrayList<String> list = fileString.readAll();
        for (String line : list) {
            result.add(Employee.fromCsvLine(line));
        }
        return result;
    }

    @Override
    public void replaceAll(ArrayList<Employee> list) {
        FileString fileString = new FileString(filePath);
        String listString = "";
        for (int i = 0; i < list.size(); i++) {
            listString = listString + list.get(i).toCsvLine() + "\n";
        }
        fileString.writeAll(listString);
    }

    @Override
    public String add(Employee employee) {
        if (!isExist(employee.getEmployeeId())) {
            FileString fileString = new FileString(filePath);
            fileString.write(employee.toCsvLine());
            return "Added successfull !";
        } else
        return "Employee already exist !";

    }

    @Override
    public String delete(String employeeId) {
        ArrayList<Employee> list = getAll();
        Employee e = get(employeeId);
        System.out.println(e);
        if (e!=null) {
            list.remove(e);
            replaceAll(list);
            return "Deleted !";
        }
        return "Employee does not exist !";
    }

    @Override
    public String update(Employee employee) {
        ArrayList<Employee> list = getAll();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(employee)) {
                list.set(i, employee);
                break;
            }
        }
        return null;
    }

    @Override
    public Employee get(String employeeId) {
        ArrayList<Employee> list = getAll();
        for (Employee e : list) {
            if (e.getEmployeeId().equals(employeeId)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public boolean isExist(String employeeId) {
        return get(employeeId) != null;
    }

}


