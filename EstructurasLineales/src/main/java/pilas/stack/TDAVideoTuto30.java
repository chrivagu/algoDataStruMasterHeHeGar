package pilas.stack;

import java.util.Stack;

public class TDAVideoTuto30 {
    public static void main(String[] args) {

        Stack pilita = new Stack();
        System.out.println("La Pila esta Vacia? " + pilita.isEmpty());
        pilita.push(10);
        pilita.push(20);
        pilita.push(30);
        pilita.push(40);
        pilita.push(50);

        System.out.println("Tamaño de la Pia " + pilita.size());
        System.out.println("La cima es " + pilita.peek());
        System.out.println("Sacando a un elemento de la Pila " + pilita.pop());
        System.out.println("Sacando a un elemento de la Pila " + pilita.pop());
        System.out.println("Tamaño de la Pila " + pilita.size());
        System.out.println("La Pila esta Vacia? " + pilita.isEmpty());
    }
}
