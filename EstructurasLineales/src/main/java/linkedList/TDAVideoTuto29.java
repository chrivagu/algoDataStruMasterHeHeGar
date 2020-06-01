package linkedList;

import java.util.LinkedList;

public class TDAVideoTuto29 {
    public static void main(String[] args) {
        LinkedList listita = new LinkedList();
        listita.add(10);
        listita.add(50);
        listita.add(30);
        listita.add(40);
        listita.add(20);
        int tamanio = listita.size();
        int i = 0;
        while (i < tamanio) {
            System.out.print("[" + listita.get(i) + "]->");
            i++;
        }
        listita.remove(2);
        listita.add(3, 100);
        i = 0;
        tamanio = listita.size();
        System.out.println();
        while (i < tamanio) {
            System.out.print("[" + listita.get(i) + "]->");
            i++;
        }
    }
}
