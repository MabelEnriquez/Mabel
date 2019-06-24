package Interface;
import Employee.*;
import Tools.*;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Menus {

    Scanner sc = new Scanner(System.in);
    Tool t = new Tool();
    String s = ",";

    public void menu() {
        t.printToConsole("files/ascii.txt");
    }

    public void menu(Admin admin) throws IOException {
        t.printToConsole("files/adminMenu.txt");
        File file = new File("files/user.txt");
        FileWriter fr = new FileWriter(file, true);
        boolean done = false;
        String cedula, nombre, apellido, email, usuario, clave, rol, aerolinea, departamento;
        while (!done){
            System.out.println("Ingrese la opcion adecuada: ");
            String op = sc.nextLine();
            switch (op){
                case "1":
                    t.printToConsole("files/adminMenu1.txt");
                    boolean ced=false;
                    while(!ced){
                        System.out.println("Ingrese numero de cedula");
                        cedula = sc.nextLine();
                        cedula = cedula.trim();
                        if(t.isInt(cedula)){
                            if(t.verificarCedula(cedula)){
                                ced=true;
                                fr.append(cedula+s);
                            }
                            else{
                                System.out.println("Ingrese un numero de cedula correcto");
                            }
                        }else{
                            System.out.println("Ingrese un numero de cedula correcto");
                        }
                    }
                    System.out.println("Ingrese el nombre: ");
                    nombre = sc.nextLine().trim();
                    fr.append(nombre+s);
                    System.out.println("Ingrese el apellido: ");
                    apellido = sc.nextLine().trim();
                    fr.append(apellido+s);
                    System.out.println("Ingrese el mail: ");
                    email = sc.nextLine();
                    fr.append(email+s);
                    System.out.println("Ingrese el username: ");
                    usuario = sc.nextLine();
                    fr.append(usuario+s);
                    boolean cl = false;
                    while(!cl){
                        System.out.println("Ingrese la clave, debe tener una longitud mínima de 8 caracteres, al\n" +
                                "menos un caracter en mayúsculas, y al menos un número.");
                        clave = sc.nextLine();
                        if(t.verificarClave(clave)){
                            cl = true;
                            fr.append(t.getEncstr(clave)+s);
                        }
                        else System.out.println("Ingrese una clave adecuada");
                    }
                    System.out.println("Ingrese el rol: ");
                    boolean ro = false;
                    while(!ro){
                        System.out.println("" +
                                "Admin...............1" +"\n"+
                                "Cashier.............2" +"\n"+
                                "Planner.............3");
                        rol = sc.nextLine();
                        if (rol.equals("1")){
                            rol = "Admin";
                            aerolinea = "";
                            departamento = "Sistemas";
                            fr.append(rol+s+aerolinea+s+departamento+"\n");
                            ro = true;
                        }
                        else if(rol.equals("2")){
                            rol = "Cashier";
                            System.out.println("Ingrese Aerolinea, (Si no existe sera creada). ");
                            aerolinea = sc.nextLine();
                            try {
                                t.checkAirline(aerolinea);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            departamento = "Comercial";
                            fr.append(rol+s+aerolinea+s+departamento+"\n");
                            ro = true;
                        }
                        else if(rol.equals("3")){
                            rol = "Planner";
                            System.out.println("Ingrese Aerolinea, (Si no existe sera creada). ");
                            aerolinea = sc.nextLine();
                            try {
                                t.checkAirline(aerolinea);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            departamento = "Comercial";
                            fr.append(rol+s+aerolinea+s+departamento+"\n");
                            ro = true;
                        }
                        else System.out.println("Ingrese correctamente la opcion");
                    }
                    fr.close();
                    done = true;
                    break;
                case "2":

                    done= true;
                    break;
                case"0":

                    done=true;
                    break;
                default:
                    System.out.println("Ingrese la opcion correctamente.");
                    break;
            }
        }
    }

    public void menu(Planner planner){
        System.out.println("PLANNER MENU");
    }
    public void menu(Cashier cashier){
        System.out.println("CASHIER MENU");
    }

//    public void login(Employee[] employees) {
//        System.out.println("Bienvenido a Aeropuerto ESPOL");
//        System.out.println("Ingrese su username: ");
//        String username = sc.nextLine();
//        System.out.println("Ingrese su password: ");
//        String password = sc.nextLine();
//        password = t.getEncstr(password);
//        for (int i = 0; i < (employees.length - 1); i++) {
//            String user = employees[i].getUsuario();
//            String pass = employees[i].getClave();
//            if (username.equals(user) && password.equals(pass)) {
//                String rol = employees[i].getRol();
//                switch (rol) {
//                    case "admin":
//                        Admin admin = new Admin();
//                        try {
//                            menu(admin);
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
//                        break;
//                    case "cashier":
//                        Cashier cashier = new Cashier();
//                        menu(cashier);
//                        break;
//                    case "planner":
//                        Planner planner = new Planner();
//                        menu(planner);
//                        break;
//                }
//                break;
//            }
//            if (i == (employees.length - 2)) {
//                System.out.println("Credenciales Incorrectas");
//                break;
//            }
//        }
//    }

    public void login() throws IOException {
        System.out.println("Bienvenido a Aeropuerto ESPOL");
        System.out.println("Ingrese su username: ");
        String username = sc.nextLine();
        System.out.println("Ingrese su password: ");
        String password = sc.nextLine();
        password = t.getEncstr(password);
        ArrayList<String> logindata = new ArrayList<String>();
        logindata = t.readFile("files/user.txt");
        boolean login = false;
        for (String item : logindata){
            String[] fields = item.split(s);
            String user = fields[4];
            String pass = fields[5];
            String rol = fields[6];
            if (username.equals(user) && password.equals(pass)) {
                login = true;
                System.out.println("Credenciales correctas");
                switch (rol) {
                    case "Admin":
                        Admin admin = new Admin();
                        try {
                            menu(admin);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "Cashier":
                        Cashier cashier = new Cashier();
                        menu(cashier);
                        break;
                    case "Planner":
                        Planner planner = new Planner();
                        menu(planner);
                        break;
                }
                break;
            }

        }
        if (login=false){
            System.out.println("Ingrese correctamente sus credenciales.");
        }
    }
    
    
    
}
