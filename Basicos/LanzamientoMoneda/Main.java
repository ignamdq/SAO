package LanzamientoMoneda;
/*
 * Problema: Juego de Apuesta con Lanzamiento de Moneda
 * 
 * Descripción:
 * 
 * Este programa simula un juego de apuesta en el cual el jugador apuesta una cantidad de dinero inicial.
 * En cada tirada de una moneda:
 * - Si el resultado es "Cara", el jugador dobla su dinero.
 * - Si el resultado es "Cruz", el dinero se reduce a la mitad.
 * El juego termina cuando el dinero del jugador es igual o menor a $1 o se alcanzan 50 tiradas.
 */

// package monedaesqueleto;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        double dineroApuesta;
        int cantidadTiradas = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de dinero a apostar: ");
        dineroApuesta = scanner.nextDouble();

        while (dineroApuesta > 1 && cantidadTiradas <= 50) {

            String resultadoTirar = tirarMoneda();

            if (resultadoTirar.equals("Cara")) {
                dineroApuesta *= 2.0;
            } else {
                dineroApuesta /= 2.0;
            }

            System.out.println(
                    "Tirada: " + cantidadTiradas + " Resultado: " + resultadoTirar + " Balance: $ " + dineroApuesta);
            cantidadTiradas++;
        }

        scanner.close();
    }

    public static String tirarMoneda() {

        Random rnd = new Random();

        return rnd.nextBoolean() ? "Cara" : "Cruz";
    }
}