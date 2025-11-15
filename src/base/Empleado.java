package base;

public class Empleado extends Persona {
    private String puesto;

    public Empleado(String nombre, int edad, String direccion, String pais){
        super(nombre, edad, direccion, pais);
        this.puesto = puesto;
    }

    public void mostrarEmpleado(){
        mostrarEdad();
        mostrarDireccion();
        System.out.println("Pais: " + getPais());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Puesto: " + this.puesto);
    }
}
