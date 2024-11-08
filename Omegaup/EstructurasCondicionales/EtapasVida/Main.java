package EtapasVida;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        if (L >= 0 && L <= 3) {
            System.out.println("BEBE");
        } else if (L >= 4 && L <= 14) {
            System.out.println("NINO");
        } else if (L >= 15 && L <= 18) {
            System.out.println("JOVEN");
        } else if (L >= 19 && L <= 65) {
            System.out.println("ADULTO");
        } else if (L >= 66) {
            System.out.println("ADULTO 3RA");
        }
        scanner.close();
    }
}