package ejercicio3;

public class Caja<T>{
    private T dato;
    private String color;

    public Caja (String color) {
        this.color = color;
    }

    public T dame() {
        return this.dato;
    }

    public void pon(T x) {
        this.dato = x;
    }

    @Override
    public String toString() {
        return this.dato+" "+this.color;
    }    
}
