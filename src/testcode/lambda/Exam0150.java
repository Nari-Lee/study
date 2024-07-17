package testcode.lambda;

public class Exam0150 {
  static void test(Calculator c) {
    System.out.println(c.compute(100, 200));
  }

  public static void main(String[] args) {

    //일반 클래스
    class My implements Calculator {
      public int compute(int a, int b) {
        return a + b;
      }
    }
    test(new My());

    //익명 클래스
    Calculator c2 = new Calculator() {
      @Override
      public int compute(int a, int b) {
        return a + b;
      }
    };
    test(c2);

    //익명 클래스 2
    test(new Calculator() {
      public int compute(int a, int b) {
        return a + b;
      }
    });

    //람다
    Calculator c3 = (int a, int b) -> {
      return a + b;
    };
    test(c3);

    //람다2 + int 제거
    Calculator c4 = (a, b) -> {
      return a + b;
    };
    test(c4);

    //람다3 + 괄호 및 return 제거
    Calculator c5 = (a, b) -> a + b;
    test(c5);

  }

  interface Calculator {
    int compute(int a, int b);
  }
}
