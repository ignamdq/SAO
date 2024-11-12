/* Funciones Recursivas
 * Una función recursiva es aquella que se llama a sí misma dentro de su propia definición.
 * Esto permite resolver problemas al dividirlos en partes más pequeñas y similares al problema original. 
 * En cada llamada recursiva, se reduce el problema hasta llegar a un caso base, el cual finaliza la recursión.
 *
 * En este ejemplo, la función `factorial` calcula el factorial de un número entero positivo.
 * El caso base es cuando el número es 1, ya que 1! = 1. Para números mayores a 1, 
 * la función llama a sí misma con el valor decreciente del número hasta alcanzar el caso base.
 *
 * Ejemplo: Factorial de 4
 * 4! = 4 * 3 * 2 * 1 = 24
 * 
 * El programa pide al usuario un número positivo e imprime el factorial usando recursividad.
 */

package FuncionesRecursivas;

import java.util.Scanner;

public class Main {

    public static int factorial(int n) {
        // Caso base: si n es 1, devolver 1 ya que 1! = 1
        if (n == 1) {
            return 1;
        }
        // Llamada recursiva: n * factorial(n - 1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            int resultado = factorial(numero);
            System.out.println("El factorial de " + numero + " es: " + resultado);
        } else {
            System.out.println("Por favor, ingrese un número entero positivo.");
        }

        scanner.close();
    }
}
