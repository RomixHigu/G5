package com.desafiolatam.gs_testing;

import servicios.ServicioPersona;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ServicioPersona serviciopersona = new ServicioPersona();
        
        serviciopersona.crearPersona(null);
        serviciopersona.actualizarPersona(null);
        serviciopersona.eliminarPersona(null);
    }
}
