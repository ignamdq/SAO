/*
Un postulante a un empleo realiza un test de capacitación.

Se obtuvo la siguiente información:
- cantidad total de preguntas que se realizaron y
- cantidad de preguntas que contestó correctamente

Se pide desarrollar un programa que ingrese los datos por teclado e informe el nivel
del mismo según el porcentaje de respuestas correctas:

- Nivel máximo: Porcentaje >= 90%
- Nivel medio: Porcentaje >= 75% y < 90%
- Nivel regular: Porcentaje >= 50% y < 75%
- Fuera de nivel: Porcentaje < 50%
*/
package EstructurasCondicionales.EvaluacionPostulante;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Ingrese la cantidad total de preguntas: ");
        int totalPreguntas = scanner.nextInt();

        System.out.print("Ingrese la cantidad de preguntas contestadas correctamente: ");
        int preguntasCorrectas = scanner.nextInt();

        // Porcentaje
        double porcentaje = ((double) preguntasCorrectas / totalPreguntas) * 100;

        // Condiciones para determinar el nivel según el porcentaje
        String nivel;
        if (porcentaje >= 90) {
            nivel = "Nivel Máximo";
        } else if (porcentaje >= 75) {
            nivel = "Nivel Medio";
        } else if (porcentaje >= 50) {
            nivel = "Nivel Regular";
        } else {
            nivel = "Fuera de Nivel";
        }

        // Resultado
        System.out.println("El postulante tiene un " + porcentaje
                + "% de respuestas correctas, por lo tanto, su nivel es: " + nivel);

        scanner.close();
    }
}
