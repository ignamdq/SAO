package IntercambiosMinimos;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int[] numeros = { A, B, C };
        int[] ordenados = numeros.clone();
        Arrays.sort(ordenados);
        int correctos = 0;
        for (int i = 0; i < 3; i++) {
            if (numeros[i] == ordenados[i]) {
                correctos++;
            }
        }
        int intercambios;
        switch (correctos) {
            case 3:
                intercambios = 0;
                break;
            case 1:
                intercambios = 1;
                break;
            default:
                intercambios = 2;
                break;
        }
        System.out.println(intercambios);
        scanner.close();
    }
}