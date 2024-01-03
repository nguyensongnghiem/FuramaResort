package controller;

import view.MenuView;

public class FuramaController {
    MenuView menuView;

    public FuramaController(MenuView menuView) {
        this.menuView = menuView;
    }

    public void displayMainMenu() {
        boolean exitFlag = false;
        boolean returnMain = false;
        do {
            int mainSelected = menuView.displayMainMenu();
            switch (mainSelected) {
                case 1 :
                    do {
                        int employeeSelected = menuView.displayEmployeeMenu();
                        switch (employeeSelected) {
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
                case 2:

                    do {
                        int customerSelected = menuView.displayCustomerMenu();
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
                        int facilitySelected = menuView.displayFactilityMenu();
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
                        int bookingSelected = menuView.displayBookingMenu();
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
                        int promotionSelected = menuView.displayPromotionMenu();
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

}
