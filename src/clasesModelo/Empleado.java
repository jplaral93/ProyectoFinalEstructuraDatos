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
public class Empleado extends Persona{
    public String cargo;

    public Empleado(String cargo, String id, String nombre, String direccion, 
            String telefono) {
        super(id, nombre, direccion, telefono);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
