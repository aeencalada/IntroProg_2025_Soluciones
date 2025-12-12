package factorial2;

import java.util.Scanner;

public class Factorial2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short N;
        long factorial;

        do {
            System.out.print("Ingrese un número entero positivo: ");
            N = sc.nextShort();
        } while (N < 0);

        factorial = 1;
        for (short c = 2; c <= N; c++) {
            factorial = factorial * c;
        }

        System.out.println("El factorial de " + N + " es " + factorial);
    }
}

