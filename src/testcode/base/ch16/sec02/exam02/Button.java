package testcode.base.ch16.sec02.exam02;

public class Button {

  //필드
  private ClickListener clickListener;

  //메서드
  public void setClickListener(ClickListener clickListener) {
    this.clickListener = clickListener;
  }

  public void click() {
    this.clickListener.onClick();
  }

  //정적 멤버 인터페이스
  public static interface ClickListener {
    void onClick();
  }
}
