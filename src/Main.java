import controller.FuramaController;
import view.MenuView;

public class Main {
    public static void main(String[] args) {
        MenuView menuView = new MenuView();
        FuramaController furamaController = new FuramaController(menuView);
        furamaController.displayMainMenu();
    }
}