import base.Alumno;
import base.Proveedor;
import base.Persona;

public class Main {
    public static void main(String[] Args){
        Alumno alumno = new Alumno();
        Alumno alumnoTwo = new Alumno(2, "Suscribete", "Rincon");

        System.out.println("Id: " + alumnoTwo.getId());
        System.out.println("Nombre: " + alumnoTwo.getNombre());
        System.out.println("Apellido: " + alumnoTwo.getApellido());
    }
}
