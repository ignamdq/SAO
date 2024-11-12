/*

Resuelto en clase

Escribir la función todos_iguales(lista) que indique si todos los elementos de una lista de N elementos son iguales.

Ejemplo:
todos_iguales([6, 6, 6]) → True
todos_iguales([6, 6, 1]) → False
todos_iguales([0, 90, 1]) → False

*/

package TodosIguales;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final int N = 3;

        // Declaración de la lista como vector
        int[] lista = new int[N];

        // Cargar los elementos de una lista
        cargar_lista(lista);

        // Verificar si los elementos son todos iguales
        boolean iguales = todos_iguales(lista);

        if (iguales)
            System.out.println("Los elementos de la lista son todos iguales");
        else
            System.out.println("Los elementos de la lista NO son todos iguales");

    }

    public static void cargar_lista(int[] l) {
        System.out.println("Entró a cargar_lista");
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < l.length; i++) {
            System.out.println("Ingrese el valor de la posición " + i);
            l[i] = entrada.nextInt();
        }

        entrada.close();

    }

    public static boolean todos_iguales(int[] l) { // 6 6 6
        boolean iguales = true; // 6 1 6
        int i = 1, testigo = l[0];
        System.out.println("Entró a todos_iguales");
        // Cuerpo del método
        while (i < l.length && iguales == true) {
            if (l[i] == testigo)
                i++;
            else
                iguales = false;
        }

        return iguales;

    }

}