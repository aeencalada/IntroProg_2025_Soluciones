import java.util.Scanner;

public class ValorAbsoluto4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float numero, valorAbs;
    byte mul;

    System.out.print("Ingrese un número: ");
    numero = sc.nextFloat();

    if (numero >= 0) {
        mul = 1;
    } else {
        mul = -1;
    }

    valorAbs = numero * mul;

    System.out.println("\nEl valor absoluto del número " + numero + " es " + valorAbs);

  }
}