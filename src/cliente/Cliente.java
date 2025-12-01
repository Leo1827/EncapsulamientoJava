package cliente;

import base.Persona;

public class Cliente extends Persona {

    private String numeroCliente;

    public Cliente(String nombre, int edad, String direccion, String pais, String numeroCliente) {
        super(nombre, edad, direccion, pais);
        this.numeroCliente = numeroCliente;
    }
    
    public void mostrarCliente() {
        System.out.println("Numero de cliente: " + numeroCliente);
        mostrarEdad();
        System.out.println("Nombre: " + getNombre());
    }
}
