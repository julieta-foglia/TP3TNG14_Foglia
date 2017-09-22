package TP3;

/*CABALLERO:
Los caballeros pueden atacar a una distancia de 1 a 2, siempre que su caballo no se haya puesto rebelde. 
Un caballo se pone rebelde luego de 3 ataques, y puede calmarse si recibe una pocion de agua.
DAÑO:50 
SALUD: 200
*/

public class Caballero extends Unidad{
	
	public Caballero() {
		this.setSalud(200);
		this.setDaño(50);
	}

	@Override
	void atacar(Unidad unidad) {
		// ver el tema de la distancia acá
		
		unidad.setSalud(unidad.getSalud() - this.getDaño());	//Daño que hace en la unidad que ataca

	}
}
