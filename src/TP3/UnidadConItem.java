package TP3;
/**
 * Decorador
 * @author grupo14
 * @param miUnidad Es la unidad a ser modificada
 */
public abstract class UnidadConItem extends Unidad implements Bebedor, Tirador {

	protected Unidad miUnidad;

	public float getSalud() {
		return miUnidad.getSalud();
	}
	
	protected void setSalud(float health) {
		this.miUnidad.setSalud(health);
	}
	
	public float getDanio() {
		return this.miUnidad.getDanio();
	}
	
	protected void setDanio(float danio) {
		this.miUnidad.setDanio(danio);
	}
	
	public void moverA(int x, int y) {
		this.miUnidad.moverA(x, y);
	}
	
	/**
	 * Se trata de el ataque en cuestion, que usaria el que desarrolle la batalla.
	 * @param that Es la unidad a la que se ataca
	 * @return true si logr� atacar, false si no lo logr�
	 */
	public boolean atacar(Unidad that) {
		if(this!=that)
			return miUnidad.atacar(that);
		return false;
	}
	
	/**
	 * Depende de cada unidad, me dice si tengo la posibilidad de atacar
	 * @param that Es la unidad a la que se ataca
	 * @return Retorna true si puede atacar
	 */
	protected boolean puedeAtacar(Unidad that) {
		return miUnidad.puedeAtacar(that);
	}
	
	/**
	 * Calcula el daño que se entrega al enemigo
	 * @return El daño en enteros
	 */
	protected float hacerDanio() {
		return miUnidad.hacerDanio();
	}
	
	/**
	 * Calcula el daño final recibido por un ataque
	 * @param danio Es el daño del enemigo
	 */
	protected void recibirDanio(float danio) {
		miUnidad.recibirDanio(danio);
	}
	
	/**
	 * Calcula la distancia entre la Unidad y otra Unidad
	 * @param that Es una Unidad
	 * @return La distancia en double entre ambas unidades
	 */
	protected double distanciaA(Unidad that) {
		return miUnidad.distanciaA(that);
	}
	
	/**
	 * Ve los efectos de tomar agua, por defecto, ninguno
	 */
	public void tomarAgua() {
		if(miUnidad instanceof Bebedor)
			((Bebedor) miUnidad).tomarAgua();
	}
	
	public void cargarFlechas() {
		if(miUnidad instanceof Tirador)
			((Tirador) miUnidad).cargarFlechas();
	}
	
	public int getEnergia() {
		if(miUnidad instanceof Soldado)
			return ((Soldado)miUnidad).getEnergia();
		return 0;
	}
	
	/**
	 * Nos avisa si nuestra Unidad sigue con vida
	 * @return true si esta vivo, false si esta muerto
	 */
	public boolean estaVivo() {
		return miUnidad.estaVivo();
	}
}
