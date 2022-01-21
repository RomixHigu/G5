import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class VisitasRespaldo {
	public static void main(String[] args) {
		clearSteps();

	}

	public static ArrayList<Integer> clearSteps() {
		int sumaPasos = 0;
		int contador = 0;
		int promedioPasos = 0;

		ArrayList<Integer> pasos = new ArrayList<Integer>();
		ArrayList<Integer> pasosEliminados = new ArrayList<Integer>();
		ArrayList<Integer> pasosFiltrados = new ArrayList<Integer>();
		pasos.add(300);
		pasos.add(405);
		pasos.add(403);
		pasos.add(506);
		pasos.add(100020040);
		pasos.add(45006);
		pasos.add(-1044);

		for (Iterator<Integer> iterator = pasos.iterator(); iterator.hasNext();) {
			Integer cantidadPasos = (Integer) iterator.next();
			if (cantidadPasos > 200 && cantidadPasos < 100000) {
				pasosFiltrados.add(cantidadPasos);
				sumaPasos = sumaPasos + cantidadPasos;
				contador = contador + 1;

			} else {
				pasosEliminados.add(cantidadPasos);
			}

			promedioPasos = sumaPasos / contador;
		}
		System.out.println(promedioPasos);
		return pasosFiltrados;
	}

}
