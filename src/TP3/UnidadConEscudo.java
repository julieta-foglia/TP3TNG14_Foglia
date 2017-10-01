package TP3;
/**
 * Decorador encargado del escudo
 * @author grupo14
 * 
 */
public class UnidadConEscudo extends UnidadConItem {

	/**
	 * @param unidad Es la unidad a la que le va a agregar el item
	 */
	public UnidadConEscudo(Unidad unidad) {
		this.miUnidad = unidad;
	}
	
	/**
	 * Modifica el daño recibido con escudo, al 40%
	 * @param danio es el daño proveniente del enemigo
	 */
	@Override
	public void recibirDanio(float danio) {
		this.miUnidad.recibirDanio((int)(danio*0.4));
	}

}
