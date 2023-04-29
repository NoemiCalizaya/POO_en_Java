package polimorfismo;

public class VehiculoTurismo extends Vehiculo{

	private int numeroPuertas;
	
	public VehiculoTurismo(String matricula, String marca, String modelo, int numeroPuertas) {
		super(matricula, marca, modelo);
		this.numeroPuertas = numeroPuertas;
	}
	
	//Métodos Accesores getters
	public int getnumeroPuertas() {
		return numeroPuertas;
	}
	
	//Sobreescritura del método mostrarDatos
	@Override
	public void mostrarDatos() {
		System.out.println("Matricula: "+matricula+
				"\nMarca: "+marca+
				"\nModelo: "+modelo+
				"\nNumero de Puertas: "+numeroPuertas);
	}
}
