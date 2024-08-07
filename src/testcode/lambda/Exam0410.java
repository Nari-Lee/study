package testcode.lambda;

public class Exam0410 {

  //팩토리 메서드

  static Interest getInterest(final double rate) {
    //로컬 클래스로 인터페이스 구현후 객체 리턴
    class MyInterest implements Interest {
      double rate;

      public MyInterest(double rate) {
        this.rate = rate;
      }

      @Override
      public double compute(int money) {
        return money + (money * rate / 100);
      }
    }
    return new MyInterest(rate);
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
