package Main;

import java.util.Scanner;

import Dominio.Ropas;
import Implementacion.LogicaMetodos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lectura = null;
		String marca;
		int talla, menuPrinc, indice;
		float precio;
		long cantidad;
		
		Ropas ropa;
		LogicaMetodos imp = new LogicaMetodos();
		
		do {
			System.out.println("MENU PRINCIPAL");
			System.out.println("1--AGREGAR");
			System.out.println("2--MOSTRAR");
			System.out.println("3--BUSCAR");
			System.out.println("4--EDITAR");
			System.out.println("5--ELIMINAR");
			System.out.println("6--BUSCAR POR MARCA");
			System.out.println("7--EDITAR LA TALLA, BUSCANDO POR MARCA");
			System.out.println("8--ELIMINAR BUSCANDO POR MARCA");
			System.out.println("9--SALIR");
			
			lectura = new Scanner(System.in);
			menuPrinc = lectura.nextInt();
			
			switch (menuPrinc) {
			case 1:
				try {
					System.out.println("Ingrese la marca: ");
					lectura = new Scanner(System.in);
					marca = lectura.nextLine();
					
					System.out.println("Ingrese la talla: ");
					lectura = new Scanner(System.in);
					talla = lectura.nextInt();
					
					System.out.println("Ingrese el precio: ");
					lectura = new Scanner(System.in);
					precio = lectura.nextFloat();
					
					System.out.println("Ingrese la cantidad: ");
					lectura = new Scanner(System.in);
					cantidad = lectura.nextLong();
					
					//crear el objeto
					ropa = new Ropas(marca, talla, precio, cantidad);
					
					//Agregar a la lista
					imp.guardar(ropa);
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al guardar");
				}
				break;
			case 2:
				if(imp.mostrar().size() > 0)
					System.out.println(imp.mostrar());
				else
					System.out.println("No hay registros en la lista");
				break;
			case 3: 
				try {
					if(imp.mostrar().size()>0) {
					System.out.println("Ingrese el indice de registro a buscar: ");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();
					
					//Buscar
					ropa = imp.buscar(indice);
					System.out.println(ropa);
					}else
						System.out.println("No hay registros para buscar");
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("No existe ese registro");
				}
				break;
			case 4:
				try {
					if(imp.mostrar().size()>0) {
					System.out.println("Ingrese el indice de registro a editar: ");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();
					
					//Buscar
					ropa = imp.buscar(indice);
					System.out.println(ropa);
					
					//Editar el precio
					System.out.println("Ingrese el nuevo precio: ");
					lectura = new Scanner(System.in);
					precio = lectura.nextFloat();
					
					//Actualizar el objeto
					ropa.setPrecio(precio);
					
					//Actualizar el objeto a la lista
					imp.editar(indice, ropa);
					System.out.println("Se edito");
					}else
						System.out.println("No hay registros para editar");
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("No existe ese registro");
				}
				break;
			case 5:
				try {
					System.out.println("Ingrese el indice de registro a eliminar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();
					
					//Eliminar
					imp.eliminar(indice);
					System.out.println("Se elimino");
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("No existe");
				}
				break;
			case 6:
				System.out.println("Ingresa la marca a buscar: ");
				lectura = new Scanner(System.in);
				marca = lectura.nextLine();
				
				//Buscar
				ropa = imp.buscarXmarca(marca);
				
				if (ropa != null) {
					System.out.println(ropa);
				}else
					System.out.println("No se encontro esa marca");
				break;
			case 7:
				System.out.println("Ingresa la marca: ");
				lectura = new Scanner(System.in);
				marca = lectura.nextLine();
				
				//Buscar por marca
				ropa = imp.buscarXmarca(marca);
				
				if (ropa != null) {
					System.out.println(ropa);
				
					//Procedo para editar
					System.out.println("Ingrese la nueva talla: ");
					lectura = new Scanner(System.in);
					talla = lectura.nextInt();
					
					//Actualizar el objeto
					ropa.setTalla(talla);
					//Actualizar el objeto en la lista
					imp.editarXmarca(ropa);
			}else
					System.out.println("No se encontro esa marca");
			break;
			case 8:
				System.out.println("Ingresa la marca a eliminar: ");
				lectura = new Scanner(System.in);
				marca = lectura.nextLine();
				
				imp.eliminarXmarca(marca);
				break;
			case 9:
				break;
			}
		}while(menuPrinc < 9);
		
	}

}
