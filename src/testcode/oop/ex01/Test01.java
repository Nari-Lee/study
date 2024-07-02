package testcode.oop.ex01;

public class Test01 {

  public static void main(String[] args) {

    Score s = new Score();
    Score s2 = new Score();
    Score s3 = new Score();

    s.name = "홍길동";
    s.kor = 100;
    s.eng = 90;
    s.math = 85;
    printScore(s);

    s2.name = "임꺽정";
    s2.kor = 90;
    s2.eng = 80;
    s2.math = 75;
    printScore(s2);

    s3.name = "유관순";
    s3.kor = 80;
    s3.eng = 70;
    s3.math = 65;
    printScore(s3);

  }

  static void printScore(Score s) {
    s.sum = s.kor + s.eng + s.math;
    s.aver = (float) s.sum / 3;

    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }
  
  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }

}
