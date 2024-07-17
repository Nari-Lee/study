package projectTest;

public class AsciiBarChart {

  public static void main(String[] args) {
    int[] data = {5, 3, 7, 2, 9}; // 그래프에 표시할 데이터
    printBarChart(data);
  }

  public static void printBarChart(int[] data) {
    int max = getMax(data);

    for (int i = max; i >= 1; i--) {
      for (int j = 0; j < data.length; j++) {
        if (data[j] >= i) {
          System.out.print("|#");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }

    // X축 라벨 출력
    for (int j = 0; j < data.length; j++) {
      System.out.print("--");
    }
    System.out.println();

    // 데이터 값 출력
    for (int j = 0; j < data.length; j++) {
      System.out.printf("%2d", data[j]);
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
