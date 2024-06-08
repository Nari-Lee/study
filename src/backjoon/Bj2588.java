package backjoon;

import java.util.Scanner;

public class Bj2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        scanner.close();

        String inputChar = Integer.toString(input2);
        char hundredChar = inputChar.charAt(0);
        char tenChar = inputChar.charAt(1);
        char oneChar = inputChar.charAt(2);

        int hundred = Character.getNumericValue(hundredChar);
        int ten = Character.getNumericValue(tenChar);
        int one = Character.getNumericValue(oneChar);

        System.out.println(input1 * one);
        System.out.println(input1 * ten);
        System.out.println(input1 * hundred);
        System.out.println(input1 * input2);
    }
}