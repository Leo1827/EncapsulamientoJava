import base.Proveedor;

public class Main {
    public static void main(String[] Args){
        Proveedor proveedor = new Proveedor(1, "Daniel");
        // get
        proveedor.getId();
        proveedor.getName();
        // set
        proveedor.setId(2);
        proveedor.setName("Juan");

        System.out.println("El nombre del proveedor es: " + proveedor.getName());
        System.out.println("El id del proveedor es: " + proveedor.getId());
    }
}
