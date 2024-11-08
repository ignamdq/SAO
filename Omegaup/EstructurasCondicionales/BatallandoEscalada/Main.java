package BatallandoEscalada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a < b && b < c) {
            System.out.println("ascenso");
        } else if (a > b && b > c) {
            System.out.println("descenso");
        } else if (a < b && b > c) {
            System.out.println("pico");
        } else if (a > b && b < c) {
            System.out.println("abismo");
        } else {
            System.out.println("Entrada no válida");
        }
        scanner.close();
    }
}