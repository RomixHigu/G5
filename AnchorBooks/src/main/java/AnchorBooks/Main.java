package AnchorBooks;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class Main {

	public static void main(String[] args) {

		System.out.println(ejercicio6());

		ejercicio7(ejercicio6());

		ejercicio8(ejercicio6());

		System.out.println(ejercicio9());

		ejercicio10(ejercicio6());

		ejercicio11(ejercicio9());

	}

	public static List<Book> ejercicio6() {
		System.out.println(" ");
		System.out.println(" *** ");
		Client book = ClientBuilder.newClient();
		WebTarget target = book.target("https://my-json-server.typicode.com/Himuravidal/anchorBooks").path("books");

		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response respuestaLibros = invocationBuilder.get();
		List<Book> listaLibros = respuestaLibros.readEntity(new GenericType<List<Book>>() {
		});
		return listaLibros;

	}

	public static void ejercicio7(List<Book> listaLibros) {

		for (int i = 0; i < listaLibros.size(); i++) {
			System.out.println(listaLibros.get(i).getAuthor() + ": " + listaLibros.get(i).getTitle());
		}
	}

	public static void ejercicio8(List<Book> listaLibros) {

		System.out.println("Libro numero 3: " + listaLibros.get(3).getAuthor() + ", " + listaLibros.get(3).getTitle()
				+ ", " + listaLibros.get(3).getCountry());
		System.out.println("Libro numero 8: " + listaLibros.get(8).getAuthor() + ", " + listaLibros.get(8).getTitle()
				+ ", " + listaLibros.get(8).getCountry());

	}

	public static List<BookDetails> ejercicio9() {
		System.out.println(" *** ");
		Client book = ClientBuilder.newClient();
		WebTarget target = book.target("https://my-json-server.typicode.com/Himuravidal/anchorBooks")
				.path("bookDetail");

		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response respuestaLibros = invocationBuilder.get();
		List<BookDetails> listaLibrosD = respuestaLibros.readEntity(new GenericType<List<BookDetails>>() {
		});
		return listaLibrosD;
	}

	public static void ejercicio10(List<Book> listaLibros) {

		for (Book filtro : listaLibros) {
			if (filtro.getAuthor().equalsIgnoreCase("Unknown")) {
				System.out.println("Autor: " + filtro.getAuthor() + " - libro: " + filtro.getTitle());
			}
		}
	}

	public static void ejercicio11(List<BookDetails> listaLibrosD) {

		System.out.println("Libros con delivery disponible: ");
		System.out.println(" ");

		for (BookDetails filtro : listaLibrosD) {
			if (filtro.getDelivery().booleanValue()) {
				System.out.println("Libro: " + filtro.getTitle());
			}
		}
	}
}
