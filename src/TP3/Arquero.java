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
		super (50,5);
		this.flecha = 20;
	}

	@Override
	void atacar(Unidad unidad) {
		if( this.flecha > 0 )
		{
			// ver el tema de la distancia acá
			unidad.setSalud(unidad.getSalud() - this.getDaño());
			this.flecha--;
			//Daño que hace en la unidad que ataca
		}
	}
}
