package javaSample;

import java.io.IOException;
import java.io.InputStreamReader;

class TestSrc2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    InputStreamReader rd = new InputStreamReader(System.in);
    
    int a;
    
    while(true){
      try{
        a = rd.read();
        if(a==-1)
          break;
        else if(a=='\n' || a=='\r')
          continue;
        
        if(a>='a' && a<='z')
          a = a-('a'-'A');
        else if(a>='A' && a<='Z')
          a = a+('a'-'A');
        else{
          System.out.println("영문자가 아닙니다.");
          continue;
        }
        System.out.println((char)a);
      }catch(IOException e){
        System.out.println("입력에러");
      }//try ~ catch문
    }
      
  }

}
