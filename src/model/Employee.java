package model;


public class Employee extends Person {
    public enum JobPosition {
        RECEPTIONIST,
        SERVER,
        SPECIALIST,
        SUPERVISOR,
        MANAGER,
        DIRECTOR
    }
    public  enum Degree {
        INTERMEDIATE,
        COLLEGE,
        UNIVERSITY,
        POSTGRADUATE
    }
    private String employeeId;
    private Degree degree;
    private JobPosition jobPosition;
    private double salary;
    public Employee() {
    }



    public Employee(String name, String birthday, String sex, String id, String phoneNumber, String email, String employeeId, Degree degree, JobPosition jobPosition, double salary) {
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
    public String toCsvLine() {
        final String CSV_SEPARATOR =";";
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
}
