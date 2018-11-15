/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

/**
 * Define las operaciones básicas de una lista simplemente enlazada
 * @author Juan
 * @param <G> tipo genérico para los objetos almacenados por los nodos de la
 * lista
 */
public class ListaEnlazada<G> {
    private Nodo<G> primero;
    private Nodo<G> ultimo;

    public ListaEnlazada() {
        this.primero = null;
        this.ultimo = null;
    }
    
    /**
     * Verifica si la lista está vacia.
     * @return true si la lista está vacia, en caso contrario false
     */
    public boolean esVacia(){
        return (this.primero==null);
    }
    
    /**
     * Agrega un nodo al final de la lista
     * @param dato es el objeto que se agegará a la lista
     */
    public void agregar(G dato){
        if (esVacia()) {
            Nodo nuevo = new Nodo(dato);
            primero = nuevo;
            ultimo = nuevo;
        } else {
            Nodo nuevo = new Nodo(dato);
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
    }
    
    /**
     * Cuenta los nodos que tiene la lista
     * @return cantidad de nodos que tiene la lista
     */
    public int dimension(){
        int con=0;
        Nodo actual=primero;
        while(actual!=null){
            con++;
            actual=actual.siguiente;
        }
        return con;
    }
    
    /**
     * Ubica el objeto contenido en un nodo que se encuentre en una determinada
     * posición en la lista
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
            return primero.dato;
        } else {
            Nodo actual=primero.siguiente;
            while (con<indice) {                
                actual=actual.siguiente;
                con++;
            }
            G encontrado = (G) actual.dato;
            return encontrado;
        }
    }
    
    /**
     * Quita un nodo de la lista
     * @param indice número de posición en la cual se encuentra el nodo que se
     * quiere eliminar
     */
    public void remover(int indice){
        int cont=1;
        if (this.esVacia() || indice < 0 || indice > this.dimension()-1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (indice == 0) {//si indice es cero el nodo a remover es el primero
            Nodo aux = primero.siguiente;
            primero.siguiente = null;
            primero = aux;
        } else if(indice == dimension()-1){//si indice es igual a dimension-1
            //el nodo a remover es el último
            Nodo actual = primero;
            while (cont<indice) {                
                actual= actual.siguiente;
                cont++;
            }
            actual.siguiente = null;
            ultimo = actual;
        } else {//si indice no es cero ni es de dimension-1, el nodo a remover
            //es intermedio
            Nodo actual = primero;
            while (cont < indice) {//el ciclo avanza hasta el nodo anterior al
                //que se va a remover
                actual=actual.siguiente;
                cont++;                
            }
            Nodo eliminar = actual.siguiente;//referencia del nodo a eliminar
            actual.siguiente = eliminar.siguiente;//cambio de apuntador 
            //siguiente del nodo que está antes del nodo a eliminar
            eliminar.siguiente = null;//cambio de apuntador siguiente del nodo 
            //a eliminar para que quede suelto de la lista
        }
    }
    
    /**
     * Agrega un nodo a la lista en la posición indicada
     * @param n nodo a agregar en la posición indicada
     * @param indice número de posición en la cual se encontrará el nodo que se
     * quiere insertar
     */
    public void insertar(int indice, G n){
        int cont=1;
        Nodo insertar = new Nodo(n);
        if (this.esVacia() || indice < 0 || indice > this.dimension()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (indice == 0) {//si indice es cero el nodo a insertar es el primero
            Nodo aux = primero;
            primero = insertar;
            primero.siguiente = aux;
        } else if(indice == dimension()){//si indice es igual a dimension
            //el nodo a insertar estará al final
            Nodo actual = primero;
            while (cont<indice) {                
                actual = actual.siguiente;
                cont++;
            }
            ultimo = insertar;
            actual.siguiente = ultimo;
            ultimo.siguiente = null;
        } else {//si indice no es cero ni es de dimension, el nodo a insertar
            //será intermedio
            Nodo actual = primero;
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
    
    /**
     * Permite  cambiar el dato de un nodo
     * @param dato es el dato a cambiar de un nodo
     * @param indice es la posición del nodo a cambiar
     */
    public void cambiarDato(G dato, int indice){
        int cont = 1;
        if (this.esVacia() || indice < 0 || indice > this.dimension()-1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (indice == 0){//Si indice es 0 el nodo primero cambia el dato
            primero.dato = dato;
        } else if(indice == this.dimension()-1){//Si indice es igual a 
            //dimension-1 el nodo último cambia el dato 
            ultimo.dato = dato;            
        } else {//Si el indice no es igual 0 o dimension-1 el nodo intermedio
            //cambia el dato
            Nodo actual = primero.siguiente;
            while (cont<indice) {//El ciclo avanza hasta el nodo anterior que 
                //quiere remover
                actual = actual.siguiente;
                cont++;
            }
            actual.dato = dato;
        }
    }
}
