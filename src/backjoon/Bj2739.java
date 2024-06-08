package backjoon;

import java.util.Scanner;

public class Bj2739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i;
        int input = scanner.nextInt();
        scanner.close();

        for (i = 1; i < 10; i++) {
            System.out.println(input + " * " + i + " = " + input * i);
        }
    }
}