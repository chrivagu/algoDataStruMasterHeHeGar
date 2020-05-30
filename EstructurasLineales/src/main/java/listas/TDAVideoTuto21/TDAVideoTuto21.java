package listas.TDAVideoTuto21;

import javax.swing.*;

public class TDAVideoTuto21 {

    public static void main(String[] args) {
        ListaDoble listita = new ListaDoble();
        int opcion = 0, elemento;

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un nodo al incio\n"
                                + "2. Agregar un Nodo al Final\n"
                                + "3. Mostrar la lista de inicio a fin\n"
                                + "4. Mostrar la lista de fin a inicio\n"
                                + "5. Eliminar un Nodo del Inicio\n"
                                + "6. Eliminar un Nodo del Final\n"
                                + "7. Salir\n"
                                + "Que deseas Hacer?",
                        "Menu de Opciones",
                        JOptionPane.INFORMATION_MESSAGE));

                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento del Nodo", "Agregando Nodo al inicio",
                                JOptionPane.INFORMATION_MESSAGE));
                        listita.agregarAlInicio(elemento);
                        break;
                    case 2:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento del Nodo", "Agregando Nodo al final",
                                JOptionPane.INFORMATION_MESSAGE));
                        listita.agregarAlFinal(elemento);
                        break;
                    case 3:
                        if (!listita.estVacia()) {
                            listita.mostrarListaInicioFin();
                        } else {
                            JOptionPane.showMessageDialog(null, "No Hay nodos aun",
                                    "Lista vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!listita.estVacia()) {
                            listita.mostrarListaFinInicio();
                        } else {
                            JOptionPane.showMessageDialog(null, "No Hay nodos aun",
                                    "Lista vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        if (!listita.estVacia()) {
                            elemento = listita.eliminarDelInicio();
                            JOptionPane.showMessageDialog(null, "El elemento eliminado es " + elemento,
                                    "Eliminando nodo del inicio", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "No Hay nodos aun",
                                    "Lista vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                        if (!listita.estVacia()) {
                            elemento = listita.eliminarDelFinal();
                            JOptionPane.showMessageDialog(null, "El elemento eliminado es " + elemento,
                                    "Eliminando nodo del final", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "No Hay nodos aun",
                                    "Lista vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 7:
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
        } while (opcion != 7);
    }
}
