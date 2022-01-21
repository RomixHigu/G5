package com.td.desafio.latam.f20211216;

import com.td.desafio.latam.f20211216.models.Automovil;

public class Main {

   public static void main(String[] args) {
	   //instancia de la clase automovil
	   Automovil automovil = new Automovil();
	   	System.out.println(automovil.toString());
	   	automovil.setColor("Rojo");
	   	automovil.setAltura(3.2d);
	   	automovil.setAncho(1.5d);
	   	automovil.setTipoMaterial("Metal");
	   	
	   
	   //instancia de un nuevo automovil
	   Automovil automovil2 = new Automovil();
	   automovil2.setColor("Negro");
	   automovil2.setAltura(3.4d);
	   automovil2.setAncho(1.7d);
	   automovil2.setTipoMaterial("Plastico");
	   System.out.println(automovil.toString());
	   System.out.println(automovil2.toString());
	   
	   //instancia de un nuevo automovil
	   Automovil automovil3 = new Automovil("Azul",4.1d,2.1d,"Plastico");
	   System.out.println(automovil3.toString());
   }

}