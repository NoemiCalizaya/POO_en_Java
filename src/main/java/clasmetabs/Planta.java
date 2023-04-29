package clasmetabs;

public class Planta extends SerVivo{
//Sobreescribimos el método para implementar el método de la super clase	
	@Override
	public void alimentarse() {
		System.out.println("La planta se alimenta a traves de la fotosintesis");
	}
}
