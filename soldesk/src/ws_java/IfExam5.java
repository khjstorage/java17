package ws_java;

public class IfExam5 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int java = 50;
    int jsp = 80;
    int spring = 60;
    String test = ""; //  ���, ��ɻ�
 
    if (java >= 80 || jsp >= 80 || spring >= 80){
      test = "���";
    }else{
      test = "��ɻ�";
    }
    System.out.println("���: " + test);
  }

}
