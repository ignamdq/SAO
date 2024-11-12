/*
Escribe un programa que lea un entero positivo y regrese la suma de sus dígitos.

Por ejemplo: si el entero es 123, el programa deberá producir 6, ya que 1 + 2 + 3 = 6

Nota: Si tu programa usa una función recursiva, vale 50 puntos, si no usa una función recursiva vale 30 puntos.

Entrada: Una línea con un entero n > 0

Ejemplo

(*) Entrada: 123456789

(*) Salida: 45

Ver en Basicos "FuncionesRecursivas"

*/

package SumaDigitos;

import java.util.Scanner;

public class Main {
    public static int sumaRecursiva(int n) {

        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumaRecursiva(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 0) {
            int suma = sumaRecursiva(n);
            System.out.println(suma);
        }
        scanner.close();
    }
}
