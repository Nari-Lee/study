package backjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bj10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        int input1 = scanner.nextInt();

        for (int i = 0; i < input1; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }
        System.out.println(Collections.min(numbers) + " " + Collections.max(numbers));
    }
}
