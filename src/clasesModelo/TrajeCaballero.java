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
public class TrajeCaballero extends Prenda{
    private String tipo;
    private String aderezo;

    public TrajeCaballero(String tipo, String aderezo, String ref, String color,
            String marca, String talla, double valorAlquiler) {
        super(ref, color, marca, talla, valorAlquiler);
        this.tipo = tipo;
        this.aderezo = aderezo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAderezo() {
        return aderezo;
    }

    public void setAderezo(String aderezo) {
        this.aderezo = aderezo;
    }
    
    
}
