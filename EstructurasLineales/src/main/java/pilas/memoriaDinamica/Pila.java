package pilas.memoriaDinamica;

public class Pila {
    private NodoPila cima;
    int tama;

    public Pila() {
        cima = null;
        tama = 0;
    }

    //Metodo para saber cuando la pila esta vacia
    public boolean estaVacia() {
        return cima == null;
    }

    //Metodo para empujar (push) un elemento en la Pila
    public void empujar(int elem) {
        NodoPila nuevo = new NodoPila(elem);
        nuevo.siguiente = cima;
        cima = nuevo;
        tama++;
    }

    //Metodo para sacar (pop) un elemento de la Pila
    public int sacar() {
        int auxiliar = cima.dato;
        cima = cima.siguiente;
        tama--;
        return auxiliar;
    }

    //Metodo para saber quien esta en la Cima de la Pila
    public int cima() {
        return cima.dato;
    }

    //Metodo para saber el tamaño de la Pila
    public int tamanioPila() {
        return tama;
    }

    //Metodo para Limpiar(Vaciar) la Pila
    public void limpiarPila() {
        while (!estaVacia()) {
            sacar();
        }
    }

}
