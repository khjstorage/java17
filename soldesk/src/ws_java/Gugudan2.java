package ws_java;

public class Gugudan2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    for(int dan = 1; dan <= 18; dan++){
      System.out.println(); // �� ���� �߰�
      System.out.println(dan + " ��");
      for (int j=1; j <= 9; j++){
        System.out.println(dan + " X " + j + " = " + (dan * j));
      }
    }
  }

}
