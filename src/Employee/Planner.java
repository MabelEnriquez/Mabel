package Employee;

import java.sql.Time;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Planner extends Employee {
        public Planner(String cedula, String nombre, String apellido, String email, String usuario, String clave, String rol, String aeroline, String department) {
        super(cedula, nombre, apellido, email, usuario, clave, rol, aeroline, department);
    }
    public Planner(){

    }
    public class planificarVuelo {
        String codVuelo, codIataSalida, codIataArribo, fechaEmbarque, fechaSalida, fechaArribo, horaEmbarque,  horaSalida,  horaArribo;
        int puertaEsalida, puertaEarribo;
        int numPuertas= 8;
        public void main(String[] args){
            Scanner consola = new Scanner(System.in);
            boolean salir = false;
            int opcion; // Aqui se guarda la opcion elegida por el Planner.
            while (!salir){
                System.out.println("1. Avion 1");
                System.out.println("2. Avion 2");
                System.out.println("3. Avion 3");
                System.out.println("4. Salir");
                try {
                    System.out.println("Selecciona uno de los Aviones");
                    opcion = consola.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("Has seleccionado el Avion 1");
                            break;
                        case 2:
                            System.out.println("Has seleccionado el Avion 2");
                            break;
                        case 3:
                            System.out.println("Has seleccionado el Avion 3");
                            break;
                        case 4:
                            salir = true;
                            break;
                        default:
                            System.out.println("Solo números entre 1 y 4");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Debes insertar un número");
                    consola.next();
                }
             }
            System.out.println("Ingrese el codigo del vuelo: ");
            codVuelo = consola.nextLine();
            System.out.println("Ingrese la fecha de embarque: ");
            fechaEmbarque = consola.nextLine();
            System.out.println("Ingrese la hora de embarque: ");
            horaEmbarque = consola.nextLine();
            System.out.println("Ingrese la fecha de salida: ");
            fechaSalida = consola.nextLine();
            System.out.println("Ingrese la hora de salida: ");
            horaSalida = consola.nextLine();
            System.out.println("Ingrese la fecha de arribo: ");
            fechaArribo = consola.nextLine();
            System.out.println("Ingrese la hora de arribo: ");
            horaArribo = consola.nextLine();



        }

    }

    public void disponibilidadVuelos(){
      }
    private void registrarAviones(){

    }
}
