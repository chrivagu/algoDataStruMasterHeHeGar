package TDAVideoTuto08;

public class TDAVideoTuto08 {
    public static void main(String[] args) {
        TDAVideoTuto08 objEsc = new TDAVideoTuto08();
        objEsc.bajarEscalera(20);
    }

    //Creando un metodo para bajar una escalera de manera recursiva
    public void bajarEscalera(int escalones){
         if(escalones==0){
             //Caso Base, Respuesta Explicita
             System.out.println("Has terminado de bajar la escalera");
         } else {
             //Dominio, division del problema original en (problema - 1)
             try {
                 Thread.sleep(500);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             System.out.println("Bajando Escalon " + escalones);
             //Haciendo uso de la Recursividad
             bajarEscalera(escalones - 1);
         }
    }
}
