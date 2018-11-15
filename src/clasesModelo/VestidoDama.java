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
public class VestidoDama extends Prenda{
    private boolean pedreria;
    private String altura;
    private short cantPiezas;

    public VestidoDama(boolean pedreria, String altura, short cantPiezas, 
            String ref, String color, String marca, String talla, double 
                    valorAlquiler) {
        super(ref, color, marca, talla, valorAlquiler);
        this.pedreria = pedreria;
        this.altura = altura;
        this.cantPiezas = cantPiezas;
    }

    public boolean isPedreria() {
        return pedreria;
    }

    public void setPedreria(boolean pedreria) {
        this.pedreria = pedreria;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public short getCantPiezas() {
        return cantPiezas;
    }

    public void setCantPiezas(short cantPiezas) {
        this.cantPiezas = cantPiezas;
    }
    
    
    
}
