package backjoon;

import java.util.Scanner;

public class Bj2577 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long no1 = scanner.nextLong();
    long no2 = scanner.nextLong();
    long no3 = scanner.nextLong();
    scanner.close();
    long number = no1 * no2 * no3;
    String a = String.valueOf(number);

    int[] counts = new int[10];

    for (int i = 0; i < a.length(); i++) {
      char ch = a.charAt(i);
      if (ch >= '0' && ch <= '9') {
        counts[ch - '0']++;
      }
    }

    for (int i = 0; i < counts.length; i++) {
      System.out.println(counts[i]);
    }
  }
}

