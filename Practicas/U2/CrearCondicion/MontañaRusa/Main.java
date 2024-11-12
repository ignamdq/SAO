// Para poder subir a la montaña rusa
// (a) la edad debe ser mayor a 12 años
// (b) altura debe ser mayor a 1.30 metros

package MontañaRusa;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // El Scanner usa el formato de punto (.) para decimales
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt(); // Leer un número entero

        System.out.print("Ingrese su altura en metros: ");

        // Validar con un while
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, ingrese un número decimal válido para la altura (por ejemplo, 1.85).");

            // Limpiar el buffer del scanner
            scanner.next();
        }
        double altura = scanner.nextDouble();

        boolean puedeSubir = edad > 12 && altura > 1.30;

        System.out.println("¿Puede subir a la montaña rusa? " + puedeSubir);

        scanner.close();
    }
}
