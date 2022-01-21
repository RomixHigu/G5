
public class Visitas {

	public static void main(String[] args) {
		promedio(args);

	}

	public static int promedio(String[] args) {

		int sumaVisitas = 0;
		int contador = 0;
		int promedioVisitas = 0;

		for (int i = 0; i < args.length; i++) {
			sumaVisitas = sumaVisitas + Integer.parseInt(args[i]);
			contador = contador + 1;
		}

		promedioVisitas = sumaVisitas / contador;
		System.out.println("Para la entrada anterior, el resultado es " + promedioVisitas);
		return promedioVisitas;

	}

}
