/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesModelo;

import java.util.Date;
import utilidades.ListaEnlazada;

/**
 *
 * @author Juan
 */
public class ServicioAlquiler {
    private int numero;
    private final Date fechaSolic;
    private Date fechaAlqui;
    private final ListaEnlazada<Prenda> prendasAlquiladas;
    private Cliente cliente;
    private Empleado empleado;

    public ServicioAlquiler(int numero, Date fechaSolic, Date fechaAlqui,
            Cliente cliente, Empleado empleado) {
        this.numero = numero;
        this.fechaSolic = fechaSolic;
        this.fechaAlqui = fechaAlqui;
        prendasAlquiladas = new ListaEnlazada();
        this.cliente = cliente;
        this.empleado = empleado;
    }

    public ListaEnlazada<Prenda> getPrendasAlquiladas() {
        return prendasAlquiladas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFechaAlqui() {
        return fechaAlqui;
    }

    public void setFechaAlqui(Date fechaAlqui) {
        this.fechaAlqui = fechaAlqui;
    }

    public Date getFechaSolic() {
        return fechaSolic;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    
}
