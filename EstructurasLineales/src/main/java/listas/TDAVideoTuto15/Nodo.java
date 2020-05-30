package listas.TDAVideoTuto15;

public class Nodo {
    public int dato;
    public Nodo siguiente;//Puntero enlace

    //Constructor para insertar al final
    public Nodo(int d) { //ayuda a insertar al final de la lista
        this.dato = d;
        this.siguiente = null;
    }

    //Constructor para insertar al incio
    public Nodo(int d, Nodo n) { //ayuda a insertar al inicio de la lista
        dato = d;
        siguiente = n;
    }
}
