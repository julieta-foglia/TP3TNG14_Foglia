package TP3;

/*SOLDADO
ENERGIA INICIO: 100
SALUD INICIO: 200
DAÑO: 10
ATAQUE: -10 ENERGIA
AGUA: RESTAURA ENERGIA*/

public class Soldado extends Unidad{
	private int energia;
	
	public Soldado() {
		this.energia = 100;
		this.setSalud(200);
		this.setDaño(10);
	}

	@Override
	void atacar(Unidad unidad) {
		if(this.energia >= 10) {
			this.energia -= 10;		// Energia que pierde con el ataque
			unidad.setSalud(unidad.getSalud() - this.getDaño());	//Daño que hace en la unidad que ataca
		}
		
	}
}
