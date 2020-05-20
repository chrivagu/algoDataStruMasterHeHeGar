package TDAVideoTuto15;

public class Lista {
    protected Nodo inicio, fin; //Punteros para saber donde esta el inicio y el fin

    public Lista() {
        inicio = null;
        fin = null;
    }

    //Metodo para saber si la lista esta vacia
    public boolean estaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    //Metodo para agregar un Nodo al inicio de la lista
    public void agregarAlInicio(int elemento) {
        //Creando al nodo
        inicio = new Nodo(elemento, inicio);
        if (fin == null) {
            fin = inicio;
        }
    }

    //Metodo para insertar al final de la lista
    public void agregarAlFinal(int elemento) {
        if (!estaVacia()) {
            fin.siguiente = new Nodo(elemento);
            fin = fin.siguiente;
        } else {
            inicio = fin = new Nodo(elemento);
        }
    }

    //Metodo para mostrar los datos
    public void mostrarLista() {
        Nodo recorrer = inicio;
        System.out.println();
        while (recorrer != null) {
            System.out.print("[" + recorrer.dato + "]--->");
            recorrer = recorrer.siguiente;
        }
    }

    //Metodo para eliminar un nodo del inicio
    public int borrarDelInicio() {
        int elemento = inicio.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            inicio = inicio.siguiente;
        }
        return elemento;
    }

    //Metodo para eliminar un nodo del final
    public int borrarDelFinal() {
        int elemento = fin.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            Nodo temporal = inicio;
            while (temporal.siguiente != fin) {
                temporal = temporal.siguiente;
            }
            fin = temporal;
            fin.siguiente = null;
        }
        return elemento;
    }

    //metodo para eliminar un Nodo en especificio
    public void eliminar(int elemento) {
        if (!estaVacia()) {
            if (inicio == fin && elemento == inicio.dato) {
                inicio = fin = null;
            } else if (elemento == inicio.dato) {
                inicio = inicio.siguiente;
            } else {
                Nodo anterior, temporal;
                anterior = inicio;
                temporal = inicio.siguiente;
                while (temporal != null && temporal.dato != elemento) {
                    anterior = anterior.siguiente;
                    temporal = temporal.siguiente;
                }
                if (temporal != null) {
                    anterior.siguiente = temporal.siguiente;
                    if (temporal == fin) {
                        fin = anterior;
                    }
                }
            }
        }
    }
}
