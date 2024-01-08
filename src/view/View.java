package view;

import controller.EmployeeController;
import model.Employee;
import model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class View {

    private static EmployeeController controller = new EmployeeController();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exitFlag = false;
        boolean returnMain = false;
        do {
            int mainSelected = displayMainMenu();
            switch (mainSelected) {
                case 1:
                    do {
                        int employeeSelected = displayEmployeeMenu();
                        switch (employeeSelected) {
                            case 1:  // list all
                                System.out.println("-- List of employees ---");
                                ArrayList<Employee> list = controller.getAll();
                                for (Employee e : list) {
                                    System.out.println(e);
                                }
                                break;
                            case 2: // add new
                                System.out.println("--- Add new employee ---");
                                Employee e = inputEmployeeInfo();
                                controller.add(e);
                                break;
                            case 3: // update
                                break;
                            case 4: // delete
                                System.out.println("--- Delete employee ---");
                                System.out.print("Enter Employee Id to delete :");
                                String employeeId = scanner.nextLine();
                                controller.delete(employeeId);
                                break;
                            case 5:
                                returnMain = true;
                                break;
                        }
                    } while (!returnMain);
                    break;
                case 2:
                    do {
                        int customerSelected = displayCustomerMenu();
                        switch (customerSelected) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                returnMain = true;
                                break;
                        }
                    } while (!returnMain);
                    break;
                case 3:

                    do {
                        int facilitySelected = displayFactilityMenu();
                        switch (facilitySelected) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                returnMain = true;
                                break;
                        }
                    } while (!returnMain);
                    break;
                case 4:
                    do {
                        int bookingSelected = displayBookingMenu();
                        switch (bookingSelected) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                returnMain = true;
                                break;
                        }
                    } while (!returnMain);
                    break;
                case 5:
                    do {
                        int promotionSelected = displayPromotionMenu();
                        switch (promotionSelected) {
                            case 1:

                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                returnMain = true;
                                break;
                        }
                    } while (!returnMain);
                    break;
                case 6:
                    exitFlag = true;
                    break;
            }
        } while (!exitFlag);

    }

    public static int displayMainMenu() {
        System.out.println("-----------------------");
        System.out.println("FURAMA MANAGEMENT ");
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management");
        System.out.println("4. Booking Management");
        System.out.println("5. Promotion Management");
        System.out.println("6. Exit");
        System.out.println("-----------------------");
        try {
        System.out.print("Select Management module : ");
        int select = Integer.parseInt(scanner.nextLine());

        }
        catch (
                

        )
        return select;
    }

    public static int displayEmployeeMenu() {
        System.out.println("-----------------------");
        System.out.println("EMPLOYEE MANAGEMENT ");
        System.out.println("1. Display list employees");
        System.out.println("2. Add new employee");
        System.out.println("3. Edit employee");
        System.out.println("4. Delte employee");
        System.out.println("5. Return main menu");
        System.out.println("-----------------------");
        System.out.print("Select : ");
        int select = Integer.parseInt(scanner.nextLine());
        return select;
    }

    public static int displayCustomerMenu() {
        System.out.println("-----------------------");
        System.out.println("CUSTOMER MANAGEMENT ");
        System.out.println("1. Display list customer");
        System.out.println("2. Add new customer");
        System.out.println("3. Edit customer");
        System.out.println("4. Return main menu");
        System.out.println("-----------------------");
        System.out.print("Select : ");
        int select = Integer.parseInt(scanner.nextLine());
        return select;
    }

    public static int displayFactilityMenu() {
        System.out.println("-----------------------");
        System.out.println("FACTILITY MANAGEMENT ");
        System.out.println("1. Display list facility");
        System.out.println("2. Add new facility");
        System.out.println("3. Display list facility maintenance");
        System.out.println("4. Return main menu");
        System.out.println("-----------------------");
        System.out.print("Select : ");
        int select = Integer.parseInt(scanner.nextLine());
        return select;
    }

    public static int displayBookingMenu() {
        System.out.println("-----------------------");
        System.out.println("BOOKING MANAGEMENT ");
        System.out.println("1. Add new booking");
        System.out.println("2. Display list booking");
        System.out.println("3. Create new contract");
        System.out.println("4. Display list contracts");
        System.out.println("5. Edit contracts");
        System.out.println("6. Return main menu");
        System.out.println("-----------------------");
        System.out.print("Select : ");
        int select = Integer.parseInt(scanner.nextLine());
        return select;
    }

    public static int displayPromotionMenu() {
        System.out.println("-----------------------");
        System.out.println("PROMOTION MANAGEMENT ");
        System.out.println("1. Display list customers use service");
        System.out.println("2. Display list customers get voucher");
        System.out.println("3. Return main menu");
        System.out.println("-----------------------");
        System.out.print("Select : ");
        int select = Integer.parseInt(scanner.nextLine());
        return select;
    }

    public static Employee inputEmployeeInfo() {
        System.out.println("---- Input Employee Info ---- ");
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
        System.out.print("Enter employeeId : ");
        String employeeId = scanner.nextLine();
        System.out.print("Enter degree : ");
        Employee.Degree degree = Employee.Degree.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Enter job position : ");
        Employee.JobPosition position = Employee.JobPosition.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Enter salary : ");
        double salary = Double.parseDouble(scanner.nextLine());
        return new Employee(name, birthday, sex, citizenId, phoneNumber, email,employeeId, degree, position,salary);
    }

//    public static Person inputPersonInfo() {
//        System.out.print("Enter name : ");
//        String name = scanner.nextLine();
//        System.out.print("Enter birthday (yyyy-mm-dd) : ");
//        LocalDate birthday = LocalDate.parse(scanner.nextLine());
//        System.out.print("Enter sex (male/female) : ");
//        String sex = scanner.nextLine();
//        System.out.print("Enter citizenId : ");
//        String citizenId = scanner.nextLine();
//        System.out.print("Enter phone number : ");
//        String phoneNumber = scanner.nextLine();
//        System.out.print("Enter email : ");
//        String email = scanner.nextLine();
//        return new Person(name, birthday, sex, citizenId, phoneNumber, email);
//    }

}




