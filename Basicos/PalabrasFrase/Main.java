package PalabrasFrase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        String[] palabras = frase.trim().split("\\s+");
        System.out.println("Número de palabras: " + palabras.length);

        scanner.close();
    }
}