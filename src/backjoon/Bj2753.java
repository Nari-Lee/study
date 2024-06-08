package backjoon;

import java.util.Scanner;

public class Bj2753 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input1 = scanner.nextInt();
        scanner.close();

        if (input1 % 4 == 0) {
            if (input1 % 400 == 0 || input1 % 100 != 0) {
                    System.out.println("1");
            } else {
                System.out.println("0");
            }
        } else {
            System.out.println("0");
        }
    }
}
