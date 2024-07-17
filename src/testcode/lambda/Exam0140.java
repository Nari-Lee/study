package testcode.lambda;

public class Exam0140 {

  public static void main(String[] args) {
    // 람다1
    Player p1 = (String name, int age) -> {
      System.out.printf("%s(%d)님 환영합니다.\n", name, age);
    };
    p1.play("홍길동", 20);

    // 람다2 + 중괄호 삭제
    Player p2 = (String name, int age) -> System.out.printf("%s(%d)님 환영합니다.\n", name, age);
    p2.play("홍길동", 20);

    //람다3 + 파라미터 괄호 삭제
    Player p3 = (name, age) -> System.out.printf("%s(%d)님 환영합니다.\n", name, age);
    p3.play("홍길동", 20);
  }


  interface Player {
    void play(String name, int age);
  }
}
