package DetectandoOrden;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        if (A == B && B == C) {
            System.out.println("I");
        } else if (A <= B && B <= C) {
            System.out.println("C");
        } else if (A >= B && B >= C) {
            System.out.println("D");
        } else {
            System.out.println("X");
        }
        scanner.close();
    }
}