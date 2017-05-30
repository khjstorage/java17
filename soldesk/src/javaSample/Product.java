package javaSample;

class Product {
  private int ID;
  String explanation;
  String producer;
  int price;
  
  public Product(){
    this.ID = -1;
    this.explanation = null;
    this.producer = null;
    this.price = 0;
  }
  
  void setISBN(int ISBN){    
  }
  
  void setAuthor(String string){}
  
  void setBookTitle(String string){}
  
  void setConversationLanguage(String string){}
  
  void setAlbumTitle(String string){}
  
  void setArtist(String string){}
  
  void setID(int ID){
    this.ID = ID;
  }
  
  int getISBN(){
    return price;
  }
  
  String getAuthor(){
    return producer;
  }
  
  String getBookTitle(){
    return producer;
  }
  
  String getConversationLanguage(){
    return producer;
  }
  
  String getAlbumTitle(){
    return producer;
  }
  
  String getArtist(){
    return producer;
  }
  
  int getID(){
    return ID;
  }
  
  void getBookInfo(){ }
  void getConversationBookInfo(){}
  void getCompactDiscInfo(){}
}
