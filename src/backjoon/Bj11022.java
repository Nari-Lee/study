package backjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Bj11022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sums = new ArrayList<>();
        ArrayList<Integer> inputs1 = new ArrayList<>();
        ArrayList<Integer> inputs2 = new ArrayList<>();
        int input1 = scanner.nextInt();

        for (int i = 0; i < input1; i++) {
            int input2 = scanner.nextInt();
            int input3 = scanner.nextInt();
            inputs1.add(input2);
            inputs2.add(input3);
            sums.add(input2 + input3);
        }

        for (int sum = 0; sum < sums.size(); sum++) {
            System.out.println("Case #" + (sum + 1) + ": " + inputs1.get(sum) + " + " + inputs2.get(sum) + " = " + sums.get(sum));
        }
    }
}
