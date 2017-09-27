package TP3;

/* Clase abstracta para las Unidades con los atributos y metodos comunes */

public abstract class Unidad {
	protected int salud;
	protected int daño;
	protected Item brazoDer;
	protected Item brazoIzq;
	protected Item espalda;
	
	abstract void atacar(Unidad unidad);
	public void equipar(Item item) {
		if(sePuedeEquipar(item)) {
			equipo(item);
		}
	}
	
	public void equipo(Item item) {}
	public boolean sePuedeEquipar(Item item) {return true;}

	public Unidad (int salud, int daño) {
		this.salud = salud;
		this.daño = daño;
	}
	
	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public int getDaño() {
		return daño;
	}

	public void setDaño(int daño) {
		this.daño = daño;
	}
	
	
	
}
