package oopTest;

public class Calc {
  /**
   * ���� ó��
   * @param month ����
   * @param input �Աݾ�
   * @return ���� �ݾ�
   */
  public int account(int month, int input){
    int total = month * input;
    
    return total;
  }
 
  /**
   * ���� ó��
   * @param month ����
   * @param input �Աݾ�
   * @param ija ����
   * @return ���� �ݾ�
   */
  public int account(int month, int input, double ija){
    int total = month * input;  // ����
    int total_ija = (int)(total * (ija/100)); // ����
    int receive = total + total_ija; // ����  + ����
 
    return receive;
  }
}
