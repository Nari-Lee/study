package backjoon;

import java.util.Scanner;

public class Bj11022_StringBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        StringBuilder output = new StringBuilder();

        for (int i = 1; i <= input1; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int sum = a + b;
            output.append("Case #").append(i).append(": ").append(a).append(" + ").append(b).append(" = ").append(sum).append("\n");
        }

        System.out.print(output.toString());
    }
}
