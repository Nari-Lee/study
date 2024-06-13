package backjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Bj2438 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stars = new ArrayList<>();

        int input = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= input; i++) {
            String star = "";
            for (int j = 0; j < i; j++) {
                star += "*";
            };
            stars.add(star);
        }
      for (String star : stars) {
          System.out.println(star);
      }
    }
}
