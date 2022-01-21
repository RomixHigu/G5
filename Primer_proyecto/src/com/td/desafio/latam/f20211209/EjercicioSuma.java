package com.td.desafio.latam.f20211209;

public class EjercicioSuma {

	public static void main(String[] args) {
		/*
		 * Crear un método llamado Suma que retorna un número entero de la suma. Dentro
		 * del método suma, declarar una variable local llamada suma que parte en cero.
		 * Inicializar el arreglo con valores aleatorios. Recorrer el arreglo con un
		 * ciclo for. Dentro del ciclo, realizar condición if donde preguntamos por los
		 * valores que están en el intervalo solicitado. Si la condición se cumple,
		 * sumará todos los valores.
		 */
		Integer suma = suma();
		System.out.println("La suma de los numeros entre 1 y 10 es: " +suma);
	}

	public static Integer suma() {
		Integer suma = 0;
		int[] arregloNumeros = { 1, 2, 5, 9, 3, 7, 22, 65, 34, 98, 45, 8, 32 };
		for (int i = 0; i < arregloNumeros.length; i++) {
			int numero = arregloNumeros[i];
			if (numero >= 1 && numero <= 10) {
				suma = suma + numero;
			}
		}
		return suma;
	}
}
