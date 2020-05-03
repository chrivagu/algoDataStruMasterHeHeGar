package TDAVideoTuto07;

import javax.swing.*;
import java.util.ArrayList;

public class TDAVideoTuto07 {

    public static void main(String[] args) {
        ArrayList<String> cadenas; //Creando un objeto o instancia de tipo ArrayList
        cadenas = new ArrayList<String>();
        String frase, respuesta;
        do {
            frase = JOptionPane.showInputDialog(null, "Ingresa la Frase: ");
            //Agregando las frases a la lista
            cadenas.add(frase);
            respuesta = JOptionPane.showInputDialog(null, "Deseas Ingesar Otra Frase (SI/NO)?");
            respuesta = respuesta.toUpperCase();
        } while (!respuesta.equals("NO"));
        //Mostrando el contenido de cadenas
        System.out.println("Frases Originales");
        for (int i = 0; i < cadenas.size(); i++) {
            System.out.println(cadenas.get(i));
        }
        //Utilizando el metodo set
        cadenas.set(1, "la que modifique");
        System.out.println("Frases Modificadas");
        for (int i = 0; i < cadenas.size(); i++) {
            System.out.println(cadenas.get(i));
        }
        cadenas.remove(0);
        System.out.println("Frase que nos quedan");
        for (int i = 0; i < cadenas.size(); i++) {
            System.out.println(cadenas.get(i));
        }
    }
}
