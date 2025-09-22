package Interface;

import java.util.List;

import Dominio.Ropas;

public interface Metodos {
	
	public void guardar(Ropas ropa);
	
	public List<Ropas> mostrar();
	
	public Ropas buscar(int indice);
	
	public void editar(int indice, Ropas ropa);
	
	public void eliminar(int indice);

}
