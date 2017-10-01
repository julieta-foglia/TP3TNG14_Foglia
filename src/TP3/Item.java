package TP3;

public abstract class Item {
	protected String tipo;
	protected double beneficio;
	protected double perjucio;
	protected String localizacion;
	
	public Item (String type, double ben, double per, String loc) {
		tipo = type;
		beneficio = ben;
		perjucio = per;
		localizacion = loc;
	}
}

