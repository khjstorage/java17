package oopTest2;

public class InheTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Smart smart = new Smart();
    System.out.println("��ǥ ����: " + smart.phoneName);
    smart.tel();
    smart.sms();
    System.out.println("��ǥ ����: " + smart.pdaName);
    smart.mms();
    System.out.println("��ǥ ����: " + smart.smartName);
    smart.internet();
  }

}
