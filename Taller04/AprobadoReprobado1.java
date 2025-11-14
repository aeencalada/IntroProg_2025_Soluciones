import java.util.Scanner;

public class AprobadoReprobado1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la nota final (0 a 10): ");
        float nota = sc.nextFloat();

        if (nota >= 7) {
            System.out.println("Aprobado 🎉");
        } else {
            System.out.println("Reprobado 😞");
        }

    }
}