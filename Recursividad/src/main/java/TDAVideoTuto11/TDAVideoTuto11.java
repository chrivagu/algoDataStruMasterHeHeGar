package TDAVideoTuto11;

import java.util.ArrayList;
import java.util.List;

public class TDAVideoTuto11 {
    private ArrayList<Integer> serie = new ArrayList<Integer>();
    private int element = 0;
    private int contador = 0;

    public static void main(String[] args) {
        TDAVideoTuto11 objfibo = new TDAVideoTuto11();
        System.out.println("La sucesion fibonacci de 12 mediante recursividad es "
                + objfibo.fibonacciRecursivo(12));
        System.out.println("La sucesion fibonacci de 12 mediante ciclo es " + objfibo.fibonacciCiclo(12));

        System.out.println("objfibo.fiboCiclo(12) = " + objfibo.fiboCiclo(12));
        System.out.println("objfibo.serieFibonnacci(12): ");
        objfibo.serieFibonnacci(233);
    }

    //Creando el metodo recursivo para obtener el fibonacci de un numero.
    // 1,1,2,3,5,8,13,21,34,55,89,144,233 -> el fibonnaci de 12 es 144
    public int fibonacciRecursivo(int n) {
        if (n == 1 || n == 2) {
            //Caso base(Respuesta explicita)
            return 1;
        } else {
            //Dominio (problema - 1)
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
    }

    //Creando el metodo con ciclo para la sucession fibonacci
    public int fibonacciCiclo(int n) {
        int fibo = 0, primero = 1, segundo = 0;
        while (n > 0) {
            fibo = primero + segundo;
            primero = segundo;
            segundo = fibo;
            n--;
        }
        return fibo;
    }

    /********************************cvalencia**************************/

    //Creando el metodo por medio de ciclo para obtener el fibonacci de un numero.
    public int fiboCiclo(int n) { //si n=4 -> fibonacci=3
        List<Integer> mylist = new ArrayList<Integer>(n);
        int fibonacci = 0;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                mylist.add(1);
            } else if (i == 2) {
                mylist.add(1);
            } else {
                int element = mylist.get(i - 2) + mylist.get(i - 3);
                mylist.add(element);
                fibonacci = element;
            }
        }
        return fibonacci;
    }

    //Para obtener toda la serie fibonacci hasta un numero.
    //Ejemplo hasta el numero 8 seria: 0,1,1,2,3,5,8
    public void serieFibonnacci(int n) {
        if (element > n) {
            System.out.println("la series fibonnacci es = " + serie);
        } else if (contador == 0) {
            serie.add(element);
            element++;
            contador++;
            serieFibonnacci(n);
        } else if (contador == 1) {
            serie.add(element);
            contador++;
            serieFibonnacci(n);
        } else {
            element = serie.get(contador - 2) + serie.get(contador - 1);
            if (element <= n) {
                serie.add(element);
            }
            contador++;
            serieFibonnacci(n);
        }
    }
}
