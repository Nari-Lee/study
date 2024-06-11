package backjoon;

import  java.util.ArrayList;
import java.util.Scanner;

public class Bj25304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> results = new ArrayList<>();

        int sum = scanner.nextInt(); // 총 금액
        int goods = scanner.nextInt(); // 물건의 종류의 수
        int sum2 = 0;

        for (int i = 0; i < goods; i++) {
            int count1 = scanner.nextInt();
            int count2 = scanner.nextInt();
            results.add(count1 * count2);
        }
        for (int result : results) {
            sum2 += result;
        }
        if (sum == sum2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}