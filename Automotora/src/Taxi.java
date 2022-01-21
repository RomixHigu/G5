
public class Taxi extends Vehiculo {

	private int valorPasaje;

	public Taxi(String color, String patente, int valorPasaje) {
		super(color, patente);
		this.valorPasaje = valorPasaje;
	}

	public int getValorPasaje() {
		return valorPasaje;
	}

	public void setValorPasaje(int valorPasaje) {
		this.valorPasaje = valorPasaje;
	}

	public void pagarPasaje(int pasajePagado) {
		int vuelto = 0;
		if (pasajePagado > valorPasaje) {
			vuelto = pasajePagado - valorPasaje;
			System.out.println("Su vuelto es $" + vuelto);

		} else {
			System.out.println("El valor del pasaje es de $" + valorPasaje);
		}
	}
}