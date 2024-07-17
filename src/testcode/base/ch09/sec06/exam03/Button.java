package testcode.base.ch09.sec06.exam03;

public class Button {

  // 필드
  private ClickListener clickListener;

  // 메소드
  public void setClickListener(ClickListener clickListener) {
    this.clickListener = clickListener;
  }

  // Botton이 클릭되었을때 실행하는 메소드 선언
  public void click() {
    this.clickListener.onClick();
  }

  // 정적 멤버 인터페이스
  public static interface ClickListener {
    //추상 메서드
    void onClick();
  }
}
