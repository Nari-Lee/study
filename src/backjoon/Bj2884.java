package backjoon;

import java.util.Scanner;

public class Bj2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        scanner.close();

        if (minute < 45 && hour != 0) {
            System.out.println((hour - 1) + " " + (60 + minute - 45));
        } else if (minute < 45 && hour == 0) {
            System.out.println(23 + " " + (60 + minute - 45));
        } else {
            System.out.println(hour + " " + (minute - 45));
        }
    }
}