/*
En un supermercado el cliente puede:

(*) Pagar al contado, opciones: "c" ó "C"
(*) Pagar con tarjeta de crédito, opciones "t" ó "T"

Al cliente se le hará un descuento de acuerdo a las siguientes condiciones:

(a) Si el cliente paga con tarjeta de crédito y el importe es mayor a $100, entonces se le hace un descuento del 2.5%
(b) Si el cliente paga con tarjeta de crédito y el importe es menor o igual a $100, entonces se le hace un descuento del 2%.
(c) Si el cliente paga al contado y el importe es mayor a $100, entonces se le hace un descuento del 5%.
(d) Si el cliente paga al contado y el importe es menor o igual a $100. entonces se le hace un descuento del 3%.

Escribir el programa en Java correspondiente a fin de identificar, en base al monto a pagar y el método de pago del cliente:

(1) el porcentaje de descuento que le corresponde
(2) el monto de dicho descuento
(2) el importe final con el descuento aplicado.

Ejemplo: Si el cliente paga con tarjeta de crédito y el importe es $78.50,
entoncesel descuento será del 2%, es decir $1.57 y el monto a abonar será de $76.93.
*/

package SupermercadoDescuento;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        // Scanner para leer decimales en formato de punto (.)
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Monto compra
        System.out.print("Ingrese el importe total de la compra: ");
        double importe = scanner.nextDouble();

        // Método de pago
        System.out.print("Seleccione el método de pago (C para contado, T para tarjeta): ");
        char metodoPago = scanner.next().charAt(0);

        // Porcentaje de descuento
        double porcentajeDescuento;

        // Estructura condicional porcentaje de descuento

        // (a) Tarjeta de crédito y monto mayor a $100
        if ((metodoPago == 't' || metodoPago == 'T') && importe > 100) {
            porcentajeDescuento = 2.5;
        }
        // (b) Tarjeta de crédito y monto menor o igual a $100
        else if ((metodoPago == 't' || metodoPago == 'T') && importe <= 100) {
            porcentajeDescuento = 2.0;
        }
        // (c) Contado y monto mayor a $100
        else if ((metodoPago == 'c' || metodoPago == 'C') && importe > 100) {
            porcentajeDescuento = 5.0;
        }
        // (d) Contado y monto menor o igual a $100
        else if ((metodoPago == 'c' || metodoPago == 'C') && importe <= 100) {
            porcentajeDescuento = 3.0;
        }
        // Si el método de pago es inválido
        else {
            System.out.println("Método de pago inválido. Por favor ingrese 'C' para contado o 'T' para tarjeta.");

            // Sirve para detener la ejecución de ese método sin devolver ningún valor
            return;
        }

        // Calcular el monto del descuento y el importe final
        double montoDescuento = (importe * porcentajeDescuento) / 100;
        double importeFinal = importe - montoDescuento;

        // Mostrar el porcentaje de descuento, el monto del descuento y el importe final
        System.out.printf("Descuento aplicado: %.1f%%\n", porcentajeDescuento);
        System.out.printf("Monto del descuento: $%.2f\n", montoDescuento);
        System.out.printf("Importe final a pagar: $%.2f\n", importeFinal);

        // Cerrar el scanner
        scanner.close();
    }
}
