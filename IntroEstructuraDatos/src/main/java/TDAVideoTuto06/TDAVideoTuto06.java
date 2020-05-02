package TDAVideoTuto06;

import javax.swing.*;
import java.util.Arrays;

public class TDAVideoTuto06 {

    public static void main(String[] args) {
        int numeros[] = new int[5];
        String palabras[] = new String[5];
        int numerotes[] = new int[numeros.length];
        int i;
        for (i = 0; i < 5; i++) {
            numeros[i] = Integer.parseInt(JOptionPane
                    .showInputDialog(null, "Ingresa el elemento del índice " + i));
        }
        // Mostramos los datos como los Ingresamos
        System.out.println("Los datos sin Ordenar son:");
        for (i = 0; i < 5; i++) {
            System.out.print("[" + numeros[i] + "]");
        }

        System.out.println("\nLos datos Ordenados son:");
        Arrays.sort(numeros); //Aqui ordenamos al arreglo numeros

        for (i = 0; i < 5; i++) {
            System.out.print("[" + numeros[i] + "]");
        }

        //Rellenando al arreglo palabras
        Arrays.fill(palabras,"Bienvenido a la fiesta");
        System.out.println("\nElementos del arreglo palabras");
        for (i = 0; i < 5; i++) {
            System.out.print("[" + palabras[i] + "]");
        }
        //Copiando los elementos del arreglo numeros a numerotes
        System.arraycopy(numeros,0,numerotes,0,numeros.length);

        System.out.println("\nElementos del arreglo numerotes");
        for (i = 0; i < 5; i++) {
            System.out.print("[" + numerotes[i] + "]");
        }
    }
}
