package projectTest;

public class AsciiHistogram {

  public static void main(String[] args) {
    int[] data = {2, 3, 4, 2, 1, 3, 5};
    printHistogram(data);
  }

  public static void printHistogram(int[] data) {
    int max = getMax(data);

    for (int i = 0; i < data.length; i++) {
      System.out.printf("%2d | ", i + 1);
      for (int j = 0; j < data[i]; j++) {
        System.out.print("#");
      }
      System.out.println();
    }

    // X축 라벨 출력
    System.out.print("    ");
    for (int j = 0; j < max; j++) {
      System.out.print("-");
    }
    System.out.println();
  }

  private static int getMax(int[] data) {
    int max = data[0];
    for (int i = 1; i < data.length; i++) {
      if (data[i] > max) {
        max = data[i];
      }
    }
    return max;
  }
}
