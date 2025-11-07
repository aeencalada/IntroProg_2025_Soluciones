import java.util.Scanner;

public class MayorMenorEdad1c {
	public static void main (String[] args) {
		// Declaración de variables
		Scanner sc = new Scanner(System.in);
		short anioN, anioA;
		byte edad;
		String mensaje;

		// Entrada de datos
		System.out.print("Ingrese su año de nacimiento: ");
		anioN = sc.nextShort();
		System.out.print("Ingrese el año actual: ");
		anioA = sc.nextShort();

		// Proceso y salida de datos
		edad = (byte) (anioA - anioN);
		mensaje = "MAYOR";
		if (edad < 18) {
			mensaje = "MENOR";
		}

		System.out.println("\nUsted es " + mensaje + " de edad");						
	}
}

