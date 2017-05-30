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

    // 3���� ����� ���������� ����
    for(int i = 0; i < 3; i++){
      Future<String> future = service.take();
      System.out.println(future.get());
    }

    // ��� �۾��� �����ϸ� �˴ٿ�
    threadPool.shutdown ( );
  }

}
