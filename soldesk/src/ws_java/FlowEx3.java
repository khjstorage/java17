package ws_java;

public class FlowEx3 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int score = 45; 
    char grade ='\u0000'; 

    if (score >= 90)                   // score가 90점 보다 같거나 크면 A학점(grade) 
    { 
      grade = 'A';             
    } else if (score >=80){             // score가 80점 보다 같거나 크면 B학점(grade) 
                grade = 'B'; 
    } else {                         // 나머지는 C학점(grade) 
                grade = 'C'; 
    } 
    
    System.out.println("당신의 학점은 " + grade + "입니다."); 
  }

}
