
public class Main {

	public static void main(String[] args) {
		MiniBus mini = new MiniBus();
		Vehiculo auto1 = new Vehiculo();
		
		mini.imprimeBus();
		//(Vendedor vendedor, Vehiculo vehiculo, int stock)
		//String rut, String nombre, int edad, String direccion
		Vendedor vendedor = new Vendedor("2123","Juan",36,"stgo");
		
		Tienda tienda = new Tienda(vendedor, mini, 3);
		tienda.existeStock();
		
		Taxi taxi = new Taxi ("Negro", "23jk",600);
		taxi.pagarPasaje(500);
	}

}
