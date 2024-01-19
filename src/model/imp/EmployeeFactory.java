package model.imp;

import model.Employee;
import model.IPersonFactory;
import model.Person;

import java.time.LocalDate;

public class EmployeeFactory implements IPersonFactory {
    @Override
    public Person createPerson(String[] csvArray) {
        Employee e = new Employee();
        e.setName(csvArray[0]);
        e.setBirthday(LocalDate.parse(csvArray[1]));
        e.setSex(csvArray[2]);
        e.setCitizenId(csvArray[3]);
        e.setPhoneNumber(csvArray[4]);
        e.setEmail(csvArray[5]);
        e.setEmployeeId(csvArray[6]);
        e.setDegree(Employee.Degree.valueOf(csvArray[7]));
        e.setJobPosition(Employee.JobPosition.valueOf(csvArray[8]));
        e.setSalary(Double.parseDouble(csvArray[9]));
        return e;
    }
}
