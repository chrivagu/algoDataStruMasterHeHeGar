package colas.memoriaDinamica;

import javax.swing.*;

public class TDAVideoTuto28 {
    public static void main(String[] args) {
        int opcion = 0, elemento = 0;
        Cola colita = new Cola();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Insertar un elemento en la Cola\n"
                                + "2. Quitar un Elemento de la Cola\n"
                                + "3. ¿La cola esta vacia?\n"
                                + "4. Elemento ubicado al inicio de la Cola\n"
                                + "5. Tamaño de la Cola\n"
                                + "6. Salir", "Menu de Opciones de una Cola"
                        , JOptionPane.QUESTION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento a Insertar", "Insertando en la Cola"
                                , JOptionPane.QUESTION_MESSAGE));
                        colita.insertar(elemento);
                        break;
                    case 2:
                        if (!colita.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "El elemento Atendido es " + colita.quitar(),
                                    "Quitando Elementos de la Cola", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La Cola esta Vacia ",
                                    "Cola Vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if (colita.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La Cola esta Vacia ",
                                    "Cola Vacia", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La Cola No esta Vacia ",
                                    "Cola No Vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!colita.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "El elemento ubicado al Inicio de la Cola es " + colita.inicioCola(),
                                    "", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La Cola esta Vacia ",
                                    "Cola Vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "El tamaño de la Cola es " + colita.tamnioCola(),
                                "", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Aplicación Finalizada ",
                                "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta ",
                                "!Cuidado!", JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }
        } while (opcion != 6);
    }
}
