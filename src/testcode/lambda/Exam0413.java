package testcode.lambda;

public class Exam0413 {

  //팩토리 메서드

  static Interest getInterest(final double rate) {
    //익명클래스 구현
    return new Interest() {
      @Override
      public double compute(int money) {
        return money + (money * rate / 100);
      }
    };
  }

  public static void main(String[] args) {
    Interest i1 = getInterest(1.5);
    System.out.printf("금액: %.2f\n", i1.compute(1_0000_0000));

    Interest i2 = getInterest(2.5);
    System.out.printf("금액: %.2f\n", i2.compute(1_0000_0000));
  }

  static interface Interest {
    double compute(int money);
  }
}
