/*
Se lee por teclado una secuencia de duplas
(un valor A y un valor B, valores enteros), que termina con -1.

Se debe:
Informar la suma de los elementos de la dupla que tiene suma máxima.
Informar "SI", si hay 2 duplas sucesivas e iguales (iguales en el valor de sus dos elementos y en el orden de los mismos). "NO" en otro caso.

Entrada
La entrada consiste de los valores de cada dupla separados por un espacio, una dupla a continuación de otra
(como mínimo viene una dupla).
La entrada siempre termina con el valor -1.

Salida
La salida consiste de dos líneas, según la descripción de arriba
(en la primer línea el valor de la suma de la dupla de suma máxima, en la segunda "SI" ó "NO" según explicación de arriba).

Entrada: 7 6 1 5 2 15 -1
Salida: 17
        NO

Entrada: 7 6 7 6 2 15 8 8 -1
Salida: 17
        SI

Entrada: 2 8 -1
Salida: 10
        NO
*/

package DuplasDos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxSuma = Integer.MIN_VALUE;
        boolean tieneDuplasIguales = false;
        int anteriorA = Integer.MIN_VALUE;
        int anteriorB = Integer.MIN_VALUE;

        while (true) {
            int A = scanner.nextInt();
            if (A == -1)
                break;
            int B = scanner.nextInt();

            // Actualizar la suma máxima
            int suma = A + B;
            if (suma > maxSuma) {
                maxSuma = suma;
            }

            // Verificar duplas consecutivas e iguales
            if (A == anteriorA && B == anteriorB) {
                tieneDuplasIguales = true;
            }

            // Actualizar los valores anteriores
            anteriorA = A;
            anteriorB = B;
        }

        scanner.close();

        // Imprimir los resultados
        System.out.println(maxSuma);
        System.out.println(tieneDuplasIguales ? "SI" : "NO");
    }
}
