package ejercicio1;
public class Golosina implements Comparable<Golosina> {
    private String nombre;
    private double peso;

    public Golosina(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public boolean equals(Object obj) {
    	if (obj instanceof Golosina) {
    		Golosina golComp = (Golosina) obj;
    		if(golComp.nombre.equals(this.nombre) &&
    				golComp.getPeso() == this.peso) {
    			return true;
    		}
    	}
    	return false;
    }

	@Override
	public int compareTo(Golosina golComp) {
		if(golComp.nombre.equals(this.nombre) &&
				golComp.getPeso() == this.peso) {
			return 0;
		}
		return -1;
	}
}