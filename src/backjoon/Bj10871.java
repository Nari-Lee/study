package backjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Bj10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();

        for (int i = 0; i <input1; i++) {
            int numbers = scanner.nextInt();
            list.add(numbers);
        }

        for (int number : list) {
            if (number < input2) {
                System.out.print(number + " ");
            }
        }
    }
}
