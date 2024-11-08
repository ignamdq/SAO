package Adivinanza;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        int intentos = 0;
        int adivinanza;

        System.out.println("Adivina el número (entre 1 y 100): ");

        do {
            System.out.print("Introduce tu intento: ");
            adivinanza = scanner.nextInt();
            intentos++;

            if (adivinanza < numeroAleatorio) {
                System.out.println("Es más alto.");
            } else if (adivinanza > numeroAleatorio) {
                System.out.println("Es más bajo.");
            } else {
                System.out.println("¡Felicidades! Adivinaste en " + intentos + " intentos.");
            }
        } while (adivinanza != numeroAleatorio);

        scanner.close();
    }
}
