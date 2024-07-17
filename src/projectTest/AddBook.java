package projectTest;

import java.util.ArrayList;
import java.util.Scanner;

class BookTest {
  String title;
  String writer;

  public BookTest(String title, String writer) {
    this.title = title;
    this.writer = writer;
  }

  @Override
  public String toString() {
    return "책 제목: " + title + ", 작가명: " + writer;
  }
}


public class AddBook {
  public static void main(String[] args) {
    ArrayList<BookTest> bookList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("책 이름?");
      String bookTitle = scanner.nextLine();
      System.out.println("작가명?");
      String writer = scanner.nextLine();

      bookList.add(new BookTest(bookTitle, writer));

      while (true) {
        System.out.println("더 등록하시겠습니까?(y/n)");
        String answer = scanner.nextLine();
        if (answer.equals("n")) {
          System.out.println("책이 등록되었습니다.");
          printBookList(bookList);
          return;
        } else if (answer.equals("y")) {
          break;
        } else {
          System.out.println("올바른 형식이 아닙니다.");
          continue;
        }
      }
    }
  }

  public static void printBookList(ArrayList<BookTest> bookList) {
    for (BookTest book : bookList) {
      System.out.println(book);
    }
  }
}
