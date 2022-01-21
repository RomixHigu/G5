package com.td.desafio.latam.f20211209;

public class EjercicioSuma {

	public static void main(String[] args) {
		/*
		 * Crear un m�todo llamado Suma que retorna un n�mero entero de la suma. Dentro
		 * del m�todo suma, declarar una variable local llamada suma que parte en cero.
		 * Inicializar el arreglo con valores aleatorios. Recorrer el arreglo con un
		 * ciclo for. Dentro del ciclo, realizar condici�n if donde preguntamos por los
		 * valores que est�n en el intervalo solicitado. Si la condici�n se cumple,
		 * sumar� todos los valores.
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
