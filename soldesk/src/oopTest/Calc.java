package oopTest;

public class Calc {
  /**
   * 적금 처리
   * @param month 개월
   * @param input 입금액
   * @return 수령 금액
   */
  public int account(int month, int input){
    int total = month * input;
    
    return total;
  }
 
  /**
   * 적금 처리
   * @param month 개월
   * @param input 입금액
   * @param ija 이자
   * @return 수령 금액
   */
  public int account(int month, int input, double ija){
    int total = month * input;  // 원금
    int total_ija = (int)(total * (ija/100)); // 이자
    int receive = total + total_ija; // 원금  + 이자
 
    return receive;
  }
}
