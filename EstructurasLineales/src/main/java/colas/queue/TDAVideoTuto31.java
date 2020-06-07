package colas.queue;

import java.util.LinkedList;
import java.util.Queue;

public class TDAVideoTuto31 {
    public static void main(String[] args) {
        Queue<Integer> colita = new LinkedList<Integer>();
        colita.add(10);
        colita.add(20);
        colita.add(30);
        colita.add(40);
        colita.add(50);
        System.out.println("El inicio de la Cola es " + colita.peek());
        int tamanio = colita.size();
        System.out.println("Vaciando la Cola");
        colita.clear();

        while (!colita.isEmpty()) {
            System.out.println("Despachando al elemento " + colita.remove());
        }

    }
}
