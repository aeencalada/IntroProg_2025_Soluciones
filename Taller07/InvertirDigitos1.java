package invertirdigitos1;

import java.util.Scanner;

public class InvertirDigitos1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int num = sc.nextInt();

        int invertido = 0;

        for (int cos = num; cos > 0; cos /= 10) {
            int digito = cos % 10;
            invertido = invertido * 10 + digito;
        }

        System.out.println("Número invertido: " + invertido);
    }

}
