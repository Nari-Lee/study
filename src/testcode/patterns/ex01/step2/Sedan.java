package testcode.patterns.ex01.step2;

public class Sedan extends Car {
  public boolean sunloof;
  public boolean auto;

  private Sedan() {
  }

  public static Sedan createCar(String model) {
    Sedan s = new Sedan();

    switch (model) {
      case "소나타":
        s.maker = "현대자동차";
        s.model = "소나타";
        s.cc = 1998;
        s.auto = true;
        s.sunloof = false;
        break;

      case "K7":
        s.maker = "기아";
        s.model = "K7";
        s.cc = 2500;
        s.auto = true;
        s.sunloof = true;
        break;
    }
    return s;
  }

  @Override
  public String toString() {
    return "Sedan{" + "cc=" + cc + ", maker='" + maker + '\'' + ", model='" + model + '\'' + ", auto=" + auto + ", sunloof=" + sunloof + '}';
  }
}
