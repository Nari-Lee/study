package backjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Bj11021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        ArrayList<Integer> sums = new ArrayList<>();

        for (int i = 0; i < input1; i++) {
            int input2 = scanner.nextInt();
            int input3 = scanner.nextInt();
            sums.add(input2 + input3);
        }

        for (int j = 0; j < sums.size(); j++) {
            System.out.println("Case #" + (j + 1) + ": " + sums.get(j));
        }
    }
}
