package oopTest;

public class Nation {
  public String getNation(String country){
    String str = "";
    
    if (country == "KOR"){
      str = "�ѱ�";
    }else if(country == "JAP"){
      str = "�Ϻ�";
    }else if(country == "CHA"){
      str = "�߱�";
    }
    
    return str;
  }
  
  public int getGDP(String country){
    int gdp = 0;
    
    if (country == "KOR"){
      gdp = 28738;
    }else if(country == "JAP"){
      gdp = 37539;
    }else if(country == "CHA"){
      gdp = 6747;
    }
    
    return gdp;
  }
}
