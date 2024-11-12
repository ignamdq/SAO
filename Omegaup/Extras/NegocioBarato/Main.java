/*
Emilia, se fue a vivir sola y ahora tiene que hacer los mandados ella sola (Antes los hacía siempre su mamá). No sabe bien dónde le conviene comprar cada producto, por ejemplo, las frutas y verduras, las puede comprar en el super, en el almacén, en el mercado del barrio, en la verdulería, algunas en la carnicería, en la dietética...

Te pide que le armes un sistema donde ella coloque "N” cantidad de negocios de los cuales relevó el precio de un producto y luego ingrese los precios del “Ni” negocio. Debes decirle en qué negocio le resulta más barato comprar el producto y el precio del mismo.

Entrada
Un valor entero N que indica la cantidad de negocios en los que Emilia recolectó el precio. Seguido de Ni precios recolectados

Salida
El número del negocio que posee el precio más barato, seguido de dicho precio. Las salidas con decimales deben mostrarse con dos cifras de precisión.

Entrada:
5
450
480
500
430
420
Salida:
5
420.00

Entrada:
3
230.50
229.80
230.90
Salida:
2
229.80

*/

package NegocioBarato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double minPrice = Double.MAX_VALUE;
        int minIndex = -1;
        for (int i = 1; i <= N; i++) {
            double price = scanner.nextDouble();

            if (price < minPrice) {
                minPrice = price;
                minIndex = i;
            }
        }
        System.out.println(minIndex);
        System.out.printf("%.2f\n", minPrice);
        scanner.close();
    }
}
