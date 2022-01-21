import java.util.ArrayList;
import java.util.Iterator;

public class MultiplosDeTres {

	public static void main(String[] args) {
		ArrayList<Integer> multiplosTres = new ArrayList<Integer>();
		suma(args, multiplosTres);
		promedio(args, multiplosTres);
	}

	public static void suma(String[] args, ArrayList<Integer> multiplosTres) {

		ArrayList<Integer> resto = new ArrayList<Integer>();
		int suma = 0;

		for (int i = 0; i < args.length; i++) {
			if (Integer.parseInt(args[i]) % 3 == 0) {
				multiplosTres.add(Integer.parseInt(args[i]));
			} else {
				resto.add(Integer.parseInt(args[i]));
			}

		}
		for (Iterator<Integer> iterator = multiplosTres.iterator(); iterator.hasNext();) {
			Integer cantidad = (Integer) iterator.next();
			if (cantidad > 0) {
				suma = suma + cantidad;
			}
		}
		
		System.out.println(suma);
	}

	public static <E> void promedio(String[] args, ArrayList<Integer> multiplosTres) {
		int sumaMultiplos = 0;
		int contador = 0;
		int promedio = 0;

		for (int i = 0; i < multiplosTres.size(); i++) {
			contador = contador + 1;
		}
		for (Iterator<Integer> iterator = multiplosTres.iterator(); iterator.hasNext();) {
			Integer multiplos = (Integer) iterator.next();
			if (multiplos > 0) {
				sumaMultiplos = sumaMultiplos + multiplos;
			}
		}
		promedio = sumaMultiplos/contador;
		System.out.println(promedio);
	}
}
