package polimorfismo;

public class VehiculoTurismo extends Vehiculo{

	private int numeroPuertas;
	
	public VehiculoTurismo(String matricula, String marca, String modelo, int numeroPuertas) {
		super(matricula, marca, modelo);
		this.numeroPuertas = numeroPuertas;
	}
	
	public int getnumeroPuertas() {
		return numeroPuertas;
	}
	
	public void mostrarDatos() {
		System.out.println("Matricula: "+matricula+
				"\nMarca: "+marca+
				"\nModelo: "+modelo+
				"\nNumero de Puertas: "+numeroPuertas);
	}
}
