package TP3;

public abstract class Item {
	protected String tipo;
	protected double venefio;
	protected double perjucio;
	protected String localizacion;
	
	public Item (String type,double ven, double per,String loc) {
		tipo = type;
		venefio = ven;
		perjucio = per;
		localizacion = loc;
	}
}
