/* Múltiplos en un rango
 * En extras valida pero en Estructuras Repetitivas no   
 * Este programa cuenta cuántos múltiplos de un número C existen entre dos números A y B.
 * 
 * Entrada:
 * - Tres números enteros A, B y C, donde:
 *   - A es el inicio del rango.
 *   - B es el final del rango.
 *   - C es el número del que queremos contar los múltiplos.
 * 
 * Salida:
 * - Un entero N que indica la cantidad de múltiplos de C en el rango de A a B, inclusivo.
 * 
 * Ejemplo:
 * Entrada: 2 20 5
 * Salida: 4
 * Explicación: Entre 2 y 20 hay 4 múltiplos de 5 (5, 10, 15, 20).
 * 
 * Entrada: 7 80 6
 * Salida: 12
 * Explicación: Entre 7 y 80 hay 12 múltiplos de 6 (12, 18, 24, ..., 78).
 * 

 */

package MultiplosRango;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();
        scanner.close();

        // Encuentra el primer múltiplo de C que sea >= A
        long primerMultiplo = (A % C == 0) ? A : (A / C + 1) * C;

        // Encuentra el último múltiplo de C que sea <= B
        long ultimoMultiplo = (B / C) * C;

        // Si no hay múltiplos de C en el rango, retorna 0
        if (primerMultiplo > B) {
            System.out.println(0);
            return;
        }

        // Cuenta de múltiplos entre primerMultiplo y ultimoMultiplo
        long cantidadMultiplos = (ultimoMultiplo - primerMultiplo) / C + 1;
        System.out.println(cantidadMultiplos);
    }
}