
public class Tienda {

	private Vendedor vendedor;
	private Vehiculo vehiculo;
	private int stock;
	
	public Tienda(Vendedor vendedor, Vehiculo vehiculo, int stock) {
		super();
		this.vendedor = vendedor;
		this.vehiculo = vehiculo;
		this.stock = stock;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public int existeStock() {
		System.out.println("La cantidad de stock es "+stock);
		return stock;
		
	}
}
