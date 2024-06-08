package backjoon;

import java.util.Scanner;

public class Bj2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        scanner.nextLine();

        int cook = scanner.nextInt();
        scanner.close();

        int resultHour = (minute + cook) / 60;
        int result2Minuit = (minute + cook) % 60;

        if (minute + cook >= 60) {
            if (hour + resultHour >= 24) {
                System.out.println((hour + resultHour - 24) + " " + result2Minuit);
            } else {
                System.out.println((hour + resultHour) + " " + result2Minuit);
            }
        } else {
            System.out.println(hour + " " + result2Minuit);
        }
    }
}
