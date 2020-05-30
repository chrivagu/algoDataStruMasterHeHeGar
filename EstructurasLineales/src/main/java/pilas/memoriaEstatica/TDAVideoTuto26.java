package pilas.memoriaEstatica;

import pilas.memoriaEstatica.Pila;

import javax.swing.*;

public class TDAVideoTuto26 {
    public static void main(String[] args) {
        int opcion = 0, elemento, tamanio;
        boolean estado = false;
        try {
            tamanio = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "De que tamaño quieres la Pila?", "Solicitando el tamaño", JOptionPane.INFORMATION_MESSAGE));
            Pila pilita = new Pila(tamanio);

            do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Empujar un elemento en la Pila\n"
                                + "2. Sacar un elemento de la Pila\n"
                                + "3. La Pila esta vacia?\n"
                                + "4. La Pila esta llena?\n"
                                + "5. Que elemento esta en la cima?\n"
                                + "6. Limpiar pila\n"
                                + "7. Tamaño de la Pila\n"
                                + "8. Salir\n"
                                + "Que deseas Hacer?", "Menu de Opciones", JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento a empujar en la pila", "Apilando datos", JOptionPane.INFORMATION_MESSAGE));
                        if (!pilita.estaLlena()) {
                            pilita.empujar(elemento);
                        } else {
                            JOptionPane.showMessageDialog(null, "la pila esta llena",
                                    "pila llena", JOptionPane.INFORMATION_MESSAGE);
                        }
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
                        if (pilita.estaLlena()) {
                            JOptionPane.showMessageDialog(null, "la pila esta Llena",
                                    "Pila Llena", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "la pila No esta Llena",
                                    "La pila contiene espacio aun", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        if (!pilita.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "El elemento que se encuentra en la cima es " + pilita.cimaPila(),
                                    "Cima de la Pila", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "la pila esta vacia",
                                    "Pila vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                        while (!pilita.estaVacia()) {
                            pilita.sacar();
                        }
                        JOptionPane.showMessageDialog(null, "Limpiando la pila ",
                                "Limpiar pila", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "El tamaño de la pila es " + pilita.tamanioPila(),
                                "Tamaño de la pila", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 8:
                        JOptionPane.showMessageDialog(null, "Aplicación Finalizada",
                                "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta",
                                "Error", JOptionPane.INFORMATION_MESSAGE);
                }
            } while (opcion != 8);
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
        }
    }
}
