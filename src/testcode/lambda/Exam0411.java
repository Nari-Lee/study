package testcode.lambda;

public class Exam0411 {

  //팩토리 메서드

  static Interest getInterest(final double rate) {
    //생성자와 필드 삭제후 리턴값
    class MyInterest implements Interest {

      @Override
      public double compute(int money) {
        return money + (money * rate / 100);
      }
    }
    return new MyInterest();
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
