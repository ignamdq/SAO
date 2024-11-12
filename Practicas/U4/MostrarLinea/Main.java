/*
Escribir un método llamado linea() que reciba 2 parámetros: uno de tipo entero y otro de tipo char.
La función debe mostrar una línea con tantos caracteres repetidos como indique el parámetro entero.

Ejemplo de llamada:
linea(7,’-’); debe mostrar: -------
linea(10,’#’); debe mostrar : ##########

*/
package MostrarLinea;

public class Main {

    public static void main(String[] args) {

        linea(5, '-');
        linea(5, '#');
    }

    // Método que recibe un número entero y un carácter, y muestra una línea del
    // carácter repetido
    public static void linea(int cantidad, char caracter) {
        for (int i = 0; i < cantidad; i++) {
            System.out.print(caracter);
        }
        System.out.println();
    }
}
