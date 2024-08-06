package testcode.base.ch16.sec02.exam02;

public class ButtonExample {
  public static void main(String[] args) {

    Button button = new Button();

    button.setClickListener(() -> {
      System.out.println("버튼을 클릭했습니다.");
    });

    button.click();

    Button buttonCancel = new Button();

    buttonCancel.setClickListener(() -> {
      System.out.println("취소 버튼을 클릭했습니다.");
    });

    buttonCancel.click();
  }
}
