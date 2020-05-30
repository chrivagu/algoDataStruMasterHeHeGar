package listas.TDAVideoTuto15;

import javax.swing.*;

public class TDAVideoTuto15 {
    public static void main(String[] args) {
        Lista listita = new Lista();
        int opcion = 0, el;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un elemento al inicio de la lista\n2. Agregar un elemento al final de la lista\n"
                                + "3. Mostrar los Datos de la lista\n"
                                + "4. Eliminar un Elemento del Inicio de la lista\n"
                                + "5. Eliminar un Elemento del Final de la lista\n"
                                + "6. Eliminar un Elemento en Especifico\n"
                                + "7. Buscar un Elemento en la lista\n"
                                + "8. Salir", "Menu de Opciones", 3));
                switch (opcion) {
                    case 1:
                        try {
                            el = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el Elemento:", "Insertando al inicio", 3));
                            //Agregando al Nodo
                            listita.agregarAlInicio(el);
                        } catch (NumberFormatException n) {
                            JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
                        }
                        break;
                    case 2:
                        try {
                            el = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el Elemento:", "Insertando al final", 3));
                            //Agregando al Nodo
                            listita.agregarAlFinal(el);
                        } catch (NumberFormatException n) {
                            JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
                        }
                        break;
                    case 3:
                        listita.mostrarLista();
                        break;
                    case 4:
                        el = listita.borrarDelInicio();
                        JOptionPane.showMessageDialog(null, "El elemento eliminado es " + el,
                                "eliminando nodo del inicio", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 5:
                        el = listita.borrarDelFinal();
                        JOptionPane.showMessageDialog(null, "El elemento eliminado es " + el,
                                "eliminando nodo del final", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        el = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el " +
                                        "Elemento a Eliminar...", "Eliminando Nodos en Especifico",
                                JOptionPane.INFORMATION_MESSAGE));
                        if (listita.estaEnLaLista(el)) {
                            listita.eliminar(el);
                            JOptionPane.showMessageDialog(null, "El elemento eliminado es " + el,
                                    "eliminando nodo en Especifico", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "El Elemento "
                                    + el + " No esta en la Lista ", "Nodo No Encontrado", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 7:
                        el = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el " +
                                        "Elemento a Buscar...", "Buscando Nodos en la Lista",
                                JOptionPane.INFORMATION_MESSAGE));
                        if (listita.estaEnLaLista(el)) {
                            JOptionPane.showMessageDialog(null, "El Elemento "
                                    + el + " Si esta en la Lista ", "Nodo Encontrado", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "El Elemento "
                                    + el + " No esta en la Lista ", "Nodo No Encontrado", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 8:
                        JOptionPane.showMessageDialog(null, "Programa Finalizado");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
            }
        } while (opcion != 8);
    }
}
