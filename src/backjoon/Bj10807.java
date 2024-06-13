package backjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Bj10807 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        int input1 = scanner.nextInt();

        for (int i = 0; i < input1; i++) {
            int input2 = scanner.nextInt();
            numbers.add(input2);
        }

        int input3 = scanner.nextInt();
        int same = 0;
        for (int number : numbers) {
            if (number == input3) {
                same++;
            }
        }
        System.out.println(same);
        scanner.close();
    }
}
