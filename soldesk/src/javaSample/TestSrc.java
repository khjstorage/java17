package javaSample;

/*
 * 연수가 4로 나누어 떨어지는 해는 우선 윤년으로 하되, 그중에서 100으로 나누어
 * 떨어지는 해는 평년으로 하고, 다만 400으로 나누어 떨어지는 해는
 * 다시 윤년으로 판정한다.
 */

import java.io.*;
import java.util.*;

class TestSrc {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.print("확인하고 싶은 연도를 입력하세요:");
    Scanner a = new Scanner(System.in);
    int year = a.nextInt();
    
    if(year%4 == 0){
      if(year%100 ==0)
        System.out.println(year + "년 은/는 평년입니다.");
      else
        System.out.println(year + "년 은/는 윤년입니다.");
    }else if(year%400 == 0)
      System.out.println(year+"년 은/는 윤년입니다.");
    else
      System.out.println(year+"년 은/는 평년입니다.");
  }

}
