package ThreadTest;

/**
 * Callable �������̽��� ������ �۾��� ExcutorService class�� submit() �޼ҵ�� �����ϸ�
 * �񵿱�� ����Ǵ� �۾��� ó�� ����� �ޱ� ���� java.util.concurrent.Future ��ü�� ��ȯ�ȴ�.
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

    return time + "�и��� �����";
  }
}
