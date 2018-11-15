/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesModelo;

/**
 *
 * @author Juan
 */
public class Disfraz extends Prenda{
    private String nombre;

    public Disfraz(String nombre, String ref, String color, String marca, 
            String talla, double valorAlquiler) {
        super(ref, color, marca, talla, valorAlquiler);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
