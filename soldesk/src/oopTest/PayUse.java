package oopTest;

public class PayUse {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Pay pay = new Pay();
    int payment = pay.getPay("�ѱ�");
    System.out.println("�ѱ�: " + payment);
    
    payment = pay.getPay("ĳ����");
    System.out.println("ĳ����: " + payment);
 
    payment = pay.getPay("�̱�");
    System.out.println("�̱�: " + payment);
    
    System.out.println("�Ϻ�: " + pay.getPay("�Ϻ�"));
    System.out.println("ȣ��: " + pay.getPay("ȣ��"));
  }

}
