package oopTest;

public class CalcUse {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Calc calc = new Calc();
    int receive = calc.account(12, 200000); // Call By Value
    System.out.println("12 ����, 20������ ����: " + receive);
 
    receive = calc.account(12, 300000); // Call By Value
    System.out.println("12 ����, 30������ ����: " + receive);
 
    receive = calc.account(24, 200000, 2.25); // Call By Value
    System.out.println("24 ����, 20������ ����, ���ڰ� 2.25%: " + receive);
    
    receive = calc.account(36, 200000, 2.50); // Call By Value
    System.out.println("36 ����, 20������ ����, ���ڰ� 2.50%: " + receive);
  }

}
