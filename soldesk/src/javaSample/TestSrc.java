package javaSample;

/*
 * ������ 4�� ������ �������� �ش� �켱 �������� �ϵ�, ���߿��� 100���� ������
 * �������� �ش� ������� �ϰ�, �ٸ� 400���� ������ �������� �ش�
 * �ٽ� �������� �����Ѵ�.
 */

import java.io.*;
import java.util.*;

class TestSrc {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.print("Ȯ���ϰ� ���� ������ �Է��ϼ���:");
    Scanner a = new Scanner(System.in);
    int year = a.nextInt();
    
    if(year%4 == 0){
      if(year%100 ==0)
        System.out.println(year + "�� ��/�� ����Դϴ�.");
      else
        System.out.println(year + "�� ��/�� �����Դϴ�.");
    }else if(year%400 == 0)
      System.out.println(year+"�� ��/�� �����Դϴ�.");
    else
      System.out.println(year+"�� ��/�� ����Դϴ�.");
  }

}
