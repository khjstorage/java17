package oopTest;

public class Nation {
  public String getNation(String country){
    String str = "";
    
    if (country == "KOR"){
      str = "한국";
    }else if(country == "JAP"){
      str = "일본";
    }else if(country == "CHA"){
      str = "중국";
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
