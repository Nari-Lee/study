package testcode.base.ch14.sec06.exam02;

public class ThreadA extends Thread {
  private WorkObject workObject;

  // 공유 객체를 받음
  public ThreadA(WorkObject workObject) {
    // 쓰레드 이름 변경
    setName("ThreadA");
    this.workObject = workObject;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      // 동기화 메서드 호출
      workObject.methodA();
    }
  }
}
