package view;

import java.util.Scanner;

public class MenuView {
    private static Scanner scanner = new Scanner(System.in);
    public int displayMainMenu() {
        System.out.println("-----------------------");
        System.out.println("FURAMA MANAGEMENT ");
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management");
        System.out.println("4. Booking Management");
        System.out.println("5. Promotion Management");
        System.out.println("6. Exit");
        System.out.println("-----------------------");
        System.out.println("Select Management module : ");
        int select = Integer.parseInt(scanner.nextLine());
        return  select;
    }
    public int displayEmployeeMenu() {
        System.out.println("-----------------------");
        System.out.println("EMPLOYEE MANAGEMENT ");
        System.out.println("1. Display list employees");
        System.out.println("2. Add new employee");
        System.out.println("3. Edit employee");
        System.out.println("4. Return main menu");
        System.out.println("-----------------------");
        System.out.println("Select : ");
        int select = Integer.parseInt(scanner.nextLine());
        return  select;
    }
    public int displayCustomerMenu() {
        System.out.println("-----------------------");
        System.out.println("CUSTOMER MANAGEMENT ");
        System.out.println("1. Display list customer");
        System.out.println("2. Add new customer");
        System.out.println("3. Edit customer");
        System.out.println("4. Return main menu");
        System.out.println("-----------------------");
        System.out.println("Select : ");
        int select = Integer.parseInt(scanner.nextLine());
        return  select;
    }
    public int displayFactilityMenu() {
        System.out.println("-----------------------");
        System.out.println("FACTILITY MANAGEMENT ");
        System.out.println("1. Display list facility");
        System.out.println("2. Add new facility");
        System.out.println("3. Display list facility maintenance");
        System.out.println("4. Return main menu");
        System.out.println("-----------------------");
        System.out.println("Select : ");
        int select = Integer.parseInt(scanner.nextLine());
        return  select;
    }
    public int displayBookingMenu() {
        System.out.println("-----------------------");
        System.out.println("BOOKING MANAGEMENT ");
        System.out.println("1. Add new booking");
        System.out.println("2. Display list booking");
        System.out.println("3. Create new contract");
        System.out.println("4. Display list contracts");
        System.out.println("5. Edit contracts");
        System.out.println("6. Return main menu");
        System.out.println("-----------------------");
        System.out.println("Select : ");
        int select = Integer.parseInt(scanner.nextLine());
        return  select;
    }
    public int displayPromotionMenu() {
        System.out.println("-----------------------");
        System.out.println("PROMOTION MANAGEMENT ");
        System.out.println("1. Display list customers use service");
        System.out.println("2. Display list customers get voucher");
        System.out.println("3. Return main menu");
        System.out.println("-----------------------");
        System.out.println("Select : ");
        int select = Integer.parseInt(scanner.nextLine());
        return  select;
    }


}
