package cl.desafio.latam;

import java.util.Scanner;

public class Fechas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("______________________");
		System.out.println("");
		System.out.println("Quien es mayor?");
		System.out.println("______________________");
		System.out.println("");
		
		System.out.println("Ingrese la primera fecha en formato DD/MM/AAAA ");
        String fecha1 = sc.next();

        System.out.println("Ingrese la segunda fecha en formato DD/MM/AAAA ");
        String fecha2 = sc.next();
        
        int dia1= Integer.parseInt(fecha1.substring(0,2));
        int mes1 = Integer.parseInt(fecha1.substring(3,5));
        int anio1 = Integer.parseInt(fecha1.substring(6));
        
        int dia2 = Integer.parseInt(fecha2.substring(0,2));
        int mes2 = Integer.parseInt(fecha2.substring(3,5));
        int anio2 = Integer.parseInt(fecha2.substring(6));

        if (anio1 < anio2) {
        	System.out.println("Pesona 1 es mayor");
         } else if (anio2 < anio1) {
        	System.out.println("Persona 2 es mayor");
           } else if (mes1 < mes2) {
        		System.out.println("Persona 1 es mayor");
        	} else if (mes2 < mes1) {
        		System.out.println("Persona 2 es mayor");
        	  } else if (dia1 < dia2) {
        			System.out.println("Persona 1 es mayor");
        	    } else if (dia2 < dia1) {
        			System.out.println("Persona 2 es mayor");
        	} else {
        			System.out.println("Tienen la misma edad");
        		}
      sc.close();
  }
         
	


    
	}
 
