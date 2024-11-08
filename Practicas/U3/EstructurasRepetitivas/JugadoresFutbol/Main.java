/*
Escribir un programa que lea por teclado un conjunto de ternas con datos de un grupo de jugadores de fútbol:
edad, posición (D: Defensor, M: Medio, A: Atacante), y goles anotados durante el último año.

La secuencia de ternas finaliza cuando se ingresa la terna (0, 0, 0) la cual no se procesa.

Se debe informar:
Porcentaje de jugadores mayores de 25 años.
Cantidad de jugadores defensores que convirtieron más de 3 goles.
Cantidad de goles convertidos por el goleador del grupo.
Cantidad de atacantes que no convirtieron goles.
Cantidad total de goles de los jugadores en los siguientes grupos etarios: 16-22, 23-29, 30-36.

Ejemplo:
Se ingresan las ternas:
27 D 2
22 M 4
30 A 8
25 A 12
23 D 0
27 D 4
18 D 0
33 M 1
0 0 0

Se informa:
Porc. de jugadores mayores de 25 años: 4
Cant. de defensores con más de 3 goles: 1
Cant. de goles del goleador del grupo: 12
Cant. de atacantes sin goles hechos: 0
Cant. de goles según grupos etarios:

16-22 años: 0
23-29 años: 18
30-36 años: 4

*/
package EstructurasRepetitivas.JugadoresFutbol;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Variables para almacenar los datos
        int edad, goles;
        char posicion;

        // Contadores y acumuladores para las estadísticas
        int totalJugadores = 0;
        int jugadoresMayores25 = 0;
        int defensoresMasDe3Goles = 0;
        int golesGoleador = 0;
        int atacantesSinGoles = 0;
        int golesGrupo16a22 = 0, golesGrupo23a29 = 0, golesGrupo30a36 = 0;

        // Ciclo para leer las ternas de jugadores
        while (true) {

            // Solicitar la entrada de la terna
            System.out.print("Ingrese edad, posición (D, M, A) y goles anotados: ");
            edad = scanner.nextInt(); // Leer edad
            posicion = scanner.next().charAt(0); // Leer posición (D, M, A)
            goles = scanner.nextInt(); // Leer goles

            // Salida del ciclo cuando se ingresa la terna (0, '0', 0)
            if (edad == 0 && posicion == '0' && goles == 0) {
                break; // Salir del ciclo si se ingresa la terna de fin
            }

            // Actualizar contadores y acumuladores
            totalJugadores++;

            // Contar jugadores mayores de 25 años
            if (edad > 25) {
                jugadoresMayores25++;
            }

            // Contar defensores que convirtieron más de 3 goles
            if (posicion == 'D' && goles > 3) {
                defensoresMasDe3Goles++;
            }

            // Contabilizar goles del goleador del grupo
            if (goles > golesGoleador) {
                golesGoleador = goles;
            }

            // Contar atacantes sin goles
            if (posicion == 'A' && goles == 0) {
                atacantesSinGoles++;
            }

            // Acumular goles por grupo etario
            if (edad >= 16 && edad <= 22) {
                golesGrupo16a22 += goles;
            } else if (edad >= 23 && edad <= 29) {
                golesGrupo23a29 += goles;
            } else if (edad >= 30 && edad <= 36) {
                golesGrupo30a36 += goles;
            }
        }

        // Cálculos finales y resultados
        if (totalJugadores > 0) {

            // Porcentaje de jugadores mayores de 25 años
            double porcentajeMayores25 = (double) jugadoresMayores25 / totalJugadores * 100;
            System.out.printf("Porc. de jugadores mayores de 25 años: %.2f\n", porcentajeMayores25);

            // Cantidad de defensores con más de 3 goles
            System.out.println("Cant. de defensores con más de 3 goles: " + defensoresMasDe3Goles);

            // Goles del goleador del grupo
            System.out.println("Cant. de goles del goleador del grupo: " + golesGoleador);

            // Cantidad de atacantes sin goles
            System.out.println("Cant. de atacantes sin goles hechos: " + atacantesSinGoles);

            // Cantidad de goles por grupos etarios
            System.out.println("Cant. de goles según grupos etarios:");
            System.out.println("16-22 años: " + golesGrupo16a22);
            System.out.println("23-29 años: " + golesGrupo23a29);
            System.out.println("30-36 años: " + golesGrupo30a36);
        } else {
            System.out.println("No se ingresaron jugadores.");
        }

        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}
