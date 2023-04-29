package polimorfismo;

public class Vehiculo {
	//Atributos
	//Un atributo definido como protected puede ser utilizado 
	//desde cualquier clase de su mismo paquete, y también 
	//desde subclases de otros paquetes.
	/*El acceso desde las subclases de otros paquetes se puede realizar 
	dentro del contexto de la herencia, no 
	a través de la creación directa de objetos*/
	protected String matricula;
	protected String marca;
	protected String modelo;
	
	public Vehiculo(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}

	public void mostrarDatos() {
		System.out.println("Matricula: "+matricula+
				"\nMarca: "+marca+
				"\nModelo: "+modelo);
	}
}
