package TP3;

/*ARQUERO:
ATAQUE: a una distancia de entre 2 y 5 respecto de su enemigo
FLECHAS INICIO: 20
RECARGAR FLECHAS: paquete de 6
DAÑO: 5
SALUD: 50*/

public class Arquero extends Unidad{
	private int flecha;
	
	public Arquero() {
		this.flecha = 20;
		this.setSalud(50);
		this.setDaño(5);
	}

	@Override
	void atacar(Unidad unidad) {
		// ver el tema de la distancia acá
		
		unidad.setSalud(unidad.getSalud() - this.getDaño());	//Daño que hace en la unidad que ataca

	}
}
