package Clases;

public class Persona {
    protected String Nombre;
    protected String apellidos;
    protected String cedula;
    protected String email;
    protected String edad;
    protected String telefono;

    public Persona(String Nombre, String apellidos, String cedula, String email, String edad, String telefono) {
        this.Nombre = Nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.email = email;
        this.edad = edad;
        this.telefono = telefono;
    }

    public Persona() {
    }   
}
