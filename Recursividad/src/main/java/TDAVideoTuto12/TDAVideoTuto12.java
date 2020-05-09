package TDAVideoTuto12;

public class TDAVideoTuto12 {
    public static void main(String[] args) {
        TDAVideoTuto12 objHanoi = new TDAVideoTuto12();
        objHanoi.torresHanoi(4, 1, 2, 3);
        System.out.println("Juego Completado");
    }

    //Creando el metodo recursivo para solucionar las torres de Hanoi
    public void torresHanoi(int discos, int torre1, int torre2, int torre3) {
        //Caso Base
        if (discos == 1) {
            System.out.println("Mover Diso de Torre " + torre1 + " a Torre " + torre3);
        } else {
            //Dominio
            torresHanoi(discos - 1, torre1, torre3, torre2);
            System.out.println("Mover Diso de Torre " + torre1 + " a Torre " + torre3);
            torresHanoi(discos - 1, torre2, torre1, torre3);
        }
    }
}
