package projectTest;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DayCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("원하는 년을 입력해주세요(YYYY-MM-DD");
    String input = scanner.nextLine();
    LocalDate endDate = LocalDate.parse(input);
    LocalDate today = LocalDate.now();
    long daysBetween = ChronoUnit.DAYS.between(today, endDate);
    System.out.println(daysBetween);
  }
}
