/*
Dado un conjunto de N datos enteros no negativos, determina el mayor de ellos.

Entrada
En la primera línea el entero N (cantidad de elementos en el conjunto)
En la segunda los N enteros separados por espacios (elementos del conjunto)

Salida
El número mayor del conjunto.

Ejemplo

Entrada:
1ra linea: 5
2da linea: 2 3 50 8 1

Salida: 50
*/

package EncuentraMayor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un Scanner para la entrada

        // Leer la cantidad de números
        // System.out.print("Ingrese la cantidad de números: ");
        int N = scanner.nextInt(); // Leer el entero N

        // Limpiar el buffer del Scanner
        scanner.nextLine(); // Consumir la nueva línea pendiente

        // Validar que N sea positivo
        if (N <= 0) {
            // System.out.println("La cantidad de números debe ser mayor que cero.");
            scanner.close(); // Cerrar el Scanner antes de salir
            return; // Salir del programa
        }

        // Usar un bucle para permitir reingresar si la cantidad no es correcta
        while (true) {
            // System.out.print("Ingrese los " + N + " números separados por espacios: ");
            String entrada = scanner.nextLine(); // Leer la línea completa
            String[] numerosStr = entrada.split(" "); // Separar los números

            // Verificar si la cantidad de números ingresados es correcta
            if (numerosStr.length != N) {
                // System.out.println("Error: Se esperaban " + N + " números, pero se ingresaron
                // " + numerosStr.length + ". Intente nuevamente.");
                continue; // Volver a pedir la entrada
            }

            int mayor = -1; // Inicializar el mayor número
            boolean hayNumeros = true; // Suponemos que se ingresaron números

            // Procesar los números ingresados
            for (String numStr : numerosStr) {
                int numero = Integer.parseInt(numStr); // Convertir a entero

                // Asegurarnos de que el número es no negativo
                if (numero < 0) {
                    // System.out.println("Solo se permiten números enteros no negativos.");
                    hayNumeros = false; // Marcar que no se ingresaron números válidos
                    break; // Salir del bucle
                }

                // Determinar si el número ingresado es mayor que el actual mayor
                if (numero > mayor) {
                    mayor = numero; // Actualizar el mayor
                }
            }

            // Verificar si se ingresaron números válidos y mostrar el número mayor
            if (hayNumeros) {
                System.out.println(mayor);
                break; // Salir del bucle ya que todo fue correcto
            }
        }

        scanner.close(); // Cerrar el Scanner al final
    }
}