package ws_java;

public class FlowEx3 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int score = 45; 
    char grade ='\u0000'; 

    if (score >= 90)                   // score�� 90�� ���� ���ų� ũ�� A����(grade) 
    { 
      grade = 'A';             
    } else if (score >=80){             // score�� 80�� ���� ���ų� ũ�� B����(grade) 
                grade = 'B'; 
    } else {                         // �������� C����(grade) 
                grade = 'C'; 
    } 
    
    System.out.println("����� ������ " + grade + "�Դϴ�."); 
  }

}
