package view;

import model.Employee;

import java.util.Scanner;

public class View {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean exitFlag = false;
        boolean returnMain = false;
        do {
            int mainSelected = displayMainMenu();
            switch (mainSelected) {
                case 1 :
                    do {
                        int employeeSelected = displayEmployeeMenu();
                        switch (employeeSelected) {
                            case 1:
                                break;
                            case 2:
                                System.out.println("-- Add new employee");
                                Employee e = new Employee("John", "1-1-1990","male","123","0905000000","a@gmail.com","345", Employee.Degree.COLLEGE, Employee.JobPosition.RECEPTIONIST,100000);

                                break;
                            case 3:
                                break;
                            case 4:
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
        System.out.print("Select Management module : ");
        int select = Integer.parseInt(scanner.nextLine());
        return  select;
    }
    public static int displayEmployeeMenu() {
        System.out.println("-----------------------");
        System.out.println("EMPLOYEE MANAGEMENT ");
        System.out.println("1. Display list employees");
        System.out.println("2. Add new employee");
        System.out.println("3. Edit employee");
        System.out.println("4. Return main menu");
        System.out.println("-----------------------");
        System.out.print("Select : ");
        int select = Integer.parseInt(scanner.nextLine());
        return  select;
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
        return  select;
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
        return  select;
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
        return  select;
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
        return  select;
    }
    }




