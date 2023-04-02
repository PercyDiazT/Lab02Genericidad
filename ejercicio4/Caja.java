package ejercicio4;

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

    public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
    public String toString() {
        return this.dato+" "+this.color;
    }    
}
