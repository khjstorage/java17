package ws_java;

public class IfExam4 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int su = -1000; // int: 4 byte, ��21��
    System.out.println("����: " + su);
    
    if (0 <= su && su <= 9){
      System.out.println("1�� �ڸ�");
    }else if (10 <= su && su <= 99){
      System.out.println("10�� �ڸ�");
    }else if (100 <= su && su <= 999){
      System.out.println("100�� �ڸ�");
    }else if (1000 <= su){
      System.out.println("1000�� �ڸ� �̻�");
    }else{
      System.out.println("������ ó������ �ʽ��ϴ�.");
    }
  }

}
