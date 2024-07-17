package projectTest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DateHighlightExample {

  // ANSI escape codes for text color
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_RED = "\u001B[31m";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<LocalDate> dateList = new ArrayList<>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    // 날짜 입력 받기
    System.out.println("날짜를 YYYY-MM-DD 형식으로 입력하세요. 종료하려면 'exit'를 입력하세요:");
    while (true) {
      String input = scanner.nextLine();
      if (input.equalsIgnoreCase("exit")) {
        break;
      }
      try {
        LocalDate date = LocalDate.parse(input, formatter);
        dateList.add(date);
      } catch (Exception e) {
        System.out.println("잘못된 날짜 형식입니다. 다시 입력하세요.");
      }
    }

    // 현재 날짜
    LocalDate today = LocalDate.now();

    // 일주일 내에 포함되는 날짜 색 변경
    for (LocalDate date : dateList) {
      if (ChronoUnit.DAYS.between(today, date) <= 7 && ChronoUnit.DAYS.between(today, date) >= 0) {
        // 강조하여 출력
        System.out.println(ANSI_RED + date + ANSI_RESET);
      } else {
        // 일반 출력
        System.out.println(date);
      }
    }
  }
}
