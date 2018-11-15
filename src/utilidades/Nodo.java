/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

/**
 * Define los objetos nodo a ser contenidos por una lista simplemente enlazada
 * @author Juan
 * @param <G> tipo genérico para el objeto que será almacenado en cada nodo
 */
public class Nodo<G> {
    protected G dato;
    protected Nodo<G> siguiente;
    
    public Nodo(G dato){
        this.dato = dato;
        siguiente = null;
    }
}
