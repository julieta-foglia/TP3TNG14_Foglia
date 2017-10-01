package TP3;

/**
 * La unidad basica, representa a todas las unidades, incluida UnidadConItem
 * @author grupo14
 * @param salud Es la salud actual de la unidad
 * @param danio Es el daño que hace la unidad en un ataque por defecto
 * @param posicionX Es la posicion en X de la unidad
 * @param posicionY Es la posicion en Y de la unidad 
 */
public abstract class Unidad {

	private float salud;
	private float danio;
	private int posicionX;
	private int posicionY;
	
	/**
	 * Getters y setters para salud y danio
	 * La salud y el daño se pueden ver publicamente, pero solo las clases hijas pueden setearlos
	 */
	public float getSalud() {
		return this.salud;
	}
	
	protected void setSalud(float health) {
		this.salud = health;
	}
	
	public float getDanio() {
		return this.danio;
	}
	
	protected void setDanio(float danio) {
		this.danio = danio;
	}
	
	/**
	 * Mover a la unidad a la nueva posicion con coordenadas X e Y	
	 * @param x
	 * @param y
	 */
	public void moverA(int x, int y) {
		this.posicionX = x;
		this.posicionY = y;
	}
	
	/**
	 * Se trata del ataque en cuestion, que usaria el que desarrolle la batalla.
	 * @param that Es la unidad a la que se ataca
	 * @return true si logra atacar, false si no lo logra
	 */
	public boolean atacar(Unidad that) {
		if(this!=that && this.estaVivo() && this.puedeAtacar(that)) {
			that.recibirDanio(this.hacerDanio());
			return true;
		}
		return false;
	}
	
	/**
	 * Depende de cada unidad, me dice si tengo la posibilidad de atacar
	 * @param that Es la unidad a la que se ataca
	 * @return Retorna true si puede atacar
	 */
	protected abstract boolean puedeAtacar(Unidad that);
	
	/**
	 * Calcula el daño que se hace al enemigo
	 * @return El daño en enteros
	 */
	protected float hacerDanio() {
		return danio;
	}
	
	/**
	 * Calcula el daño final recibido por un ataque
	 * @param danio Es el daño del enemigo
	 */
	protected void recibirDanio(float danio) {
		this.salud-=danio;
	}
	
	/**
	 * Calcula la distancia entre la Unidad y otra Unidad
	 * @param that Es una Unidad
	 * @return La distancia en double entre ambas unidades
	 */
	protected double distanciaA(Unidad that) {
		return Math.sqrt(Math.pow(this.posicionX-that.posicionX,2)+Math.pow(this.posicionY-that.posicionY,2));	
	}
	
	/**
	 * Nos avisa si nuestra Unidad sigue con vida
	 * @return true si esta vivo, false si esta muerto
	 */
	public boolean estaVivo() {
		if(this.salud>0)
			return true;
		return false;
	}

}
