package testcode.lambda;

public class Exam0510 {

  static class MyCalculator {
    public static int plus(int a, int b) {
      return a + b;
    }

    public static int minus(int a, int b) {
      return a - b;
    }

    public static int multiple(int a, int b) {
      return a * b;
    }

    public static int divide(int a, int b) {
      return a / b;
    }

    public static void main(String[] args) {

      // 익명 클래스 사용
      Calculator c1 = new Calculator() {
        @Override
        public int compute(int x, int y) {
          return x + y;
        }
      };
      c1.compute(100, 200);

      //익명 클래스 활용
      new Calculator() {
        public int compute(int x, int y) {
          return x + y;
        }
      }.compute(100, 200);

      //람다 문법 이용
      Calculator c2 = (x, y) -> x + y;

      //람다 문법 활용
      Calculator c3 = (int x, int y) -> MyCalculator.plus(100, 200);


      //스태틱 레퍼런스 메서드
      Calculator c4 = MyCalculator::plus;
      System.out.println(c4.compute(200, 100));
    }

    interface Calculator {
      int compute(int x, int y);
    }
  }
}
