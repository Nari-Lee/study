package projectTest;

public class SingleGame31 {
  // package bitcamp.myapp.command;
  //
  //import bitcamp.command.Command;
  //import bitcamp.context.ApplicationContext;
  //import bitcamp.util.Prompt;
  //
  //  // 혼자하기 게임 명령을 구현하는 클래스
  //  public class PlaySinglePlayerGameCommand implements Command {
  //    ApplicationContext appCtx;
  //
  //    public PlaySinglePlayerGameCommand(ApplicationContext appCtx) {
  //      this.appCtx = appCtx;
  //    }
  //
  //    @Override
  //    public void execute(String title) {
  //      int currentNumber = 0;
  //      boolean isPlayerTurn = true;
  //
  //      System.out.println("혼자하기 게임을 시작합니다.");
  //
  //      while (currentNumber < 31) {
  //        if (isPlayerTurn) {
  //          System.out.println("현재 숫자: " + currentNumber);
  //          int count = Prompt.inputInt("플레이어, 몇 개의 숫자를 말하시겠습니까? (1-3)>");
  //          while (count < 1 || count > 3) {
  //            count = Prompt.inputInt("잘못된 입력입니다. 다시 입력해주세요 (1-3)>");
  //          }
  //          printNumbers(currentNumber + 1, currentNumber + count);
  //          currentNumber += count;
  //          if (currentNumber >= 31) {
  //            System.out.println("플레이어가 졌습니다!");
  //            break;
  //          }
  //        } else {
  //          int count = (int) (Math.random() * 3) + 1;
  //          System.out.println("컴퓨터가 " + count + "개의 숫자를 말합니다.");
  //          printNumbers(currentNumber + 1, currentNumber + count);
  //          currentNumber += count;
  //          if (currentNumber >= 31) {
  //            System.out.println("컴퓨터가 졌습니다! 플레이어가 이겼습니다!");
  //            break;
  //          }
  //        }
  //        isPlayerTurn = !isPlayerTurn;
  //      }
  //    }
  //
  //    private void printNumbers(int start, int end) {
  //      for (int i = start; i <= end; i++) {
  //        System.out.println(i);
  //      }
  //    }
  //  }

}
