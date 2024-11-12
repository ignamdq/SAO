/*
 * Emilia está muy asustada, porque no le gustan las matemáticas (ya te habrás
 * dado cuenta de eso) y ya se acerca el fin del año escolar. Necesita saber su
 * promedio actual de los exámenes que tuvo durante el año para ver como va! Y
 * también necesita que le indiques la nota mínima necesaria que debe sacarse en
 * la única prueba que le falta hacer para aprobar la materia. Aprueba si tiene
 * promedio mayor o igual a 6. Emilia quiere ingresar la cantidad de pruebas que
 * ya hizo y luego una a una las notas que obtuvo en ellas. Y saber entonces su
 * promedio actual y la nota necesaria en el último examen para aprobar. Si un
 * 10 en la prueba que falta no le alcanza para aprobar debes imprimirle el
 * mensaje “Disculpa Emilia, deberás rendir la materia completa en Diciembre”.
 * 
 * Entrada
 * Un número entero N que indica la cantidad de examen ya realizados, seguido de
 * Ni notas que obtuvo en ellos.
 * 
 * Salida
 * Dos valores reales que indican promedio actual y nota requerida en el último
 * exámen para aprobar la materia. O el mensaje correspondiente cuando el
 * promedio no llega a ser 6. Los decimales se deben mostrar con dos cifras de
 * precisión.
 * 
 * Entrada:
 * 5
 * 5
 * 4
 * 3
 * 5
 * 7
 * Salida:
 * 4.80
 * Disculpa Emilia, deberas rendir la materia completa en Diciembre
 * 
 * Entrada:
 * 3
 * 7
 * 6
 * 5
 * Salida:
 * 6.00
 * 6.00
 * 
 * Entrada:
 * 4
 * 4
 * 5
 * 6
 * 7
 * 
 * Salida:
 * 5.50
 * 8.00
 * 
 */

package NotasEmilia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double sum = 0;
        for (int i = 0; i < N; i++) {
            double nota = scanner.nextDouble();
            sum += nota;
        }
        double promedioActual = sum / N;
        System.out.printf("%.2f\n", promedioActual);
        double notaRequerida = (6 * (N + 1)) - sum;
        if (notaRequerida <= 10) {
            System.out.printf("%.2f\n", notaRequerida);
        } else {
            System.out.println("Disculpa Emilia, deberas rendir la materia completa en Diciembre");
        }
        scanner.close();
    }
}