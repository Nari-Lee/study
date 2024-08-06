package testcode.base.ch14.sec06.exam02;

public class WorkObject {
  // 동기화 메서드
  public synchronized void methodA() {
    Thread thread = ThreadA.currentThread();
    System.out.println(thread.getName() + ": methodA 작업 실행");
    // 다른 메서드를 실행 대기 상태로 만듦
    notify();
    try {
      // 자신의 스레드를 일시 정지 상태로 만듦
      wait();
    } catch (InterruptedException e) {
    }
  }

  // 동기화 메서드
  public synchronized void methodB() {
    Thread thread = ThreadA.currentThread();
    System.out.println(thread.getName());
    System.out.println(thread.getName() + ": methodB 작업 실행");
    // 다른 메서드를 실행 대기 상태로 만듦
    notify();
    try {
      // 자신의 스레드를 일시 정지 상태로 만듦
      wait();
    } catch (InterruptedException e) {
    }
  }
}
