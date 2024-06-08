package backjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Bj10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> results = new ArrayList<>();

        int input1 = scanner.nextInt();

        int i;

        for (i = 0; i < input1; i++) {
            int input2 = scanner.nextInt();
            int input3 = scanner.nextInt();
            results.add(input2 + input3);
        }
        scanner.close();

        for (int result : results) {
            System.out.println(result);
        }
    }
}
