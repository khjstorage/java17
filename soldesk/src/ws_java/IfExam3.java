package ws_java;

public class IfExam3 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int rank = 1;          // ����
    String product = ""; // ��ǰ
    
    if (rank == 1){
      product = "��Ʈ��";
    }else if(rank == 2){
      product = "���� ���� ������";
    }else if(rank == 3){
      product = "2TB HDD";
    }else{
      product = "���� ��ȸ��...";
    }
 
    System.out.println("���: " + rank + " ��ǰ: " + product);
  }

}
