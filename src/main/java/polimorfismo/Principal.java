package polimorfismo;

public class Principal {

	public static void main(String[] args) {
		Vehiculo misVehiculos[] = new Vehiculo[2];
		misVehiculos[0] = new Vehiculo("333", "Toyota", "2022");
		misVehiculos[1] = new VehiculoTurismo("222", "Susuki", "2022", 4);
		
		for (Vehiculo vehiculos: misVehiculos) {
			vehiculos.mostrarDatos();
			System.out.println("");
		}
		
	}

}
