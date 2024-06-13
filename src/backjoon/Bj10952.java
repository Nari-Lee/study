package backjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Bj10952 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sums = new ArrayList<>();

        while (true) {
            int input1 = scanner.nextInt();
            int input2 = scanner.nextInt();

            if (input1 != 0 && input2 != 0) {
                sums.add(input1 + input2);
            } else {
;               break;
            }
        }
        for (int sum : sums) {
            System.out.println(sum);
        }
    }
}
