package ejercicio1;
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

    public static void main(String[] args) {
    	String[] v = {"Perez","Sanchez","Rodriguez"};
    	Integer[] w = {12,34,56};
    	System.out.println(exist(v,"Sanchez"));
    	System.out.println(exist(w,34));
    	//System.out.println(exist(w,"Salas")); //Error
    	
    	//Pruebe su funcionamiento con arreglos que almacenen objetos Golosina y objetos
    	//Chocolatina.
    	
    	Golosina arrGolosina [] = {new Golosina("Bubbalo",350),
    			new Golosina("Fini",620), new Golosina("Mogul",450)};
    	
    	Chocolatina arrChocolatina [] = {new Chocolatina("milka"), 
    			new Chocolatina("ferrero")};
  
    	System.out.println(exist(arrGolosina,new Golosina("Bubbalo",350)));
    	System.out.println(exist(arrGolosina,new Golosina("Chichiste",200)));
    	
    	System.out.println(exist(arrChocolatina,new Chocolatina("ferrero")));
    	System.out.println(exist(arrChocolatina,new Chocolatina("cua cua")));

    	//System.out.println(exist(w,34));
    }
}