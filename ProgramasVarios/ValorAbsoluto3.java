import java.util.Scanner;

public class ValorAbsoluto3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float numero, valorAbs;

    System.out.print("Ingrese un número: ");
    numero = sc.nextFloat();

    if (numero >= 0) {
        valorAbs = numero;
    } else {
        valorAbs = numero * -1;
    }

    System.out.println("\nEl valor absoluto del número " + numero + " es " + valorAbs);

  }
}