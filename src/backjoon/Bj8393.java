package backjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Bj8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        scanner.close();

        int sum = 0;
        for (int i = 1; i <= input; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
