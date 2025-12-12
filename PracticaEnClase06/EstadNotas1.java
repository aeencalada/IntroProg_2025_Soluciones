package estadnotas1;

import java.util.Scanner;

public class EstadNotas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short N, ca, cd;
        float suma, promedio;
        
        do {
            System.out.print("¿Cuantas notas va a ingresar? ");
            N = sc.nextShort();
        } while (N <= 0);
        
        float notas[] = new float[N];
        
        suma = 0;
        for (short i = 0; i <= N-1; i++) {
            do {
                System.out.print("Ingrese la nota " + (i+1) + ": " );
                notas[i] = sc.nextFloat();
            } while (notas[i] < 0 || notas[i] > 10);
            suma += notas[i];    
        }
        
        promedio = suma / N;
        ca = 0;
        cd = 0;
        for (short i = 0; i <= N-1; i++){
            if (notas[i] >= promedio) {
                ca++;
            } else {
                cd++;
            }
        }
        
        System.out.println("\nPromedio: " + promedio);
        System.out.println("Estudiantes por arriba de la media: " + ca);
        System.out.println("Estudiantes por debajo de la media: " + cd);        
    }
    
}
