package ejercicio2;
class DemoMetodoGenerico {

    static <T extends Comparable<T>> boolean igualArrays(T[] x, T[] y) {
        // Si las longitudes de los array son diferentes,
        // entonces los array son diferentes
        if (x.length != y.length)
            return false;
        for (int i = 0; i < x.length; i++)
            if (!x[i].equals(y[i]))
                return false; // arrays diferentes
        return true; // Contenido de arrays son equivalentes
    }
    
    public static <T extends Comparable<T>> boolean exist(T arr[], T obj) {
        for (T elem : arr) {
            if (elem.equals(obj))
                return true;
        }
        return false;
    }
    
	public static <T> void mostrarBolsa(Bolsa<T> bolsa) {
		for(T elem : bolsa) {
			System.out.println(elem);
		}
	}
    public static void main(String[] args) {
        Bolsa<Chocolatina> bolsaCho = new Bolsa<Chocolatina>(3);
        Chocolatina c = new Chocolatina("milka");
        Chocolatina c1 = new Chocolatina("milka");
        Chocolatina c2 = new Chocolatina("ferrero");
        bolsaCho.add(c);
        bolsaCho.add(c1);
        bolsaCho.add(c2);

        System.out.println("Bolsa de Chocolatinas");
        mostrarBolsa(bolsaCho);
        
        Bolsa<Golosina> bolsaGol = new Bolsa<Golosina>(3);
        Golosina g1 = new Golosina("Bubbalo",350);
        Golosina g2 = new Golosina("Fini",620);
        Golosina g3 = new Golosina("Mogul",450);
        bolsaGol.add(g1);
        bolsaGol.add(g2);
        bolsaGol.add(g3);
        
        System.out.println("Bolsa de Golosinas");
        mostrarBolsa(bolsaGol);
    }
}