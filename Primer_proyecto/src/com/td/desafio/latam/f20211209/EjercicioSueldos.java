package com.td.desafio.latam.f20211209;

public class EjercicioSueldos {

	public static void main(String[] args) {
		/*
		 * Crear un método el cual retorna el promedio de sueldo en tipo de dato double.
		 * 
		 * Tenemos el siguiente arreglo como ejemplo:
		 * 
		 * int[] sueldos = { 400000, 760000, 1100000, 650000, 654980, 987300, 700450,
		 * 442300 };
		 * 
		 * Se requiere promediar los sueldos que sean mayores a 500000 y retornar este
		 * valor.
		 */

		Double promedio = promedio();
		System.out.println("El promedio de los sueldos mayores a 500000 es: " + promedio);

	}

	public static Double promedio() {
		double promedio = 0;
		double sumaSueldos = 0;
		int cantidad = 0;

		int[] sueldos = { 400000, 760000, 1100000, 650000, 654980, 987300, 700450, 442300 };
		for (int i = 0; i < sueldos.length; i++) {
			int sueldo = sueldos[i];
			if (sueldo < 500000) {
				sumaSueldos = sumaSueldos + sueldo;
				cantidad = cantidad + 1;
			}
		}
		promedio = sumaSueldos / cantidad;
		return promedio;
	}
}