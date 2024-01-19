package view;

import controller.FacilityController;
import controller.PersonController;
import model.Customer;
import model.Employee;
import model.Facility;
import model.Person;
import model.imp.CustomerFactory;
import model.imp.EmployeeFactory;
import repository.impl.FacilityRepository;
import repository.impl.PersonRepository;
import service.impl.FacilityService;
import service.impl.PersonService;
import utils.Validate;
import utils.myexception.InvalidDate;
import utils.myexception.InvalidEmail;
import utils.myexception.InvalidPhone;
import utils.myexception.InvalidSalary;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class View {

    private static PersonService employeeService = new PersonService(new PersonRepository("src/data/employees.csv", new EmployeeFactory()));
    private static PersonController employeeController = new PersonController(employeeService);
    private static PersonService customerService = new PersonService(new PersonRepository("src/data/customers.csv", new CustomerFactory()));
    private static PersonController customerController = new PersonController(customerService);
    private static FacilityService facilityService = new FacilityService(new FacilityRepository());
    private static FacilityController facilityController = new FacilityController(facilityService);
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exitFlag = false;
        boolean returnMain = false;
        do {
            String mainSelected = displayMainMenu();
            switch (mainSelected) {
                case "1":
                    do {
                        String employeeSelected = displayEmployeeMenu();
                        switch (employeeSelected) {
                            case "1":  // list all
                                System.out.println("-- List of employees ---");
                                ArrayList<Person> list = employeeController.getAll();
                                for (Person employee : list) {
                                    System.out.println(employee);
                                }
                                break;
                            case "2": // add new
                                System.out.println("--- Add new employee ---");
                                Employee newEmployee = inputNewEmployee();
                                System.out.println(employeeController.add(newEmployee));
                                break;
                            case "3": // update
                                System.out.println("--- Update  employee ---");
                                System.out.print("Enter Employee Id :");
                                String updateId = scanner.nextLine();
                                Employee updateEmployee = (Employee) employeeController.get(updateId);
                                if (updateEmployee != null) {
                                    Person changedEmployee = inputEmployeeUpdate(updateEmployee);
                                    System.out.println(changedEmployee);
                                    System.out.println(employeeController.update(changedEmployee));
                                } else {
                                    System.out.println("EmployeeId does not exist !");
                                }
                                break;
                            case "4": // delete
                                System.out.println("--- Delete employee ---");
                                System.out.print("Enter Employee Id to delete :");
                                String deleteId = scanner.nextLine();
                                System.out.println(employeeController.delete(deleteId));
                                break;
                            case "5": // return to Main menu
                                returnMain = true;
                                break;
                        }
                    } while (!returnMain);
                    break;
                case "2":
                    do {
                        String customerSelected = displayCustomerMenu();
                        switch (customerSelected) {
                            case "1": //display
                                System.out.println("-- List of customer ---");
                                ArrayList<Person> list = customerController.getAll();
                                for (Person customer : list) {
                                    System.out.println(customer);
                                }
                                break;

                            case "2": //add
                                System.out.println("--- Add new customer ---");
                                Customer newCustomer = inputNewCustomer();
                                System.out.println(customerController.add(newCustomer));
                                break;
                            case "3": //edit
                                System.out.println("--- Update  customer ---");
                                System.out.print("Enter customer Id :");
                                String updateId = scanner.nextLine();
                                Customer updateCustomer = (Customer) customerController.get(updateId);
                                if (updateCustomer != null) {
                                    Person changedCustomer = inputCustomerUpdate(updateCustomer);
                                    System.out.println(changedCustomer);
                                    System.out.println(customerController.update(changedCustomer));
                                } else {
                                    System.out.println("Customer Id does not exist !");
                                }
                                break;
                            case "4":
                                returnMain = true;
                                break;
                        }
                    } while (!returnMain);
                    break;
                case "3":

                    do {
                        String facilitySelected = displayFactilityMenu();
                        switch (facilitySelected) {
                            case "1": // Hiển thi tất cả
                                System.out.println("-- List of Facility ---");
                                ArrayList<Facility> facilityList = facilityController.getAll();
                                for (Facility facility : facilityList) {
                                    System.out.println(facility);
                                }
                                break;
                            case "2": // add
                                break;
                            case "3":
                                System.out.println("-- List of Facility need to maintain ---");
                                ArrayList<Facility> maintainedFacilityList = facilityController.getAllNeedMaintain();
                                for (Facility facility : maintainedFacilityList) {
                                    System.out.println(facility);
                                }
                                break;
                            case "4":
                                returnMain = true;
                                break;
                        }
                    } while (!returnMain);
                    break;
                case "4":
                    do {
                        String bookingSelected = displayBookingMenu();
                        switch (bookingSelected) {
                            case "1":
                                break;
                            case "2":
                                break;
                            case "3":
                                break;
                            case "4":
                                returnMain = true;
                                break;
                        }
                    } while (!returnMain);
                    break;
                case "5":
                    do {
                        String promotionSelected = displayPromotionMenu();
                        switch (promotionSelected) {
                            case "1":

                                break;
                            case "2":
                                break;
                            case "3":
                                break;
                            case "4":
                                returnMain = true;
                                break;
                        }
                    } while (!returnMain);
                    break;
                case "6":
                    exitFlag = true;
                    break;
            }
        } while (!exitFlag);

    }

    public static String displayMainMenu() {
        System.out.println("-----------------------");
        System.out.println("FURAMA MANAGEMENT ");
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management");
        System.out.println("4. Booking Management");
        System.out.println("5. Promotion Management");
        System.out.println("6. Exit");
        System.out.println("-----------------------");
        System.out.print("Select Management module : ");
        String input;
        do {
            input = scanner.nextLine();
            if (input.matches("[123456]")) {
                break;
            } else {
                System.out.println("Invalid !");
            }
        } while (true);

        return input;
    }

    public static String displayEmployeeMenu() {
        System.out.println("-----------------------");
        System.out.println("EMPLOYEE MANAGEMENT ");
        System.out.println("1. Display list employees");
        System.out.println("2. Add new employee");
        System.out.println("3. Edit employee");
        System.out.println("4. Delete employee");
        System.out.println("5. Return main menu");
        System.out.println("-----------------------");
        System.out.print("Select task : ");
        String input;
        do {
            input = scanner.nextLine();
            if (input.matches("[12345]")) {
                break;
            } else {
                System.out.println("Invalid !");
            }
        } while (true);

        return input;
    }

    public static String displayCustomerMenu() {
        System.out.println("-----------------------");
        System.out.println("CUSTOMER MANAGEMENT ");
        System.out.println("1. Display list customer");
        System.out.println("2. Add new customer");
        System.out.println("3. Edit customer");
        System.out.println("4. Return main menu");
        System.out.println("-----------------------");
        System.out.print("Select task : ");
        String input;
        do {
            input = scanner.nextLine();
            if (input.matches("[1234]")) {
                break;
            } else {
                System.out.println("Invalid !");
            }
        } while (true);

        return input;
    }

    public static String displayFactilityMenu() {
        System.out.println("-----------------------");
        System.out.println("FACTILITY MANAGEMENT ");
        System.out.println("1. Display list facility");
        System.out.println("2. Add new facility");
        System.out.println("3. Display list facility maintenance");
        System.out.println("4. Return main menu");
        System.out.println("-----------------------");
        System.out.print("Select task : ");
        String input;
        do {
            input = scanner.nextLine();
            if (input.matches("[1234]")) {
                break;
            } else {
                System.out.println("Invalid !");
            }
        } while (true);

        return input;
    }

    public static String displayBookingMenu() {
        System.out.println("-----------------------");
        System.out.println("BOOKING MANAGEMENT ");
        System.out.println("1. Add new booking");
        System.out.println("2. Display list booking");
        System.out.println("3. Create new contract");
        System.out.println("4. Display list contracts");
        System.out.println("5. Edit contracts");
        System.out.println("6. Return main menu");
        System.out.println("-----------------------");
        System.out.print("Select task : ");
        String input;
        do {
            input = scanner.nextLine();
            if (input.matches("[123456]")) {
                break;
            } else {
                System.out.println("Invalid !");
            }
        } while (true);

        return input;
    }

    public static String displayPromotionMenu() {
        System.out.println("-----------------------");
        System.out.println("PROMOTION MANAGEMENT ");
        System.out.println("1. Display list customers use service");
        System.out.println("2. Display list customers get voucher");
        System.out.println("3. Return main menu");
        System.out.println("-----------------------");
        System.out.print("Select task: ");
        String input;
        do {
            input = scanner.nextLine();
            if (input.matches("[123]")) {
                break;
            } else {
                System.out.println("Invalid !");
            }
        } while (true);
        return input;
    }

    public static Employee inputNewEmployee() {
        System.out.println("---- Input Employee Info ---- ");
        System.out.print("Enter name : ");
        String name = scanner.nextLine();
        System.out.print("Enter birthday (yyyy-mm-dd) : ");
        String bd = null;
        do {
            bd = scanner.nextLine();
            try {
                Validate.validateDate(bd);
                break;
            } catch (InvalidDate e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        LocalDate birthday = LocalDate.parse(bd);
        System.out.print("Enter sex (male/female) : ");
        String sex = scanner.nextLine();
        System.out.print("Enter citizenId : ");
        String citizenId = scanner.nextLine();

        System.out.print("Enter phone number : ");
        String phoneNumber = null;
        do {
            phoneNumber = scanner.nextLine();
            try {
                Validate.validatePhone(phoneNumber);
                break;
            } catch (InvalidPhone e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        System.out.print("Enter email : ");
        String email;
        do {
            email = scanner.nextLine();
            try {
                Validate.validateEmail(email);
                break;
            } catch (InvalidEmail e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        System.out.print("Enter employeeId : ");
        String employeeId = scanner.nextLine();
        System.out.print("Enter degree : ");
        Employee.Degree degree = Employee.Degree.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Enter job position : ");
        Employee.JobPosition position = Employee.JobPosition.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Enter salary : ");
        double salary = 0;
        do {
            while (!scanner.hasNextDouble()) {
                System.out.println("Không phải số !");
                scanner.next();
            }
                salary = scanner.nextDouble();
            try {
                Validate.validateSalary(salary);
                break;
            } catch (InvalidSalary e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        return new Employee(name, birthday, sex, citizenId, phoneNumber, email, employeeId, degree, position, salary);
    }

    public static Employee inputEmployeeUpdate(Employee employee) {
        System.out.println("---- Update Employee: " + employee.getEmployeeId() + " Info ---- ");
        System.out.print("Enter new name (" + employee.getName() + ") : ");
        String name = scanner.nextLine();
        System.out.print("Enter new birthday (yyyy-mm-dd) (" + employee.getBirthday() + "): ");
        LocalDate birthday = LocalDate.parse(scanner.nextLine());
        System.out.print("Enter new sex (male/female) (" + employee.getSex() + "): ");
        String sex = scanner.nextLine();
        System.out.print("Enter new citizenId (" + employee.getCitizenId() + ") : ");
        String citizenId = scanner.nextLine();
        System.out.print("Enter phone number (" + employee.getPhoneNumber() + ") : ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter email (" + employee.getEmail() + "): ");
        String email = scanner.nextLine();
        System.out.print("Enter degree (" + employee.getDegree() + "): ");
        Employee.Degree degree = Employee.Degree.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Enter job position (" + employee.getJobPosition() + ") : ");
        Employee.JobPosition position = Employee.JobPosition.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Enter salary (" + employee.getSalary() + "): ");
        double salary = Double.parseDouble(scanner.nextLine());
        return new Employee(name, birthday, sex, citizenId, phoneNumber, email, employee.getEmployeeId(), degree, position, salary);
    }

    public static Customer inputNewCustomer() {
        System.out.print("Enter name : ");
        String name = scanner.nextLine();
        System.out.print("Enter birthday (yyyy-mm-dd) : ");
        LocalDate birthday = LocalDate.parse(scanner.nextLine());
        System.out.print("Enter sex (male/female) : ");
        String sex = scanner.nextLine();
        System.out.print("Enter citizenId : ");
        String citizenId = scanner.nextLine();
        System.out.print("Enter phone number : ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter email : ");
        String email = scanner.nextLine();
        System.out.print("Enter customer ID : ");
        String customerId = scanner.nextLine();
        System.out.print("Enter customer class : ");
        String customerClass = scanner.nextLine();
        System.out.print("Enter address : ");
        String address = scanner.nextLine();
        return new Customer(name, birthday, sex, citizenId, phoneNumber, email, customerId, Customer.CustomerClass.valueOf(customerClass), address);
    }

    public static Customer inputCustomerUpdate(Customer customer) {
        System.out.println("---- Update Employee: " + customer.getCustomerId() + " Info ---- ");
        System.out.print("Enter new name (" + customer.getName() + ") : ");
        String name = scanner.nextLine();
        System.out.print("Enter new birthday (yyyy-mm-dd) (" + customer.getBirthday() + "): ");
        LocalDate birthday = LocalDate.parse(scanner.nextLine());
        System.out.print("Enter new sex (male/female) (" + customer.getSex() + "): ");
        String sex = scanner.nextLine();
        System.out.print("Enter new citizenId (" + customer.getCitizenId() + ") : ");
        String citizenId = scanner.nextLine();
        System.out.print("Enter phone number (" + customer.getPhoneNumber() + ") : ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter email (" + customer.getEmail() + "): ");
        String email = scanner.nextLine();
        System.out.print("Enter Customer class  (" + customer.getCustomerClass() + ") :");
        Customer.CustomerClass customerClass = Customer.CustomerClass.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Enter address (" + customer.getAddress() + "): ");
        String address = scanner.nextLine();
        return new Customer(name, birthday, sex, citizenId, phoneNumber, email, customer.getCustomerId(), customerClass, address);
    }
}




