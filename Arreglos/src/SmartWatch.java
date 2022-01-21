import java.util.ArrayList;
import java.util.Iterator;

public class SmartWatch {

	public static void main(String[] args) {
		clearSteps(args);

	}

	public static void clearSteps(String[] args) {
		int sumaPasos = 0;
		int contador = 0;
		int promedioPasos = 0;

		ArrayList<Integer> pasos = new ArrayList<Integer>();
		ArrayList<Integer> pasosFiltrados = new ArrayList<Integer>();
		ArrayList<Integer> pasosEliminados = new ArrayList<Integer>();
		/*
		 * 
		 * pasosEliminados = new ArrayList<Integer>(); ArrayList<Integer> pasosFiltrados
		 * = new ArrayList<Integer>(); pasos.add(300); pasos.add(405); pasos.add(403);
		 * pasos.add(506); pasos.add(100020040); pasos.add(45006); pasos.add(-1044);
		 * 
		 * for (Iterator<Integer> iterator = pasos.iterator(); iterator.hasNext();) {
		 * Integer cantidadPasos = (Integer) iterator.next(); if (cantidadPasos > 200 &&
		 * cantidadPasos < 100000) { pasosFiltrados.add(cantidadPasos); sumaPasos =
		 * sumaPasos + cantidadPasos; contador = contador + 1;
		 * 
		 * } else { pasosEliminados.add(cantidadPasos); }
		 */

		for (int i = 0; i < args.length; i++) {
			if ((Integer.parseInt(args[i])) != 0) {
				pasos.add(Integer.parseInt(args[i]));
			}
		}
		for (int i = 0; i < pasos.size(); i++) {
			if (pasos.get(i) > 200 && pasos.get(i) < 100000) {
				pasosFiltrados.add(pasos.get(i));
				contador = contador + 1;
			} else {
				pasosEliminados.add(pasos.get(i));
			}

		}
		for (Iterator<Integer> iterator = pasosFiltrados.iterator(); iterator.hasNext();) {
			Integer cantidadPasos = (Integer) iterator.next();
			if (cantidadPasos > 0) {
				sumaPasos = sumaPasos + cantidadPasos;
			}
		}

		promedioPasos = sumaPasos / contador;
		System.out.println(pasosFiltrados);

		System.out.println("Promedio de los pasos: " +promedioPasos);

	}

}