// Un estudiante pasa de nivel si:
// (a) Su nota en las dos evaluaciones parciales es mayor a 7 ó
// (b) si su nota en el examen final es mayor o igual a 4.

package NotaEstudiante;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner localización US
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Ingrese la nota de la primera evaluación parcial: ");
        double notaParcial1 = scanner.nextDouble();

        System.out.print("Ingrese la nota de la segunda evaluación parcial: ");
        double notaParcial2 = scanner.nextDouble();

        double promedio = (notaParcial1 + notaParcial2) / 2.0;

        if (promedio >= 7) {
            System.out.println(
                    "El estudiante pasa de nivel directamente, ya que el promedio de las dos evaluaciones parciales es "
                            + String.format("%.2f", promedio) + " (mayor o igual a 7).");
        } else {
            System.out.print("Ingrese la nota del examen final: ");
            double notaFinal = scanner.nextDouble();

            if (notaFinal >= 4) {
                System.out.println("El estudiante pasa de nivel por aprobar el examen final.");
            } else {
                System.out.println("El estudiante no pasa de nivel.");
            }
        }

        scanner.close();
    }
}
