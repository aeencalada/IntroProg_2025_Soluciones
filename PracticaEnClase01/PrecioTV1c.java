public class PrecioTV1c {
	public static void main (String[] args) {
		float precio, iva, total;

		precio = 837;
		iva = (float)(precio * 0.15);
		total = precio + iva;

		System.out.println("Precio del televisor: " + precio + " USD");
		System.out.println("IVA (15%): " + iva + " USD");
		System.out.println("Total a pagar: " + total + " USD");

	}
}

