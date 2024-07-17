package testcode.lambda;

public class Exam0160 {
  //스태틱 필드
  static A obj1 = () -> System.out.println("스태틱 필드!");
  //인스턴스 필드
  A obj2 = () -> System.out.println("인스턴스 필드!");

  public static void main(String[] args) {

    //로컬 변수
    A obj3 = () -> System.out.println("로컬 변수!");

    // 파라미터
    m1(() -> System.out.println("파라미터!"));

    // 리턴 값
    A obj4 = m2();
  }

  static void m1(final A obj) {
    obj.print();
  }

  static A m2() {
    return () -> System.out.println("리턴 문장");
  }

  interface A {
    void print();
  }

}
