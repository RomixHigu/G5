package com.td.desafio.latam.f20211227;


import com.td.desafio.latam.f20211227.models.Animal;
import com.td.desafio.latam.f20211227.models.Bebe;
import com.td.desafio.latam.f20211227.models.Conejo;
import com.td.desafio.latam.f20211227.models.Humano;
import com.td.desafio.latam.f20211227.models.Tigre;

public class Main {

   public static void main(String[] args) {
	   //clases abstractas, no se pueden implementar
	   //Animal animal = new Animal();	   
	   //Omnivoro omni = new Omnivoro();
	   Humano humano = new Humano();
	   humano.metodoOmnivoro();
	   
	   Tigre tigre = new Tigre();
	   tigre.metodoCarnivoro();
	   
	   Conejo conejo = new Conejo();
	   
	   /** 
	    * CLASES ABSTRACTAS
	    * - No se pueden implementar
	    * - Solo ellas pueden tener metodos abstractos
	    * - Metodos abstractos solo se definen
	    * - Las clases abstractas que heredan de otra clase abstracta
	    * no implementan sus metodos
	    * - Las clases concretas deben sobreescribir los metodos
	    */
	   
	   Bebe bebe = new Bebe();
	   bebe.metodoOmnivoro();
	   
	   //Animal aniBb = new Bebe(); POLIMORFISMO
	   
	  
	   
   }

   
}