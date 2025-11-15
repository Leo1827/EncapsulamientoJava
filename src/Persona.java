public class Persona {
    // Ejemplos modificadores de acceso
    private String nombre;
    protected int edad;
    String direccion;
    public String pais;

    public Persona(String nombre, int edad, String direccion, String pais){
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (nombre == null || !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            this.nombre = "El nombre no puede estar vacio";
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    // metodo
    protected void mostrarEdad() {
        System.out.println("Edad: " + this.edad);
    }

    void mostrarDireccion() {
        System.out.println("Direccion: " + this.direccion);
        saludar();
    }

    public void mostrarInfo() {
        System.out.println("nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Direccion: " + this.direccion);
        System.out.println("Pais: " + this.pais);
    }

    public void saludar(){
        System.out.println("Hola mi nombre es: " + this.nombre);
    }

    public void realizarSaludo(){
        saludar();
    }
}
