package ThreadTest;

/**
 * Callable 인터페이스를 구현한 작업을 ExcutorService class의 submit() 메소드로 실행하면
 * 비동기로 싱행되는 작업의 처리 결과를 받기 위한 java.util.concurrent.Future 객체가 반환된다.
 */

import java.util.concurrent.Callable;

public class WaitTask implements Callable<String> {
  private long time;

  public WaitTask(long time){
    this.time = time;
  }

  @Override
  public String call() throws Exception {
    Thread.sleep(this.time);

    return time + "밀리초 대기함";
  }
}
