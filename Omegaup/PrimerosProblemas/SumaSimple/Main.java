package SumaSimple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();
        System.out.println(numero + 1);
        entrada.close();
    }
}
