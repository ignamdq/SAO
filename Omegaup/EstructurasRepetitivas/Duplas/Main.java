/*
Se lee por teclado una secuencia de duplas
(cada una contiene un valor X y un valor Y, ambos son valores enteros positivos),
se termina con -1.

Se debe informar la cantidad de duplas que tienen ambos elementos pares,
y encontrar la dupla con menor diferencia (en valor absoluto) entre sus elementos X y Y e informar dicha diferencia.

La entrada consiste de los valores de cada dupla separadados por un espacio,
una dupla a continuación de otra (como mínimo viene una dupla).

La entrada siempre termina con el valor -1.

Salida
La salida consiste de dos líneas, según la descripción de arriba
(en la primer línea cantidad de duplas, en la segunda diferencia).

Entrada
1 4 2 2 5 8 -1
Salida
1
0

Entrada
3 3 -1
Salida
0
0

Entrada
2 8 6 4 4 5 -1
Salida
2
1
*/

package Duplas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadDuplasPares = 0;
        int menorDiferencia = Integer.MAX_VALUE;
        while (true) {
            int x = scanner.nextInt();
            if (x == -1) {
                break;
            }
            int y = scanner.nextInt();
            // Verificar si ambos elementos son pares
            if (x % 2 == 0 && y % 2 == 0) {
                cantidadDuplasPares++;
            }
            // Calcular la diferencia absoluta y actualizar si es la menor
            int diferencia = Math.abs(x - y);
            if (diferencia < menorDiferencia) {
                menorDiferencia = diferencia;
            }
        }
        scanner.close();
        // Imprimir la cantidad de duplas pares y la menor diferencia
        System.out.println(cantidadDuplasPares);
        System.out.println(menorDiferencia);
    }
}