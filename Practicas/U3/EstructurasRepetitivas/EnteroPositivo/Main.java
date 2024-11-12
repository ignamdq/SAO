/*
Escribir un programa que valide el ingreso de un número entero positivo.
Si el número es negativo o cero, el programa debe solicitar el reingreso hasta que el número ingresado sea válido.
*/

package EnteroPositivo;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero;

        // El ciclo se repetira mientras numero <=0
        do {
            System.out.print("Por favor, ingrese un número entero positivo: ");

            numero = scanner.nextInt();

            if (numero <= 0) {
                System.out.println("El número ingresado no es válido. Debe ser mayor que cero.");
            }

        } while (numero <= 0);

        System.out.println("Número ingresado correctamente: " + numero);

        scanner.close();
    }
}
