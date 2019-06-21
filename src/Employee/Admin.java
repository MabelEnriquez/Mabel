package Employee;

public class Admin extends Employee{


    public Admin(String cedula, String nombre, String apellido, String email, String usuario, String clave, String rol, String aeroline, String department) {
        super(cedula, nombre, apellido, email, usuario, clave, rol, aeroline, department);
    }

    public Admin(){

    }

    @Override
    public String toString() {
        return "Admin{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", usuario='" + usuario + '\'' +
                ", clave='" + clave + '\'' +
                ", rol='" + rol + '\'' +
                ", aeroline='" + aeroline + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
