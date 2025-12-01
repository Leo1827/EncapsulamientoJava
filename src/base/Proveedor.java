package base;

public class Proveedor {

    private int id;
    public String name;

    // Contructor
    public Proveedor (int id,String name){
        this.id = id;
        this.name = name;
    }

    public void mostrarProveedor(){
        System.out.printf("El id del proveedor es: %d", this.id);
    }
    public void nombreProveedor(){
        System.out.printf("El nombre del proveedor es: %s", this.name);
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
