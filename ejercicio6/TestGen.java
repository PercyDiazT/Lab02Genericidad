package ejercicio6;

public class TestGen {

	public static void main(String[] args) {
        Cajoneria<Chocolatina> cajoneria = new Cajoneria<>();
        
        cajoneria.add(new Caja<>("Rojo"));
        cajoneria.getCaja(0).pon(new Chocolatina("KitKat"));
        cajoneria.add(new Caja<>("Azul"));
        cajoneria.getCaja(1).pon(new Chocolatina("Hersheys"));
        cajoneria.add(new Caja<>("Verde"));
        cajoneria.getCaja(2).pon(new Chocolatina("Sublime"));
        cajoneria.add(new Caja<>("Rojo"));
        cajoneria.getCaja(3).pon(new Chocolatina("Princesa"));
        cajoneria.add(new Caja<>("Naranja"));
        cajoneria.getCaja(4).pon(new Chocolatina("Cañonazo"));
        
        Chocolatina g1 = new Chocolatina("Triangulo");
        Chocolatina g2 = new Chocolatina("KitKat");
        
        cajoneria.search(g1);
        cajoneria.search(g2);
        
        System.out.println("ANTES DEL DELETE");
        System.out.println(cajoneria);
        cajoneria.delete(g2);
        System.out.println("DESPUES DEL DELETE");
        System.out.println(cajoneria);



	}

}
