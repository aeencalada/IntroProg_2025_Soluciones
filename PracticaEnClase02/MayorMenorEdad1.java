import java.util.Scanner;

public class MayorMenorEdad1 {
	public static void main (String[] args) {
		// Declaración de variables
		Scanner sc = new Scanner(System.in);
		short anioN, anioA;
		byte edad;

		// Entrada de datos
		System.out.print("Ingrese su año de nacimiento: ");
		anioN = sc.nextShort();
		System.out.print("Ingrese el año actual: ");
		anioA = sc.nextShort();

		// Proceso y salida de datos
		edad = (byte) (anioA - anioN);
		if (edad >= 18) {
			System.out.println("\nUsted es MAYOR de edad");
		} else {
			System.out.println("\nUsted es MENOR de edad");						
		}

	}
}

