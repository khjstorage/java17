package ws_java;

public class IfExam6 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int month = 3;
    String str = ""; // ������ ��� ���ڿ�
   
    System.out.println("��: " + month);
    
    if (3 <= month && month <= 5){
      str = "�� ����";
    }else if (6 <= month && month <= 8){
      str = "���� �ٴ�";
    }else if (9 <= month && month <= 11){
      str = "��ǳ";
    // }else if( month == 12 || month  == 1 || month == 2){
    }else if (month == 12 || (1 <= month && month <= 2)){ 
      str = "��";
    }
    
    System.out.println(str);
  }

}
