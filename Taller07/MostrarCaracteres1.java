package mostrarcaracteres1;

import java.util.Scanner;

public class MostrarCaracteres1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;

        do {
            System.out.print("Ingrese una palabra: ");
            palabra = sc.nextLine();
        } while (palabra.length() == 0);

        for (int i = 0; i < palabra.length(); i++) {
            System.out.println(palabra.charAt(i));
        }
    }
}

