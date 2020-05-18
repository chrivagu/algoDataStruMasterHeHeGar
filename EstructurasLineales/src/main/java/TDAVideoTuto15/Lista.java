package TDAVideoTuto15;

public class Lista {
    protected Nodo inicio, fin; //Punteros para saber donde esta el inicio y el fin

    public Lista() {
        inicio = null;
        fin = null;
    }

    //Metodo para saber si la lista esta vacia
    public boolean estaVacia(){
        if(inicio==null){
            return true;
        } else {
            return false;
        }
    }

    //Metodo para agregar un Nodo al inicio de la lista
    public void agregarAlInicio(int elemento) {
        //Creando al nodo
        inicio = new Nodo(elemento, inicio);
        if (fin == null) {
            fin = inicio;
        }
    }

    //Metodo para insertar al final de la lista
    public void agregarAlFinal(int elemento){
        if(!estaVacia()){
            fin.siguiente=new Nodo(elemento);
            fin=fin.siguiente;
        } else {
            inicio=fin=new Nodo(elemento);
        }
    }

    //Metodo para mostrar los datos
    public void mostrarLista() {
        Nodo recorrer = inicio;
        System.out.println();
        while (recorrer != null) {
            System.out.print("[" + recorrer.dato + "]--->");
            recorrer = recorrer.siguiente;
        }
    }
}
