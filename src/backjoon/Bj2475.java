package backjoon;

import java.util.Scanner;

public class Bj2475 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long no1 = scanner.nextLong();
    long no2 = scanner.nextLong();
    long no3 = scanner.nextLong();
    long no4 = scanner.nextLong();
    long no5 = scanner.nextLong();

    long result = (no1 * no1 + no2 * no2 + no3 * no3 + no4 * no4 + no5 * no5) % 10;

    System.out.println(result);
  }
}
