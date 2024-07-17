package projectTest;

import java.time.LocalDate;
import java.util.*;

class CalendarToDo {
  private static Map<LocalDate, List<String>> todoLists = new HashMap<>();
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    LocalDate currentDate = LocalDate.now();
    while (true) {
      currentDate = getDateToView();
      printCalendar(currentDate);
      System.out.println("\n1. 일정 추가");
      System.out.println("2. 일정 보기");
      System.out.println("3. 종료");
      System.out.print("선택: ");
      int choice = scanner.nextInt();
      scanner.nextLine(); // 버퍼 비우기

      switch (choice) {
        case 1:
          addTodo();
          break;
        case 2:
          viewTodo();
          break;
        case 3:
          System.out.println("프로그램을 종료합니다.");
          return;
        default:
          System.out.println("잘못된 선택입니다.");
      }
    }
  }

  private static LocalDate getDateToView() {
    System.out.print("조회할 년도를 입력하세요: ");
    int year = scanner.nextInt();
    System.out.print("조회할 월을 입력하세요 (1-12): ");
    int month = scanner.nextInt();
    scanner.nextLine(); // 버퍼 비우기
    return LocalDate.of(year, month, 1);
  }

  private static void printCalendar(LocalDate date) {
    System.out.println("\n" + date.getYear() + "년 " + date.getMonthValue() + "월");
    System.out.println("일 월 화 수 목 금 토");

    LocalDate firstOfMonth = date.withDayOfMonth(1);
    int dayOfWeek = firstOfMonth.getDayOfWeek().getValue() % 7;

    for (int i = 0; i < dayOfWeek; i++) {
      System.out.print("   ");
    }

    for (int i = 1; i <= date.lengthOfMonth(); i++) {
      LocalDate currentDate = date.withDayOfMonth(i);
      if (todoLists.containsKey(currentDate)) {
        System.out.print("\u001B[31m"); // 빨간색으로 변경
      }
      System.out.printf("%2d ", i);
      System.out.print("\u001B[0m"); // 색상 초기화

      if ((dayOfWeek + i) % 7 == 0) {
        System.out.println();
      }
    }
    System.out.println();
  }

  private static void addTodo() {
    System.out.print("날짜를 입력하세요 (yyyy-MM-dd): ");
    String dateStr = scanner.nextLine();
    LocalDate date = LocalDate.parse(dateStr);

    System.out.print("할 일을 입력하세요: ");
    String todo = scanner.nextLine();

    todoLists.computeIfAbsent(date, k -> new ArrayList<>()).add(todo);
    System.out.println("일정이 추가되었습니다.");
  }

  private static void viewTodo() {
    System.out.print("날짜를 입력하세요 (yyyy-MM-dd): ");
    String dateStr = scanner.nextLine();
    LocalDate date = LocalDate.parse(dateStr);

    List<String> todos = todoLists.get(date);
    if (todos != null && !todos.isEmpty()) {
      System.out.println(date + "의 할 일:");
      for (int i = 0; i < todos.size(); i++) {
        System.out.println((i + 1) + ". " + todos.get(i));
      }
    } else {
      System.out.println("해당 날짜에 일정이 없습니다.");
    }
  }
}
