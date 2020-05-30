package pilas.memoriaDinamica;

import javax.swing.*;

public class TDAVideoTuto27 {
    public static void main(String[] args) {
        int opcion = 0, elemento = 0;
        Pila pilita = new Pila();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Empujar un elemento en la Pila\n"
                                + "2. Sacar un elemento de la Pila\n"
                                + "3. La Pila esta vacia?\n"
                                + "4. Que elemento esta en la cima?\n"
                                + "5. Tamaño de la Pila?\n"
                                + "6. Vaciar pila\n"
                                + "7. Salir\n"
                                + "Que deseas Hacer?", "Menu de Opciones", JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento a empujar en la pila", "Apilando datos", JOptionPane.INFORMATION_MESSAGE));
                        pilita.empujar(elemento);
                        break;
                    case 2:
                        if (!pilita.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "El elemento obtenido es " + pilita.sacar(),
                                    "Obteniendo datos de la pila", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "la pila esta vacia",
                                    "Pila vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if (pilita.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "la pila esta vacia",
                                    "Pila vacia", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "la pila No esta vacia",
                                    "La pila contiene datos", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!pilita.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "El elemento que se encuentra en la cima es " + pilita.cima(),
                                    "Cima de la Pila", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "la pila esta vacia",
                                    "Pila vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "El tamaño de la pila es " + pilita.tamanioPila(),
                                "Tamaño de la Pila", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        if (!pilita.estaVacia()) {
                            pilita.limpiarPila();
                            JOptionPane.showMessageDialog(null, "La pila se ha vaciado ",
                                    "Vaciando Pila", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "la pila esta vacia, no hay nada que vaciar",
                                    "Pila vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Aplicación Finalizada",
                                "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta",
                                "Error", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }
        } while (opcion != 7);
    }
}
