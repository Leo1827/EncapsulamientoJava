import base.Empleado;
import base.Persona;
import cliente.Cliente;

public class Main {
    public static void main(String[] Args){
         Persona persona = new Persona("Juan", 37,"Calle tornado","Colombia" );
         Persona empleado = new Empleado("Mileer", 33,"Calle 7", "Argentina", "Desarrollador");
         Cliente cliente = new Cliente("Mile", 22,"Calle 12", "Colombia", "0001");

         persona.mostrarInfo();
         empleado.mostrarInfo();
         cliente.mostrarCliente();
    }
}
