package backjoon;

import java.util.Scanner;

public class Bj1152 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine().trim();

    if (input.isEmpty()) {
      System.out.println(0);
    } else {
      String[] words = input.split("\\s+");
      int word = words.length;
      System.out.println(word);
    }
  }
}
