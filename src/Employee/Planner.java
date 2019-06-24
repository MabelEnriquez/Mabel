package Employee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Planner extends Employee {
    String codVuelo, fechaEmbarque, horaEmbarque, fechaSalida, horaSalida, fechaArribo, horaArribo, codIataSalida, codIataArribo;
    int puertaEsalida, puertaEarribo;
    int numPuertas= 8;

    public Planner(String cedula, String nombre, String apellido, String email, String usuario, String clave, String rol, String aeroline, String department) {
        super(cedula, nombre, apellido, email, usuario, clave, rol, aeroline, department);
    }
    public Planner(){

    }
    public class planificarVuelo {
        public void main(String[] args){
            Scanner eleccion = new Scanner(System.in);
            boolean salir = false;
            int opcion; // Aqui se guarda la opcion elegida por el Planner.
            while (!salir){
                System.out.println("1. Avion 1");
                System.out.println("2. Avion 2");
                System.out.println("3. Avion 3");
                System.out.println("4. Salir");
                try {
                    System.out.println("Selecciona uno de los Aviones");
                    opcion = eleccion.nextInt();
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
                    eleccion.next();
                }
             }
        }

    }
    public void disponibilidadVuelos(){

    }
    private void registrarAviones(){

    }
}
