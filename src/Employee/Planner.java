package Employee;

public class Planner extends Employee {
    String codVuelo, fechaEmbarque, horaEmbarque, fechaSalida, horaSalida, fechaArribo, horaArribo, codIataSalida, codIataArribo;
    int puertaEsalida, puertaEarribo;

    public Planner(String cedula, String nombre, String apellido, String email, String usuario, String clave, String rol, String aeroline, String department) {
        super(cedula, nombre, apellido, email, usuario, clave, rol, aeroline, department);
    }

}
