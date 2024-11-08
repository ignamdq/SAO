package TomaDecisiones;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if (A + B == 5) {
            B += 3;
            System.out.println(2 * A + B);
        } else {
            A -= 1;
            if ((7 * A + B) % 2 == 0) {
                System.out.println(A - B);
            } else {
                System.out.println(A * B);
            }
        }
        scanner.close();
    }
}