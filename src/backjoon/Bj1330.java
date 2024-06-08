package backjoon;

import java.util.Scanner;

public class Bj1330 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        scanner.close();

        if (input1 > input2)
        {
            System.out.println(">");
        } else if (input1 < input2)
        {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}