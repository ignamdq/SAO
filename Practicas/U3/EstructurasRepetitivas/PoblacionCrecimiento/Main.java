
/*
 Escribir un programa que permita ingresar:
 el valor de la población actual de un país (PobAct),
 la tasa de crecimiento anual (Tasa) y
 un valor de población esperada, al que desea llegar (PobEsp).
 
 
 Suponiendo que la tasa de crecimiento sea constante, determinar y mostrar en pantalla el año en el cual la población supere la población esperada.

 Ejemplo:
 
 Entrada
 PobAct: 450000 h Tasa: 60000 h/a PobEsp: 1200000 h
 
 Salida
 En 13 años se alcanzará la población esperada.
 
 */
package PoblacionCrecimiento;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int pobAct, tasa, pobEsp;
        int años = 0;

        System.out.print("Ingrese la población actual del país (PobAct): ");
        pobAct = scanner.nextInt();

        System.out.print("Ingrese la tasa de crecimiento anual (Tasa): ");
        tasa = scanner.nextInt();

        System.out.print("Ingrese la población esperada (PobEsp): ");
        pobEsp = scanner.nextInt();

        // Validar si la población actual es mayor o igual a la población esperada
        if (pobAct >= pobEsp) {
            System.out.println("La población actual ya es igual o superior a la población esperada.");
        }
        // Calcular el número de años necesarios para alcanzar o superar la población
        // esperada
        else {

            while (pobAct < pobEsp) {
                pobAct += tasa; // Incrementar la población actual según la tasa de crecimiento anual
                años++; // Contabilizar el año transcurrido
            }

            // Resultado
            System.out.println("En " + años + " años se alcanzará la población esperada.");
        }
        scanner.close();
    }
}
