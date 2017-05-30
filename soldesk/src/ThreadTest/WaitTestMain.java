package ThreadTest;

import java.util.concurrent.*;

public class WaitTestMain {

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    // TODO Auto-generated method stub
    ExecutorService threadPool = Executors.newFixedThreadPool(10);
    ExecutorCompletionService<String> service = new ExecutorCompletionService<>(threadPool);

    service.submit(new WaitTask(5000));
    service.submit(new WaitTask(3000));
    service.submit(new WaitTask(1000));

    // 3개의 결과를 받을때까지 루프
    for(int i = 0; i < 3; i++){
      Future<String> future = service.take();
      System.out.println(future.get());
    }

    // 모든 작업이 종료하면 셧다운
    threadPool.shutdown ( );
  }

}
