/*
Leer por teclado un valor N, 3 <= N <= 10 y luego, por filas y columnas, los valores enteros de una matriz cuadrada de NxN.
Determinar si existen en la matriz, dos filas (sólo 2) que tengan todos sus elementos impares.
En caso de que sea así imprimir "SI", en otro caso imprimir "NO".

Ej: Si N=5, y los valores ingresados son:
1 2 3 4 5
5 5 5 5 5
6 7 8 8 7
1 1 1 1 1
2 1 1 8 1
La fila 1 y la fila 3 tienen todos sus elementos impares, por lo tanto hay que imprimir "SI"

Entrada:
La primer línea de entrada contendrá el valor N.
Luego vendrán N líneas con los 1 <=Ni <= 1000 elementos separados por un espacio.

Salida
Si hay dos filas que tengan todos sus elementos impares imprimir "SI", en otro caso imprimir "NO"

Entrada:
5 "Enter"
1   2   3   4   5 "Enter"
5   5   5   5   5 "Enter"
6   7   8   8   7 "Enter"
1   1   1   1   1 "Enter"
2   1   1   8   1 "Enter"

Salida:
SI
*/

package DosFilas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el valor de N
        int N = scanner.nextInt();

        // Validar que N esté en el rango correcto
        if (N < 3 || N > 10) {
            System.out.println("NO");

        }

        // Crear la matriz NxN
        int[][] matriz = new int[N][N];

        // Leer los valores de la matriz
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Contar filas con todos los elementos impares
        int filasImpares = 0;

        for (int i = 0; i < N; i++) {
            boolean esImpar = true;
            for (int j = 0; j < N; j++) {
                if (matriz[i][j] % 2 == 0) {
                    esImpar = false;
                    break;
                }
            }
            if (esImpar) {
                filasImpares++;
            }
        }

        // Verificar si existen exactamente dos filas impares
        if (filasImpares == 2) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
