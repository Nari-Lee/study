package backjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bj2562 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();

    for (int i = 0; i < 9; i++) {
      int input = scanner.nextInt();
      numbers.add(input);
    }
    int max = Collections.max(numbers);
    System.out.println(max);
    System.out.println(numbers.indexOf(max) + 1);
  }
}
