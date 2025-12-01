package base;

public class Proveedor {

    private int id;

    // Contructor
    public Proveedor (int id){
        this.id = id;
    }

    public void mostrarProveedor(){
        System.out.printf("El id del proveedor es: %d", this.id);
    }

    public int getId(){
        return id;
    }
}
