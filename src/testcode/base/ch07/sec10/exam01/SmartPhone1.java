package testcode.base.ch07.sec10.exam01;

public class SmartPhone1 extends Phone {
  SmartPhone1(String owner) {
    super(owner);
  }

  void internetSearch() {
    System.out.println("인터넷 검색을 합니다.");
  }
}
