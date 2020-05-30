package listas.TDAVideoTuto23;

import javax.swing.*;

public class TDAVideoTuto23 {
    public static void main(String[] args) {
        ListaLC listita = new ListaLC();
        int opcion = 0, elemento;
        boolean eliminado = false;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un nodo a la lista circular\n"
                                + "2. Eliminar un nodo de la lista circular\n"
                                + "3. Mostrar los datos de la lista circular\n"
                                + "4. Salir\n"
                                + "Que deseas Hacer?",
                        "Menu de Opciones",
                        JOptionPane.INFORMATION_MESSAGE));

                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento del Nodo", "Agregando Nodo la lista circular",
                                JOptionPane.INFORMATION_MESSAGE));
                        listita.insertar(elemento);
                        break;
                    case 2:
                        if (!listita.estaVacia()) {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el elemento del Nodo a eliminar", "eliminando nodo de la lista circular",
                                    JOptionPane.INFORMATION_MESSAGE));
                            eliminado = listita.eliminar(elemento);
                            if (eliminado) {
                                JOptionPane.showMessageDialog(null, "el elemento eliminado es " + elemento,
                                        "Eliminando nodos", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "el elemento " + elemento + " no esta en la lista",
                                        "Elemento no encontrado", JOptionPane.INFORMATION_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Aun no hay nodos",
                                    "Lista Vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if (!listita.estaVacia()) {
                            listita.mostrarLista();
                        } else {
                            JOptionPane.showMessageDialog(null, "Aun no hay nodos",
                                    "Lista Vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Aplicacion Finalizada",
                                "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "La opcion no esta en el menu",
                                "Incorrecto", JOptionPane.INFORMATION_MESSAGE);

                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }
        } while (opcion != 4);
    }
}
