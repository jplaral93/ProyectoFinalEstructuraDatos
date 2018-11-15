/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

/**
 * Define las operaciones básicas de una cola
 * @author Juan
 * @param <G> tipo genérico para los objetos almacenados por los nodos de la
 * cola
 */
public class Cola<G> {
    private Nodo<G> cabeza;
    private Nodo<G> cola;

    public Cola() {
        this.cabeza = null;
        this.cola = null;
    }
    
    /**
     * Verifica si la cola está vacia.
     * @return true si la cola está vacia, en caso contrario false
     */
    public boolean esVacia(){
        return (this.cabeza==null);
    }
    
    /**
     * Agrega un nodo al final de la cola
     * @param dato es el objeto que se agegará al final de la cola
     */
    public void encolar(G dato){
        Nodo nuevo = new Nodo(dato);
        if (esVacia()) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            cola = nuevo;
        }
    }
    
    /**
     * Agrega un nodo al inicio de la cola con prioridad
     * @param dato es el objeto que se agegará al inicio de la cola
     */
    public void encolarConPrioridad(G dato){
        Nodo nuevo = new Nodo(dato);
        if (esVacia()) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            Nodo aux = cabeza;
            nuevo.siguiente = aux;
            cabeza = nuevo;
        }
    }
    
    /**
     * Cuenta los nodos que tiene la cola
     * @return cantidad de nodos que tiene la cola
     */
    public int dimension(){
        int con=0;
        Nodo actual=cabeza;
        while(actual!=null){
            con++;
            actual=actual.siguiente;
        }
        return con;
    }
    
    /**
     * Quita el primer nodo de la cola y muestra el dato que había en él
     * @return primer dato
     */
    public G desencolar(){
        if (esVacia()) {
            return null;
        }
        G dato = cabeza.dato;
        Nodo aux = cabeza.siguiente;
        cabeza.siguiente = null;
        cabeza = aux;
        return dato;
    }
    
    /**
     * Ubica el objeto contenido en un nodo que se encuentre en una determinada
     * posición en la cola
     * @param indice posición en la que se encuentra el nodo que se quiere 
     * obtener
     * @return el objeto contenido en el nodo de la posición índice
     */
    public G obtener(int indice){
        int con=1;
        if (this.esVacia() || indice<0 || indice>this.dimension()-1) {
            throw new ArrayIndexOutOfBoundsException();
        } 
        if (indice==0) {
            return cabeza.dato;
        } else {
            Nodo actual=cabeza.siguiente;
            while (con<indice) {                
                actual=actual.siguiente;
                con++;
            }
            G encontrado = (G) actual.dato;
            return encontrado;
        }
    }
    
    /**
     * Agrega un nodo a la cola en la posición indicada
     * @param n nodo a agregar en la posición indicada
     * @param indice número de posición en la cual se encontrará el nodo que 
     * se quiere insertar
     */
    public void insertar(int indice, G n){
        int cont=1;
        Nodo insertar = new Nodo(n);
        if (this.esVacia() || indice < 0 || indice > this.dimension()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (indice == 0) {//si indice es cero el nodo a insertar será la cabeza
            Nodo aux = cabeza;
            cabeza = insertar;
            cabeza.siguiente = aux;
        } else if(indice == dimension()){//si indice es igual a dimension
            //el nodo a insertar estará al final
            Nodo actual = cabeza;
            while (cont<indice) {                
                actual = actual.siguiente;
                cont++;
            }
            cola = insertar;
            actual.siguiente = cola;
            cola.siguiente = null;
        } else {//si indice no es cero ni es de dimension, el nodo a insertar
            //será intermedio
            Nodo actual = cabeza;
            while (cont < indice) {//el ciclo avanza hasta el nodo anterior al
                //que será el siguiente del que se incluya
                actual=actual.siguiente;
                cont++;                
            }
            Nodo aux = actual.siguiente;
            actual.siguiente = insertar;
            insertar.siguiente = aux;
        }
    }
}
