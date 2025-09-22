package Implementacion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Dominio.Ropas;
import Interface.Metodos;
import Interface.Metodos2;

public class LogicaMetodos implements Metodos, Metodos2{
	private List<Ropas> listaRopas = new ArrayList<Ropas>();
	
	
	//validar que la marca no se repita
	@Override
	public void guardar(Ropas ropa) {
		// TODO Auto-generated method stub
		//Algoritmo
		//1--Ciclo
		//2--Condicional
		//3--Bandera
		boolean bandera = false;
		
		for(Ropas r : listaRopas) {
			if(r.getMarca().equals(ropa.getMarca())) {
				System.out.println("Ese registro ya existe");
				bandera = true;
				break;
			}
		}
		if(!bandera) {
			listaRopas.add(ropa);
			System.out.println("Se guardo");
		}
		
	}

	@Override
	public List<Ropas> mostrar() {
		// TODO Auto-generated method stub
		return listaRopas;
	}

	@Override
	public Ropas buscar(int indice) {
		// TODO Auto-generated method stub
		return listaRopas.get(indice);
	}

	@Override
	public void editar(int indice, Ropas ropa) {
		// TODO Auto-generated method stub
		listaRopas.set(indice, ropa);
		
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		listaRopas.remove(indice);
	}

	@Override
	public Ropas buscarXmarca(String marca) {
		// TODO Auto-generated method stub
		for (Ropas r : listaRopas) {
			if(r.getMarca().equals(marca)) {
				return r;
			}	
		}
		return null;
	}

	@Override
	public void editarXmarca(Ropas ropa) {
		// TODO Auto-generated method stub
		for (int i = 0; i < listaRopas.size(); i++) {
			if(listaRopas.get(i).getMarca().equals(ropa.getMarca())) {
				listaRopas.set(i, ropa);
				System.out.println("Se edito con exito");
				break;
			}
		}	
	}

	@Override
	public void eliminarXmarca(String marca) {
		// TODO Auto-generated method stub
		boolean eliminado = false;
		for (int i = 0; i < listaRopas.size(); i++) {
			if(listaRopas.get(i).getMarca().equals(marca)) {
				listaRopas.remove(i);
				System.out.println("Se elimino con exito");
				eliminado =true;
				break;
			}
		}
		if(!eliminado) {
			System.out.println("No se encontro esa marca");
		}
		
	}
}
