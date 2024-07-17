package projectTest;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarPrinter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("몇 년?");
    int input1 = scanner.nextInt();

    System.out.println("몇 월?");
    int input2 = scanner.nextInt();

    int year = input1; // 원하는 연도
    int month = input2;   // 원하는 월 (1 - 12)

    printMonthCalendar(year, month);
  }

  public static void printMonthCalendar(int year, int month) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(year, month - 1, 1); // Calendar 클래스의 월은 0부터 시작
    int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

    System.out.println("   " + getMonthName(month) + " " + year);
    System.out.println(" 일 월 화 수 목 금 토");

    // 첫 번째 주의 빈 공간을 출력
    for (int i = Calendar.SUNDAY; i < firstDayOfWeek; i++) {
      System.out.print("   ");
    }

    // 날짜를 출력
    for (int day = 1; day <= daysInMonth; day++) {
      System.out.printf("%2d ", day);
      if ((day + firstDayOfWeek - 1) % 7 == 0) {
        System.out.println();
      }
    }
    System.out.println();
  }

  public static String getMonthName(int month) {
    String[] months =
        {"January", "February", "March", "April", "May", "June", "July", "August", "September",
            "October", "November", "December"};
    return months[month - 1];
  }
}
