package projectTest;

import java.time.LocalDate;

class Book {
  private LocalDate date;

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }
}


public class BorrowBook {
  public static void main(String[] args) {
    Book book = new Book();
    LocalDate now = LocalDate.now();
    book.setDate(now.plusDays(15));

    System.out.println(now);
    System.out.println(now.plusDays(15));
    System.out.printf("%d년 %d월 %d일이 반납일 입니다.", book.getDate().getYear(),
        book.getDate().getMonth().getValue(), book.getDate().getDayOfMonth());
    System.out.println();
    System.out.printf("%d년 %d월 %d일이 반납일 입니다.", book.getDate().getYear(),
        book.getDate().getMonthValue(), book.getDate().getDayOfMonth());

  }
}
