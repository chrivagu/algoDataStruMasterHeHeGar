package TDAVideoTuto23;

import javax.swing.*;

public class TDAVideoTuto23 {
    public static void main(String[] args) {
        ListaLC listita = new ListaLC();
        int opcion = 0, elemento;
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
                       /* elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento del Nodo", "Agregando Nodo al final",
                                JOptionPane.INFORMATION_MESSAGE));
                        listita.agregarAlFinal(elemento);*/
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
