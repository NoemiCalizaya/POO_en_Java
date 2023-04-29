package encapsulamiento;
//Encapsulamiento y metodos accesores (Setters y Getters)
public class Encap {

	private int edad;
	private final String nombre;
	
	public Encap(int edad, String nombre) {
		this.edad = edad;
		this.nombre = nombre;
	}
	
	public void mostrar() {
		System.out.println(nombre+" "+edad);
	}
	//SET----> Establecemos la edad
	public void setEdad(int edad){
		this.edad = edad;
	}
	//Metodo Getter: Mostramos la edad
	public int getEdad() {
		return edad;
	}
	public String getNombre() {
		return nombre;
	}
	
	
}
