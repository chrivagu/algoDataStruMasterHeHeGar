package TDAVideoTuto10;

public class TDAVideoTuto10 {
    public Integer acumulador = 1;

    public static void main(String[] args) {
        TDAVideoTuto10 obj = new TDAVideoTuto10();
        System.out.println("El factorial de 4 mediante metodo recursivo es " +
                obj.factorialRecursivo(4));
        System.out.println("El factorial de 4 mediante un metodo con ciclo es " +
                obj.factorialCiclo(4));
    }

    //Creando el metodo factorial de manera recursiva
    public int factorialRecursivo(int n) {
        //validando
        if (n < 0) {
            return 0;
        } else {
            //Caso Base
            if (n == 0) {
                return 1;
            } else {
                //Dominio (problema - 1)
                return n * factorialRecursivo(n - 1);
            }
        }
    }

    //Creando metodo factorial mediante ciclo
    public int factorialCiclo(int n) {
        int factor = 1;
        if (n < 0) {
            return 0;
        } else {
            while (n != 0) {
                factor = factor * n;
                n--;
            }
            return factor;
        }
    }

}
