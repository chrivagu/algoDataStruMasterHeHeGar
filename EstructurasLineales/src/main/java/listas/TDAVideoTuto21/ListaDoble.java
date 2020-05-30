package listas.TDAVideoTuto21;

import javax.swing.*;

public class ListaDoble {
    private NodoDoble inicio, fin;

    public ListaDoble() {
        inicio = fin = null;
    }

    //Metodo para saber cuando la lista esta vacia
    public boolean estVacia() {
        return inicio == null;
    }

    //Metodo para agregar nodo al final
    public void agregarAlFinal(int el) {
        if (!estVacia()) {
            fin = new NodoDoble(el, null, fin);
            fin.anterior.siguiente = fin;
        } else {
            inicio = fin = new NodoDoble(el);
        }
    }

    //Metodo para agregar al inicio
    public void agregarAlInicio(int el) {
        if (!estVacia()) {
            inicio = new NodoDoble(el, inicio, null);
            inicio.siguiente.anterior = inicio;
        } else {
            inicio = fin = new NodoDoble(el);
        }
    }

    //Metodo para mostrar la lista de inicio a fin
    public void mostrarListaInicioFin() {
        if (!estVacia()) {
            String datos = "<=>";
            NodoDoble auxiliar = inicio;
            while (auxiliar != null) {
                datos = datos + "[" + auxiliar.dato + "]<=>";
                auxiliar = auxiliar.siguiente;
            }
            JOptionPane.showMessageDialog(null, datos,
                    "Mostrando lista de inicio a fin",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    //Metod para mostrar la lista de fin a incio
    public void mostrarListaFinInicio() {
        if (!estVacia()) {
            String datos = "<=>";
            NodoDoble auxiliar = fin;
            while (auxiliar != null) {
                datos = datos + "[" + auxiliar.dato + "]<=>";
                auxiliar = auxiliar.anterior;
            }
            JOptionPane.showMessageDialog(null, datos,
                    "Mostrando lista de inicio a fin",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    //Metodo para eliminar del Inicio
    public int eliminarDelInicio() {
        int elemento = inicio.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            inicio = inicio.siguiente;
            inicio.anterior = null;
        }
        return elemento;
    }

    //Metodo para eliminar del Final
    public int eliminarDelFinal() {
        int elemento = fin.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            fin = fin.anterior;
            fin.siguiente = null;
        }
        return elemento;
    }

}
