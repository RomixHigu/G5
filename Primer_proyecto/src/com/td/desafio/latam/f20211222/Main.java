package com.td.desafio.latam.f20211222;

import java.util.ArrayList;

import com.td.desafio.latam.f20211222.models.Cardiologo;
import com.td.desafio.latam.f20211222.models.Medico;
import com.td.desafio.latam.f20211222.models.Neurologo;
import com.td.desafio.latam.f20211222.models.Oftalmologo;

public class Main {

   public static void main(String[] args) {

	   Medico medico = new Medico("House","1-9",55);
	   //medico.consulta();
	   
	   /**Polimorfismo*/
	   
	   Medico neurologo = new Neurologo("Tom","00000000",40,"Neurologia");
	   //neurologo.consulta();
	   
	   Medico cardiologo = new Cardiologo("Luis","2222222",42,"Cardiologia");
	   //cardiologo.consulta();
	   
	   Medico oftalmologo = new Oftalmologo("Sara","4444444",39,"Oftalmologia");
	   //oftalmologo.consulta();
	   Oftalmologo of = new Oftalmologo();
	   
	   //Arreglo de Medico
	   ArrayList<Medico> listaMedicos = new ArrayList <Medico>();
	   listaMedicos.add(medico);
	   listaMedicos.add(neurologo);
	   listaMedicos.add(cardiologo);
	   listaMedicos.add(oftalmologo);
	   listaMedicos.add(of);
	   
	   for (Medico medico2 : listaMedicos) {
		medico2.consulta();
		System.out.println(medico2.getClass().getSimpleName());
		
		Neurologo neuro = (Neurologo) neurologo;
		
		
	}
   }

}