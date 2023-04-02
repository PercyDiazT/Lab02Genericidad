package ejercicio6;

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
    
    public void search(T elem) {
        for (int i = 0; i < this.cantidadDeCajas(); i++) {
            if (cajones.get(i).dame() != null && cajones.get(i).dame().equals(elem)) {
                System.out.println("El elemento " + elem + " se encuentra en la caja " 
            + (i+1) + " de color " + cajones.get(i).getColor());
                return;
            }
        }
        System.out.println("El elemento " + elem + " no se encontró en ninguna caja.");
    }

    public T delete(T elem) {
        for (int i = 0; i < this.cantidadDeCajas(); i++) {
            if (cajones.get(i).dame() != null && cajones.get(i).dame().equals(elem)) {
                T elemBorrado = cajones.get(i).dame();
                cajones.get(i).pon(null);
                return elemBorrado;
            }
        }
        return null;
    }
    public String toString() {
    	String s = String.format("%-8s\t%-12s\t%-30s","Posicion","Color de Caja","Objeto")+"\n";
        for (int i = 0; i < this.cantidadDeCajas(); i++) {
            if (cajones != null) {
            	s += String.format("%-8d\t%-12s\t%-30s",i+1,cajones.get(i).getColor(),
            			cajones.get(i).getDato())+"\n";
            } 
        }
        return s;
    }
}


