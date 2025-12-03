package base;

public class Alumno {
    // Predeterminadamente deben ser private, para proteger los datos de otras clases
    private int id;
    private String nombre;
    private String apellido;

    public Alumno(){

    }

    public Alumno(int id, String nombre, String apellido){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // metodos controlados getters y setters, para poder leer/ver y modificar
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }
}
