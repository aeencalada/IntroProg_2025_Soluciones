package primermultiplodesiete1;

import java.util.Scanner;

public class PrimerMultiploDeSiete1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio, fin;
        boolean encontrado = false;
        System.out.print("Indique el valor inicial del rango: ");
        inicio = sc.nextInt();
        System.out.print("Indique el valor final del rango: ");
        fin = sc.nextInt();
        for (int i = inicio; i <= fin; i++) {
            if (i % 13 == 0) {
                System.out.println("\nEl primer múltiplo de 7 en el rango de: "
                        + inicio + " a " + fin + " es: " + i);
                encontrado = true;
                break;  // Se rompe el forantes del límite
            }
        }
        if (!encontrado) {
            System.out.println("\nNo hay múltiplos de 7 en el rango especificado");
        }
    }
}
