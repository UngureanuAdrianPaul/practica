package animales;

public class UsoAnimales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal perro = new Mamifero(15 ,"perro" , true);
		Insecto hormiga = new Insecto (1,"hormiga", false, true, "oso hormiguero");
		
		System.out.println("El animal hormiga "+ hormiga.getNombre() + " tiene alas?: " + hormiga.isAlas());
		
		System.out.println(hormiga.getNombre() + " tiene de enemigo a: " + hormiga.getEnemigo().getNombre());
		
		Insecto atomica; 
		Insecto volantona;
		volantona = hormiga;
				atomica = new Insecto(hormiga.getTpVida(), hormiga.getNombre() + " atomica" , hormiga.isAlas(),
				hormiga.isAntenas(), hormiga.getEnemigo().getNombre());
		
		hormiga.setAlas(true);
		volantona.setNombre("volantona");
		volantona.setNombre(atomica.getNombre());
		System.out.println("El animal "+ hormiga.getNombre() + " tiene alas?: " + hormiga.isAlas());
		System.out.println("El animal "+ atomica.getNombre() + " tiene alas?: " + atomica.isAlas());
		System.out.println("El animal "+ volantona.getNombre() + " tiene alas?: " + volantona.isAlas());
	}

}
