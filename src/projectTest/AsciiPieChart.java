package projectTest;

public class AsciiPieChart {

  public static void main(String[] args) {
    int[] data = {30, 70}; // 퍼센트로 표현
    printPieChart(data);
  }

  public static void printPieChart(int[] data) {
    int total = 0;
    for (int value : data) {
      total += value;
    }

    for (int i = 0; i < data.length; i++) {
      int percentage = (int) ((data[i] / (double) total) * 100);
      System.out.printf("Segment %d: ", i + 1);
      for (int j = 0; j < percentage / 2; j++) {
        System.out.print("#");
      }
      System.out.printf(" %d%%\n", percentage);
    }
  }
}
