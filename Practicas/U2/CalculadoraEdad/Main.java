// Calculadora de edad
package CalculadoraEdad;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1. Objeto Scanner para recibir la entrada del usuario por teclado.
        Scanner scanner = new Scanner(System.in);

        // Declaración de variables para almacenar las edades de dos usuarios.
        System.out.print("Ingrese la edad del primer usuario: ");
        int edadUsuario1 = scanner.nextInt();

        System.out.print("Ingrese la edad del segundo usuario: ");
        int edadUsuario2 = scanner.nextInt();

        // 2. Cálculo de la cantidad de días que representan esas edades.
        int diasUsuario1 = edadUsuario1 * 365;
        int diasUsuario2 = edadUsuario2 * 365;

        // 3. Mostrar los resultados en la consola.
        System.out.println("El primer usuario ha vivido aproximadamente " + diasUsuario1 + " días.");
        System.out.println("El segundo usuario ha vivido aproximadamente " + diasUsuario2 + " días.");

        // Cierre del scanner para evitar fugas de recursos.
        scanner.close();
    }
}
