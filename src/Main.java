import base.Proveedor;

public class Main {
    public static void main(String[] Args){
        Proveedor proveedor = new Proveedor(1, "Daniel");

        proveedor.getId();
        proveedor.getName();

        System.out.println("El nombre del proveedor es: " + proveedor.getName());
        System.out.println("El id del proveedor es: " + proveedor.getId());
    }
}
