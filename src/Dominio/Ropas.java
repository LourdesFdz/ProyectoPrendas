package Dominio;

public class Ropas {
	//atributos
	private String marca;
	private int talla;
	private float precio;
	private long cantidad;
	
	public Ropas(String marca, int talla, float precio, long cantidad) {
		this.marca = marca;
		this.talla = talla;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	@Override
	public String toString() {
		return "Ropas [marca=" + marca + ", talla=" + talla + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getTalla() {
		return talla;
	}
	public void setTalla(int talla) {
		this.talla = talla;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public long getCantidad() {
		return cantidad;
	}
	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}
}
