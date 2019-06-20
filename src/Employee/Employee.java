package Employee;

import Items.Aeroline;
import Items.Department;

public abstract class Employee {
    int cedula;
    String nombre, apellido, email, usuario, clave, rol;
    Items.Aeroline aeroline;
    Items.Department department;

    public Employee(int cedula, String nombre, String apellido, String email, String usuario, String clave, String rol, Aeroline aeroline, Department department) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.usuario = usuario;
        this.clave = clave;
        this.rol = rol;
        this.aeroline = aeroline;
        this.department = department;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Aeroline getAeroline() {
        return aeroline;
    }

    public void setAeroline(Aeroline aeroline) {
        this.aeroline = aeroline;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
