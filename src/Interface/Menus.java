package Interface;
import Employee.*;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Menus {

    public void menu() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("ascii.txt"));
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
    }

    private void menu(Admin admin){

    }
    private void menu(Planner planner){

    }
    private void menu(Cashier cashier){

    }
}
