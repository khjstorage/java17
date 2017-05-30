package ThreadTest;

public class ForkJoinPoolTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] array = {1,2,5,6,7,4,2,6,7,2,3,8,1,100,500};
    long result = Sum.sumArray(array);

    System.out.println("Fork Join result ="+result);
  }

}
