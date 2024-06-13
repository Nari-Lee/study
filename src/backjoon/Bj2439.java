package backjoon;

import java.util.Scanner;

public class Bj2439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        for (int i = 1; i <= input; i++) {
            for (int j = input - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}