package testcode.base;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleCalendarWithTodo {
  private static final String ANSI_RESET = "\u001B[0m";
  private static final String ANSI_RED = "\u001B[31m";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("연도를 입력하세요: ");
    int year = scanner.nextInt();
    System.out.print("월을 입력하세요: ");
    int month = scanner.nextInt();

    Map<LocalDate, String> todos = new HashMap<>();
    System.out.print("할 일이 있는 날짜를 입력하세요 (yyyy-MM-dd): ");
    scanner.nextLine(); // 버퍼 비우기
    String todoDate = scanner.nextLine();
    System.out.print("할 일을 입력하세요: ");
    String todoContent = scanner.nextLine();
    todos.put(LocalDate.parse(todoDate), todoContent);

    printCalendar(year, month, todos);

    System.out.print("할 일을 확인할 날짜를 입력하세요 (yyyy-MM-dd): ");
    String checkDate = scanner.nextLine();
    LocalDate dateToCheck = LocalDate.parse(checkDate);
    if (todos.containsKey(dateToCheck)) {
      System.out.println(dateToCheck + "의 할 일: " + todos.get(dateToCheck));
    } else {
      System.out.println(dateToCheck + "에는 할 일이 없습니다.");
    }

    scanner.close();
  }

  public static void printCalendar(int year, int month, Map<LocalDate, String> todos) {
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
      if (todos.containsKey(date)) {
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

