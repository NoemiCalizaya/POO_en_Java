package polimorfismo;

public class Principal {

	public static void main(String[] args) {
		Vehiculo vehiculo = new Vehiculo("444", "Toyota", "Camry");
		System.out.println("Matrícula del objeto v "+ vehiculo.matricula + "\n");

		Vehiculo misVehiculos[] = new Vehiculo[2];
		misVehiculos[0] = new Vehiculo("333", "Toyota", "Corolla");
		misVehiculos[1] = new VehiculoTurismo("333", "Toyota", "Corolla", 4);
		
		for (Vehiculo vehiculos: misVehiculos) {
			vehiculos.mostrarDatos();
			System.out.println("");
		}
		
	}

}
