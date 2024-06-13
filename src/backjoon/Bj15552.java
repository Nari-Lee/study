package backjoon;

import java.util.Scanner;
import java.util.ArrayList;

public class Bj15552 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sums = new ArrayList<>();

        int input1 = scanner.nextInt();

        for (int i = 0; i < input1; i++) {
            int input2 = scanner.nextInt();
            int input3 = scanner.nextInt();
            sums.add(input2 + input3);
        }
        scanner.close();
        for (int sum : sums) {
            System.out.println(sum);
        }
    }
}
