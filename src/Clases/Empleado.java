package Clases;

public class Empleado extends Persona{
    protected float salarioBase;
    protected int horasTrabaajadas;
    protected boolean administrativo;

    public Empleado(float salarioBase, int horasTrabaajadas, boolean administrativo, String Nombre, String apellidos, String cedula, String email, String edad, String telefono) {
        super(Nombre, apellidos, cedula, email, edad, telefono);
        this.salarioBase = salarioBase;
        this.horasTrabaajadas = horasTrabaajadas;
        this.administrativo = administrativo;
    }

    public Empleado() {
    }
        
        
        
}
