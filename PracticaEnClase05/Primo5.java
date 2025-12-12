package primo5;

import java.util.Scanner;

public class Primo5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número mayor o igual a 2: ");
        int n = sc.nextInt();

        boolean esPrimo = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                esPrimo = false;
                break;
            }
        }

        if (esPrimo) {
            System.out.println(n + " es primo.");
        } else {
            System.out.println(n + " NO es primo.");
        }
    }    
}
