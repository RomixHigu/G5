package Modelo;

public class Calculadora {	


	/* FASE VERDE
	public int sumar(int numero1, int numero2) {
		int suma = numero1 + numero2;
		return suma;
	}
	
	public int restar(int numero1, int numero2) {
		int resta = numero1 - numero2;
		return resta;
	}
	
	public int multiplicar(int numero1, int numero2) {
		int multi =numero1 * numero2;
		return multi;
	}
	public float dividir(int numero1, int numero2) {
		float div= (float)numero1 / numero2;
		return div;
	}*/
	
	
	public int sumar(int numero1, int numero2) {
		int suma = numero1 + numero2;
		return suma;
	}

	public int restar(int numero1, int numero2) {
		int resta = 0;
		if (numero1 > numero2) {
			resta = numero1 - numero2;			
		} else {
			resta = numero2 - numero1;
		}
		return resta;
	}

	public int multiplicar(int numero1, int numero2) {
		int multi = numero1 * numero2;		
		return multi;
	}

	public float dividir(int numero1, int numero2) {
		float div = 0;
		if (numero1 > numero2) {
			div = (float) (numero1 / numero2);
		}else {
			div = (float)(numero2 / numero1);
		}
		return div;
	}
}
