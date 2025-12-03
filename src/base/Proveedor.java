package base;

public class Proveedor {
    // Solo accesible dentro de la misma clase
    // No accesible desde otras clases
    // No accesibles desde clases hijas
    private int id;
    // Accesible a otras clases
    // Clases hijas
    // Objetos externos
    public String name;
    // Accesible a la clase proveedor
    // Clases hijas
    // No accesibles directamente desde otras clases externas
    protected String pais;

    // Contructor
    public Proveedor (int id,String name, String pais){
        this.id = id;
        this.name = name;
        this.pais = pais;
    }

    public void mostrarProveedor(){
        System.out.printf("El id del proveedor es: %d", this.id);
    }
    public void nombreProveedor(){
        System.out.printf("El nombre del proveedor es: %s", this.name);
    }
    public void paisProveedor(){
        System.out.printf("El pais del proveedor es: %s", this.pais);
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getPais(){
        return pais;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPais(String pais){
        this.pais = pais;
    }
}
