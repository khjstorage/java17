package oopTest;

public class Pay {
  public int getPay(String country){
    int pay = 0;
    
    if (country == "�ѱ�"){
      pay = 5580;
    }else if(country == "ĳ����"){
      pay = 9700;
    }else if(country == "�̱�"){
      pay = 10648;
    }else if(country == "�Ϻ�"){
      pay = 10936;
    }else if(country == "ȣ��"){
      pay = 13685;
    }
    
    return pay;
  }
}
