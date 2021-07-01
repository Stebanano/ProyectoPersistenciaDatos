package Clases;

public class Cliente extends Persona{
    private float deuda;

    public Cliente(float deuda, String Nombre, String apellidos, String cedula, String email, String edad, String telefono) {
        super(Nombre, apellidos, cedula, email, edad, telefono);
        this.deuda = deuda;
    }

    public Cliente() {
    }
    
    
    
    
}
