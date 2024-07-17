package projectTest;

public class TodoListTitle {
  public static void main(String[] args) {
    printTitle();
  }

  private static void printTitle() {
    String[] title =
        {" _____       _     _ _     _     _     _", "|_   _|     | |   | (_)   | |   | |   (_)",
            "  | |  _ __ | |__ | |_ ___| |__ | |__  _ _ __",
            "  | | | '_ \\| '_ \\| | / __| '_ \\| '_ \\| | '_ \\",
            " _| |_| | | | |_) | | \\__ \\ | | | | | | | |_) |",
            "|_____|_| |_|_.__/|_|_|___/_| |_|_| |_|_| .__/",
            "                                        | |",
            "                                        |_|", "",
            "*********************************************",
            "*                                           *",
            "*           WELCOME TO YOUR                 *",
            "*             TODO LIST                     *",
            "*                                           *",
            "*********************************************"};

    for (String line : title) {
      System.out.println(line);
      try {
        Thread.sleep(200);  // 0.2초 간격으로 출력
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
  }
}
