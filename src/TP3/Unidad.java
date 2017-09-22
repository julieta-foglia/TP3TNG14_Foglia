package TP3;

/* Clase abstracta para las Unidades con los atributos y metodos comunes */

public abstract class Unidad {
	private int salud;
	private int daño;
	
	abstract void atacar(Unidad unidad);

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
