/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesModelo;

import utilidades.Cola;
import utilidades.ListaEnlazada;

/**
 *
 * @author Juan
 */
public class NegocioAlquiler {
    private final ListaEnlazada<Empleado> listaDeEmepleados;
    private final ListaEnlazada<Cliente> listaDeClientes;
    private final ListaEnlazada<Prenda> listaDePrendas;
    private final ListaEnlazada<ServicioAlquiler> alquileres;
    private final Cola<Prenda> listaLavanderia;
    
    public NegocioAlquiler() {
        listaDeEmepleados = new ListaEnlazada();
        listaDeClientes = new ListaEnlazada();
        listaDePrendas = new ListaEnlazada();
        alquileres = new ListaEnlazada();
        listaLavanderia = new Cola();
    }

    public ListaEnlazada<Empleado> getListaDeEmepleados() {
        return listaDeEmepleados;
    }

    public ListaEnlazada<Cliente> getListaDeClientes() {
        return listaDeClientes;
    }

    public ListaEnlazada<Prenda> getListaDePrendas() {
        return listaDePrendas;
    }

    public Cola<Prenda> getListaLavanderia() {
        return listaLavanderia;
    }
    
    public ListaEnlazada<ServicioAlquiler> getAlquileres() {
        return alquileres;
    }
}
