package testcode.base;

public class Car {

  int speed;

  static void simulate() {
    Car myCar = new Car();

    myCar.speed = 200;
    myCar.run();
  }

  public static void main(String[] args) {
    simulate();

    Car myCar = new Car();
    myCar.speed = 60;
    myCar.run();
  }

  void run() {
    System.out.println(speed + "으로 달려갑니다.");
  }
}
