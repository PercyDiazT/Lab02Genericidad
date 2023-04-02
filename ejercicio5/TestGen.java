package ejercicio5;

public class TestGen {

	public static void main(String[] args) {
        Cajoneria<Golosina> cajoneria = new Cajoneria<>();
        
        cajoneria.add(new Caja<>("Rojo"));
        cajoneria.getCaja(0).pon(new Golosina("Galleta", 1));
        cajoneria.add(new Caja<>("Azul"));
        cajoneria.getCaja(1).pon(new Golosina("Gomitas", 2));
        cajoneria.add(new Caja<>("Verde"));
        cajoneria.getCaja(2).pon(new Golosina("Mentas", 3));
        cajoneria.add(new Caja<>("Rojo"));
        cajoneria.getCaja(3).pon(new Golosina("Chicle", 4));
        cajoneria.add(new Caja<>("Naranja"));
        cajoneria.getCaja(4).pon(new Golosina("Chupetin", 5));
        
        Golosina g1 = new Golosina("Caramelo", 20);
        Golosina g2 = new Golosina("Gomitas", 2);
        
        cajoneria.search(g1);
        cajoneria.search(g2);
        
        System.out.println("ANTES DEL DELETE");
        System.out.println(cajoneria);
        cajoneria.delete(g2);
        System.out.println("DESPUES DEL DELETE");
        System.out.println(cajoneria);



	}

}
