package ws_java;

public class WhileTest1 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int su = 0;
    
    while(true){ // ���� ��ƾ
       su = su + 1;
       System.out.println(su);
       
       if (su == 5){
         break;  // while�� ����
       }
    }
    
    System.out.println("-----");
    su = 0;      // ���ʱ�ȭ
    
    while(su < 4){ // su ������ 4���� �۰ų� ���� ���� ��ȯ
      su = su + 1;
      System.out.println(su);
    }
  }

}
