// Calculador de abastecimiento de por vida
package AbastecimientoVida;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Creación de un objeto Scanner para recibir la entrada del usuario.
        Scanner scanner = new Scanner(System.in);

        // Edad del usuario.
        System.out.print("Ingrese su edad actual: ");
        int edadActual = scanner.nextInt();

        // Expectativa de vida.
        System.out.print("Ingrese su expectativa de vida: ");
        int expectativaVidaPoblacion = scanner.nextInt();

        // Snack favorito.
        System.out.print("Ingrese su snack favorito: ");
        // Consumir la nueva línea pendiente después de nextInt
        scanner.nextLine();
        String snackFavorito = scanner.nextLine();

        // Estimación de la cantidad de snacks consumidos por día.
        System.out.print("¿Cuántos " + snackFavorito + "s consume por día? ");
        int snacksPorDia = scanner.nextInt();

        // Cálculo del total de snacks necesarios para el resto de la vida.
        int añosRestantes = expectativaVidaPoblacion - edadActual;
        int snacksTotales = añosRestantes * 365 * snacksPorDia;

        // Precio por unidad del snack.
        System.out.print("Ingrese el precio por unidad de " + snackFavorito + ": ");
        double precioPorSnack = scanner.nextDouble();
        double gastoTotal = snacksTotales * precioPorSnack;

        // Mostramos el resultado en consola con dos decimales.
        System.out.printf("Vas a necesitar %d %s(s) para que te alcancen hasta los %d años.%n",
                snacksTotales, snackFavorito, expectativaVidaPoblacion);
        System.out.printf("En total, gastarás aproximadamente $%.2f en %s(s).%n",
                gastoTotal, snackFavorito);

        // Cierre del scanner para liberar recursos.
        scanner.close();
    }
}
