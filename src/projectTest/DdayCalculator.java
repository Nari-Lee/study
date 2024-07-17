package projectTest;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DdayCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("목표 날짜를 입력하세요 (yyyy-MM-dd 형식): ");
    String targetDateStr = scanner.nextLine();

    LocalDate currentDate = LocalDate.now();
    LocalDate targetDate = LocalDate.parse(targetDateStr);

    long daysUntilTarget = ChronoUnit.DAYS.between(currentDate, targetDate);

    if (daysUntilTarget > 0) {
      System.out.println("D-" + daysUntilTarget);
    } else if (daysUntilTarget < 0) {
      System.out.println("목표일로부터 " + Math.abs(daysUntilTarget) + "일이 지났습니다.");
    } else {
      System.out.println("D-Day입니다!");
    }

    scanner.close();
  }
}
