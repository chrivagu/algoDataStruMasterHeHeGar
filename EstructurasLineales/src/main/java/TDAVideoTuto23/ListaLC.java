package TDAVideoTuto23;

import javax.swing.*;

public class ListaLC {
    NodoLC ultimo;

    public ListaLC() {
        ultimo = null;
    }

    //Metodo para saber cuando la lista esta vacia
    public boolean estaVacia() {
        return ultimo == null;
    }

    //Metodo para insertar Nodos
    public ListaLC insertar(int elemento) {
        NodoLC nuevo = new NodoLC(elemento);
        if (ultimo != null) {
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
        }
        ultimo = nuevo;
        return this;
    }

    //Metodo para mostrar la lista
    public void mostrarLista() {
        NodoLC auxiliar = ultimo.siguiente;
        String cadena = "";
        do {
            cadena = cadena + "[" + auxiliar.dato + "]->";
            auxiliar = auxiliar.siguiente;
        } while (auxiliar != ultimo.siguiente);
        JOptionPane.showMessageDialog(null, cadena,
                "Mostrando la lista circular", JOptionPane.INFORMATION_MESSAGE);
    }

}
