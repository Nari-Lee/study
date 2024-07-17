package testcode.lambda;

public class Exam0110 {

  public static void main(String[] args) {

    //익명 클래스로 구현
    Player p1 = new Player() {
      @Override
      public void play() {
        System.out.println("익명 클래스");
      }
    };
    p1.play();

    //람다 구현 + 중괄호
    Player p2 = () -> {
      System.out.println("람다");
    };
    p2.play();

    //람다 구현
    Player p3 = () -> System.out.println("람다");
    p3.play();

  }

  interface Player {
    void play();
  }
}
