package testcode.oop.ex02;

import testcode.oop.ex02.vo.Score;

public class Test01 {
  public static void main(String[] args) {

    Score s1 = new Score("홍길동", 100, 90, 85);
    Score s2 = new Score("임꺽정", 90, 80, 75);
    Score s3 = new Score("유관순", 80, 70, 65);

    s1.compute();
    printScore(s1);
    s2.compute();
    printScore(s2);
    s3.compute();
    printScore(s3);
  }

  static void printScore(Score s) {
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s.getName(), s.getKor(), s.getEng(),
        s.getMath(), s.getSum(), s.getAver());
  }
}
