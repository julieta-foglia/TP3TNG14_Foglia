package TP3;

/*LANCERO:
ATAQUE: a una distancia de 1 a 3, sin condicion
DAÑO: 25
SALUD: 150
*/

public class Lancero extends Unidad{
	
	public Lancero() {
		super (150,25);
	}

	@Override
	void atacar(Unidad unidad) {
		// ver el tema de la distancia acá
		unidad.setSalud(unidad.getSalud() - this.getDaño());	//Daño que hace en la unidad que ataca
	}
}
