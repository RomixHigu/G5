package desafios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Desafios {

	public static void main(String[] args) {
		promedio();

	}

	public static int promedio() {
		Scanner sc = new Scanner(System.in);
		int cantidad = 0;
		int opcion = 0;
		int sumaVisitas = 0;
		int contador = 0;
		int promedioVisitas = 0;

		ArrayList<Integer> visitas = new ArrayList<>();
		do {
			System.out.println("Ingresar antidad de pasos");
			cantidad = sc.nextInt();

			if (visitas.size() == 0) {
				visitas.add(cantidad);
			} else {
				boolean existe = false;
				for (int i = 0; i < visitas.size(); i++) {
					int cantidadAgregada = visitas.get(i);
					if (cantidadAgregada == cantidad) {
						existe = true;
					}

				}
				if (!existe) {
					visitas.add(cantidad);
				}
			}

			System.out.println(visitas);
			System.out.println("Desea ingresar otra cantidad");
			System.out.println("(1) SI - (2) NO ");
			opcion = sc.nextInt();
			sc.nextLine();
		} while (opcion == 1);

		for (Iterator<Integer> iterator = visitas.iterator(); iterator.hasNext();) {
			Integer elemento = (Integer) iterator.next();

			sumaVisitas = sumaVisitas + elemento;
			contador = contador + 1;
		}

		promedioVisitas = sumaVisitas / contador;
		System.out.println("El promedio de visitas es de " + promedioVisitas);
		return promedioVisitas;
		
	}
	
}
