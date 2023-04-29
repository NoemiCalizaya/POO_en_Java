package polimorfismo;

public class Vehiculo {
	//Atributos
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

	public String getMatricula() {
		return matricula;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}
}
