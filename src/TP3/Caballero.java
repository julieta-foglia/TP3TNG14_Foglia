package TP3;

public class Caballero extends Unidad implements Bebedor{

	/**
	 * Cuando recibe 3 ataques el caballo se asuta y se pone rebelde. Mientras esta rebelde el
	 * caballero no podra atacar. El caballo solo se calma con una pocion de agua.
	 * El contador caballoNoRebelde empieza en 3 y se considera rebelde cuando llega a 0.
	 */
	private int caballoNoRebelde;
	
	/**
	 * El caballero tiene una salud inicial y tope de 200 y causa un danio de 50.
	 */
	private final static int SALUDTOPE = 200;
	private final static int DANIO = 50;
	
	public Caballero() {
		this.moverA(0,0);
		this.caballoNoRebelde=3;
		this.setSalud(SALUDTOPE);
		this.setDanio(DANIO);
	}
	
	public Caballero(int x, int y) {
		this.moverA(x, y);
		this.caballoNoRebelde=3;
		this.setSalud(SALUDTOPE);
		this.setDanio(DANIO);
	}
	
	/**
	 * Por implementar Bebedor
	 * tomarAgua() le da una poci�n de agua al caballo y lo calma, lo saca del estado rebelde
	 */
	@Override
	public void tomarAgua() {
		this.caballoNoRebelde=3;
	}
	
	/**
	 * El caballero puede atacar si esta a una distancia entre 1 y 2 del oponente y si su
	 * caballo no esta rebelde.
	 * @param that Es la Unidad a la que pretende atacar
	 * @return true si puede atacar, false si no puede
	 */
	@Override
	protected boolean puedeAtacar(Unidad that) {
		if(distanciaA(that) >= 1 && distanciaA(that) <= 2 && caballoNoRebelde > 0)
			return true;
		return false;
	}
	
	/**
	 * Calcula el daño final recibido por un ataque
	 * @param daño Es el daño del enemigo
	 */
	protected void recibirDanio(float danio) {
		this.setSalud(this.getSalud() - danio);
		this.caballoNoRebelde--;
	}

}
