/*
Dados los datos enteros de una matriz cuadrada de N filas por N columnas.

1 <= N <= 100

Determina si se trata de una matriz diagonal.

En una matriz diagonal, todas las casillas de la diagonal desde la 0,0 hasta la F-1,C-1 tienen el mismo valor.

Entrada: En la primera línea el entero N que denota el número de filas y columnas de la matriz.
En cada una de las siguientes N filas, N enteros separados por espacios.

Salida
Imprime SI en caso de que la entrada describa una matriz diagonal, NO en caso contrario.

Entrada:
4
1 2 3 4
5 1 4 9
8 7 1 2
9 9 3 1

Salida
SI

Explicación de la salida
El caso de ejemplo es una matriz diagonal porque las casillas 0,0; 1,1; 2,2y 3,3 tienen el valor 1, es decir, todas las casillas de la diagonal tienen el mismo valor.
*/

package MatrizDiagonal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el valor de N
        int N = scanner.nextInt();

        // Crear la matriz NxN
        int[][] matriz = new int[N][N];

        // Leer los valores de la matriz
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Verificar si la matriz es diagonal (solo verificando que la diagonal tenga el
        // mismo valor)
        boolean esDiagonal = true;
        int valorDiagonal = matriz[0][0]; // El valor de la diagonal debe ser el mismo

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j && matriz[i][j] != valorDiagonal) { // Verificar que todos los valores de la diagonal sean
                                                               // iguales
                    esDiagonal = false;
                    break;
                }
            }
            if (!esDiagonal) {
                break;
            }
        }

        // Imprimir el resultado
        if (esDiagonal) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}