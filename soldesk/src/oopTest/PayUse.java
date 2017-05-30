package oopTest;

public class PayUse {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Pay pay = new Pay();
    int payment = pay.getPay("한국");
    System.out.println("한국: " + payment);
    
    payment = pay.getPay("캐나다");
    System.out.println("캐나다: " + payment);
 
    payment = pay.getPay("미국");
    System.out.println("미국: " + payment);
    
    System.out.println("일본: " + pay.getPay("일본"));
    System.out.println("호주: " + pay.getPay("호주"));
  }

}
