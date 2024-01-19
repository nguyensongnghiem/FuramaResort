package model;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Employee extends Person {
    public enum JobPosition implements Serializable {
        RECEPTIONIST,
        SERVER,
        SPECIALIST,
        SUPERVISOR,
        MANAGER,
        DIRECTOR;

        public String getStatus() {
            return this.name();
        }
    }

    public enum Degree implements Serializable {
        INTERMEDIATE,
        COLLEGE,
        UNIVERSITY,
        POSTGRADUATE;

        public String getStatus() {
            return this.name();
        }
    }

    private String employeeId;
    private Degree degree;
    private JobPosition jobPosition;
    private double salary;

    public Employee() {
    }


    public Employee(String name, LocalDate birthday, String sex, String id, String phoneNumber, String email, String employeeId, Degree degree, JobPosition jobPosition, double salary) {
        super(name, birthday, sex, id, phoneNumber, email);
        this.employeeId = employeeId;
        this.degree = degree;
        this.jobPosition = jobPosition;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public JobPosition getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(JobPosition jobPosition) {
        this.jobPosition = jobPosition;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getId() {
        return getEmployeeId();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                "Name='" + getName() + '\'' +
                ", degree=" + degree +
                ", jobPosition=" + jobPosition +
                ", salary=" + salary +
                "} ";
    }
@Override
    public String toCsvLine() {
        final String CSV_SEPARATOR = ";";
        StringBuilder str = new StringBuilder();
        str.append(getName());
        str.append(CSV_SEPARATOR);
        str.append(getBirthday());
        str.append(CSV_SEPARATOR);
        str.append(getSex());
        str.append(CSV_SEPARATOR);
        str.append(getCitizenId());
        str.append(CSV_SEPARATOR);
        str.append(getPhoneNumber());
        str.append(CSV_SEPARATOR);
        str.append(getEmail());
        str.append(CSV_SEPARATOR);
        str.append(getEmployeeId());
        str.append(CSV_SEPARATOR);
        str.append(getDegree());
        str.append(CSV_SEPARATOR);
        str.append(getJobPosition());
        str.append(CSV_SEPARATOR);
        str.append(getSalary());
        return str.toString();
    }

//    public static Employee fromCsvLine(String line) {
//        final String CSV_SEPARATOR = ";";
//        String[] array = line.split(CSV_SEPARATOR);
//        Employee e = new Employee();
//        e.setName(array[0]);
//        e.setBirthday(LocalDate.parse(array[1]));
//        e.setSex(array[2]);
//        e.setCitizenId(array[3]);
//        e.setPhoneNumber(array[4]);
//        e.setEmail(array[5]);
//        e.setEmployeeId(array[6]);
//        e.setDegree(Degree.valueOf(array[7]));
//        e.setJobPosition(JobPosition.valueOf(array[8]));
//        e.setSalary(Double.parseDouble(array[9]));
//        return e;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeId, employee.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId);
    }
}
