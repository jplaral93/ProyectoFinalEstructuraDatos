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
public class Cliente extends Persona{
    public String mail;

    public Cliente(String mail, String id, String nombre, String direccion, 
            String telefono) {
        super(id, nombre, direccion, telefono);
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
