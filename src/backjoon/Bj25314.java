package backjoon;

import java.util.Scanner;

public class Bj25314 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        while (input != 0) {
            input -= 4;
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
