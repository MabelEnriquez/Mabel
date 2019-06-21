package Interface;
import Employee.*;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Menus {

    Scanner sc = new Scanner(System.in);

    public void menu() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("ascii.txt"));
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
    }

    static void menu(Admin admin){
        System.out.println("ADMIN MENU");
    }
    static void menu(Planner planner){
        System.out.println("PLANNER MENU");
    }
    static void menu(Cashier cashier){
        System.out.println("CASHIER MENU");
    }

    public void login(Employee[] employees) {
        System.out.println("Bienvenido a Aeropuerto ESPOL");
        System.out.println("Ingrese su username: ");
        String username = sc.nextLine();
        System.out.println("Ingrese su password: ");
        String password = sc.nextLine();
        for (int i = 0; i < (employees.length - 1); i++) {
            String user = employees[i].getUsuario();
            String pass = employees[i].getClave();
            if (username.equals(user) && password.equals(pass)) {
                String rol = employees[i].getRol();
                switch (rol) {
                    case "admin":
                        Admin admin = new Admin();
                        menu(admin);
                        break;
                    case "cashier":
                        Cashier cashier = new Cashier();
                        menu(cashier);
                        break;
                    case "planner":
                        Planner planner = new Planner();
                        menu(planner);
                        break;
                }
                break;
            }
            if (i == (employees.length - 2)) {
                System.out.println("Credenciales Incorrectas");
                break;
            }
        }
    }
    
    
    
}
