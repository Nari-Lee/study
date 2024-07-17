package testcode.lambda;

public class Exam0310 {
  static void testPlayer(Player player) {
    player.play();
  }

  public static void main(String[] args) {
    //일반 클래스
    class MyPlayer implements Player {
      public void play() {
        System.out.println("실행!");
      }
    }
    testPlayer(new MyPlayer());

    //로컬 클래스
    Player c2 = new Player() {
      @Override
      public void play() {
        System.out.println("실행!!");
      }
    };
    testPlayer(c2);

    //로컬 클래스 직접대입
    testPlayer(new Player() {
      public void play() {
        System.out.println("실행!!!");
      }
    });

    // 람다 + 중괄호
    Player c4 = () -> {
      System.out.println("실행!!!!");
    };
    testPlayer(c4);

    // 람다 + 괄호 생략 + 직접 대입
    testPlayer(() -> System.out.println("실행!!!!!"));

  }

  static interface Player {
    void play();
  }
}
