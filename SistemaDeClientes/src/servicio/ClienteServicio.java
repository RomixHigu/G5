package servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.CategoriaEnum;
import modelo.Cliente;

public class ClienteServicio {
	private List<Cliente> listaCliente;

	public ClienteServicio() {
		super();
		listaCliente = new ArrayList<>();
	}

	public ClienteServicio(List<Cliente> listaCliente) {
		super();
		this.listaCliente = listaCliente;
		listaCliente = new ArrayList<>();
	}

	public List<Cliente> getListaCliente() {
		return listaCliente;
	}

	public void setListaCliente(List<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}

	public void listarCliente() {
		System.out.println(listaCliente);
	}

	public String agregarCliente(Cliente cliente) {
		if (cliente != null) {
			listaCliente.add(cliente);
			return "Cliente creado";
		} else {
			return "Cliente no creado";
		}
	}

	public void editarCliente() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese RUN del Cliente a editar: ");
		String runEdit = sc.nextLine();
		for (Cliente cliente : listaCliente) {
			if (cliente.getRun().equals(runEdit)) {
				System.out.println(
						"Seleccione Item a editar: \n1.- Cambiar Categoria del Cliente\n2.-Editar los datos del Cliente");
				int opcion = sc.nextInt();
				if (opcion == 1) {
					System.out.println("Categoria actual del Cliente: " + cliente.getCategoria());
					System.out.println(" ");

					System.out.println("Ingrese nueva categoria: ");
					String estado = sc.next();

					if (estado.equalsIgnoreCase("activo")) {
						cliente.setCategoria(CategoriaEnum.ACTIVO);
					} else if (estado.equalsIgnoreCase("inactivo")) {
						cliente.setCategoria(CategoriaEnum.INACTIVO);
					}
				} else if (opcion == 2) {
					System.out.println("Ingrese item a editar");
					String editar = sc.next();
					if (editar.equalsIgnoreCase("antiguedad")) {
						System.out.println("Ingrese nuevo dato");
						int detalleA = sc.nextInt();
						cliente.setAntiguedad(detalleA);
					} else {
						System.out.println("Ingrese nuevo dato");
						String detalle = sc.next();

						switch (editar.toLowerCase()) {
						case "run":
							cliente.setRun(detalle);
							break;
						case "nombre":
							cliente.setNombre(detalle);
							break;
						case "apellido":
							cliente.setApellido(detalle);
							break;
						case "antiguedad":

							break;

						}
					}
				}
				System.out.println("Cliente editado con exito!");
			}

		}

	}

}
