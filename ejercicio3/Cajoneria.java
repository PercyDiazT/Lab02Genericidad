package ejercicio3;

import java.util.ArrayList;

public class Cajoneria<T> {
    private ArrayList<Caja<T>> cajones;

    public Cajoneria() {
        cajones = new ArrayList<Caja<T>>();
    }

    public void add(Caja<T> caja) {
        cajones.add(caja);
    }

    public Caja<T> getCaja(int indice) {
        return cajones.get(indice);
    }

    public int cantidadDeCajas() {
        return cajones.size();
    }
    
    public String toString() {
    	String s = "Cajoneria con "+cantidadDeCajas()+" cajas:\n";
        for (int i = 0; i < cantidadDeCajas(); i++) {
        	s += "- "+getCaja(i).toString()+"\n";  
        }
        return s;
    }
}


