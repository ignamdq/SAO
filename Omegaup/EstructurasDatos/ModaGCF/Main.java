/*
 * 
 * La moda en estadística es el valor que tiene mayor frecuencia absoluta en un
 * conjunto de datos.
 * Para calcular la moda deberás leer el número total de datos seguido por los
 * datos de la lista.
 * Se asume que siempre tendrá una única moda.
 * 
 * Entrada
 * Un número entero n seguido de la lista de elementos l.
 * l será una lista de números enteros menores a 1000 separados por espacio.
 * 0 < n < 1000
 * 
 * Salida
 * La moda de l
 * 
 * Ejemplo
 * Entrada:
 * 6
 * 2 1 4 2 2 1
 * Salida:
 * 2
 * 
 * 
 */

package ModaGCF;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número de elementos
        int n = scanner.nextInt();

        // Crear un HashMap para contar las frecuencias
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Leer los datos y contar las frecuencias
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Encontrar el número con la frecuencia más alta (la moda)
        int moda = -1;
        int maxFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int key = entry.getKey();
            int frequency = entry.getValue();

            // Si la frecuencia de este número es mayor que la máxima actual, actualizar la
            // moda
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                moda = key;
            }
        }

        // Imprimir la moda
        System.out.println(moda);

        scanner.close();
    }
}