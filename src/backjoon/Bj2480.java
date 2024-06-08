package backjoon;

import java.util.Scanner;

public class Bj2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int input3 = scanner.nextInt();
        scanner.close();

        if (input1 == input2 && input2 == input3) {
            System.out.println(10000 + input1 * 1000);
        } else if (input1 == input2 || input1 == input3) {
            System.out.println(1000 + input1 * 100);
        } else if (input2 == input3) {
            System.out.println(1000 + input3 * 100);
        } else {
            int max = input1;

            if (input2 > max) {
                max = input2;
            }
            if (input3 > max) {
                max = input3;
            }
            System.out.println(max * 100);
            /*int max = Math.max(input1, Math.max(input2, input3));
            System.out.println(max * 100);
            */
        }
    }
}
