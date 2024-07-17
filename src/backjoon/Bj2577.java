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

    int[] counts = new int[10]; // 0부터 9까지 담을 배열 준비

    for (int i = 0; i < a.length(); i++) {
      char ch = a.charAt(i);
      if (ch >= '0' && ch <= '9') {
        counts[ch - '0']++; // 유니코드를 이용하여 문자로 바꾼 숫자의 배열 위치 지정 '0'의 유니코드값은 48
      }
    }

    for (int i = 0; i < counts.length; i++) {
      System.out.println(counts[i]);
    }
  }
}

