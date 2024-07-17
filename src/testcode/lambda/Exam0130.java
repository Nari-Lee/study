package testcode.lambda;

public class Exam0130 {

  public static void main(String[] args) {
    Player p1 = (String name) -> System.out.println(name + "님 환영합니다.");
    p1.play("홍길동");

    Player p2 = (name) -> System.out.println(name + "님 환영합니다.");
    p2.play("홍길동");

    Player p3 = name -> System.out.println(name + "님 환영합니다.");
    p3.play("홍길동");
  }

  interface Player {
    void play(String name);
  }
}
