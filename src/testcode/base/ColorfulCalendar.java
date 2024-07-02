package testcode.base;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ColorfulCalendar {
  private static final String ANSI_RESET = "\u001B[0m";
  private static final String ANSI_RED = "\u001B[31m";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // prompt Int 적용
    System.out.print("연도를 입력하세요: ");
    int year = scanner.nextInt(); // prompt Int 적용
    System.out.print("월을 입력하세요: ");
    int month = scanner.nextInt(); // prompt Int 적용

    Map<LocalDate, String> events = new HashMap<>();
    System.out.print("이벤트 날짜를 입력하세요 (yyyy-MM-dd): ");
    scanner.nextLine(); // 버퍼 비우기
    String eventDate = scanner.nextLine();
    events.put(LocalDate.parse(eventDate), "이벤트");

    printCalendar(year, month, events);
    scanner.close();
  }

  public static void printCalendar(int year, int month, Map<LocalDate, String> events) {
    YearMonth yearMonth = YearMonth.of(year, month);
    int daysInMonth = yearMonth.lengthOfMonth();
    int firstDayOfWeek = yearMonth.atDay(1).getDayOfWeek().getValue();

    System.out.println("  " + yearMonth.getMonth() + " " + year);
    System.out.println("Mo Tu We Th Fr Sa Su");

    // 첫 주 빈 공간 출력
    for (int i = 1; i < firstDayOfWeek; i++) {
      System.out.print("   ");
    }

    for (int day = 1; day <= daysInMonth; day++) {
      LocalDate date = LocalDate.of(year, month, day);
      if (events.containsKey(date)) {
        System.out.print(ANSI_RED);
      }
      System.out.printf("%2d", day);
      System.out.print(ANSI_RESET + " ");

      if ((firstDayOfWeek + day - 1) % 7 == 0 || day == daysInMonth) {
        System.out.println();
      }
    }
  }
}
