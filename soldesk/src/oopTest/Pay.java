package oopTest;

public class Pay {
  public int getPay(String country){
    int pay = 0;
    
    if (country == "한국"){
      pay = 5580;
    }else if(country == "캐나다"){
      pay = 9700;
    }else if(country == "미국"){
      pay = 10648;
    }else if(country == "일본"){
      pay = 10936;
    }else if(country == "호주"){
      pay = 13685;
    }
    
    return pay;
  }
}
