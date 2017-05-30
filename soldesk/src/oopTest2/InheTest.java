package oopTest2;

public class InheTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Smart smart = new Smart();
    System.out.println("대표 기종: " + smart.phoneName);
    smart.tel();
    smart.sms();
    System.out.println("대표 기종: " + smart.pdaName);
    smart.mms();
    System.out.println("대표 기종: " + smart.smartName);
    smart.internet();
  }

}
