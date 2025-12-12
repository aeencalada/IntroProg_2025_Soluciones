package tablamultiplicar1;

import java.util.Scanner;

public class TablaMultiplicar1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short resultado;
        byte num;

        do {
            System.out.print("Ingrese un número (1-10): ");
            num = sc.nextByte();
        } while (num < 1 || num > 10);

        for (byte i = 1; i <= 12; i++) {
            resultado = (short) (num * i);
            System.out.println(num + " x " + i + " = " + resultado);
        }
    }
}

