import base.Proveedor;
import base.Persona;

public class Main {
    public static void main(String[] Args){
        Proveedor proveedor = new Proveedor(1, "Daniel", "Colombia");
        // get
        proveedor.getId();
        proveedor.getName();
        proveedor.name = "Mileer"; // no hay error es publico
        proveedor.pais = "Colombia"; // Errores sobre protected
        proveedor.id = 2; // Error sobre private
        // set
        proveedor.setId(2);
        proveedor.setName("Juan");

        System.out.println("El nombre del proveedor es: " + proveedor.getName());
        System.out.println("El id del proveedor es: " + proveedor.getId());

        Persona persona = new Persona("Juan", 37,"Calle tornado","Colombia" );
        persona.mostrarInfo();
    }
}
