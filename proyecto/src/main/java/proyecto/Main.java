package proyecto;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
//import java.awt.print.Book;

public class Main {

	public static void main(String[] args) {
		delete();
		get();
	}

	public static void get() {
		//Crear un cliente
		Client cliente = ClientBuilder.newClient();

		//Cliente consume informacion desde una API
		WebTarget target = cliente.target("https://jsonplaceholder.typicode.com").path("posts");
		
		//WebTarget construye el Request
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		
		//El builder tiene la informacion del request y le pedimos ejecutar un get
		Response respuestaPublicaciones = invocationBuilder.get();
		
		//A la respuesta le pedimos que lea la informacion
		List<Publicacion> listaPublicaciones = respuestaPublicaciones.readEntity(new GenericType<List<Publicacion>>(){}); 
		
		//Obtenemos todos los libros
		System.out.println(listaPublicaciones);
		System.out.println(listaPublicaciones.get(0));
		
		respuestaPublicaciones.getStatusInfo();
		respuestaPublicaciones.getHeaderString(null);
		
	
		
		listaPublicaciones.forEach(System.out::println);
	}
	public static void post() {
		Publicacion publicacion = new Publicacion();
		publicacion.setTitle("LoTR");
		publicacion.setBody("A ring");
		publicacion.setUserId(1);
		publicacion.setId(101);
		Client cliente = ClientBuilder.newClient();
		WebTarget target = cliente.target("https://jsonplaceholder.typicode.com").path("posts");
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response publicacionRespuesta = invocationBuilder.post(Entity.entity(publicacion,MediaType.APPLICATION_JSON));
		System.out.println(publicacionRespuesta);
	}
	
	public static void put() {
		Publicacion publicacion = new Publicacion();
		publicacion.setTitle("LoTR");
		publicacion.setBody("Three Movies");
		publicacion.setUserId(1);
		publicacion.setId(101);
		
		Client cliente = ClientBuilder.newClient();
		WebTarget target = cliente.target("https://jsonplaceholder.typicode.com").path("posts").path("1");
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response publicacionRespuesta = invocationBuilder.put(Entity.entity(publicacion, MediaType.APPLICATION_JSON));
		
		System.out.println(publicacionRespuesta);
	}
	public static void delete() {
		Client cliente = ClientBuilder.newClient();
		
		WebTarget target = cliente.target("https://jsonplaceholder.typicode.com").path("posts").path("101");
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response publicacionRespuesta = invocationBuilder.delete(); 
		
		System.out.println(publicacionRespuesta);
	}
	
	public static void comment() {
		//Crear un cliente
		Client client = ClientBuilder.newClient();
		//Cliente consume desde una API alguna información
		WebTarget target =
		client.target("https://jsonplaceholder.typicode.com").path("comments");
		//WebTarget construye el Request
		Invocation.Builder invocationBuilder =
		target.request(MediaType.APPLICATION_JSON);
		//Al builder, que es el que tiene la información del request, le pedimos ejecutar un get
		Response respuestaPublicaciones = invocationBuilder.get();
		//A la respuest le pedimos que lea la información
		List<Comment> listaPublicaciones =
		respuestaPublicaciones.readEntity(new
		GenericType<List<Comment>>() {});
		//Obtenemos todos los comments
		System.out.println(listaPublicaciones);
		
	}
}
