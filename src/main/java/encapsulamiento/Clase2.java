package encapsulamiento;

public class Clase2 {

	public static void main(String[] args) {
		Encap e = new Encap(31, "Oscar");
		//e.mostrar();
		e.setEdad(0);
		System.out.println(e.getEdad());
		System.out.println(e.getNombre());
		
	}

}
