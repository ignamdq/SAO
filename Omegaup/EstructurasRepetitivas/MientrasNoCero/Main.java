/*
Solicitar al usuario una cantidad indeterminada de números, teminar la solicitud cuando sea 0.
Desplegar al final la suma de los números tecleados.

Entrada
n cantidad de números enteros

Salida
La suma de los números tecleados

Ejemplo
Entrada: 12 1 7 0
Salida: 20
*/
package MientrasNoCero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;

        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();
            suma += numero;
        } while (numero != 0);

        suma -= 0;

        System.out.println("La suma de los números tecleados es: " + suma);
        scanner.close();
    }
}