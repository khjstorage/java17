package javaSample;

class Rectangle {
  private int x1, y1, x2, y2;
  
  public Rectangle(int x1, int y1, int x2, int y2){
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }
  
  public Rectangle(){
    this(0, 0, 0, 0);
  }
  
  public void set(int x1, int y1, int x2, int y2){
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }
  
  public int squre(){
    int result;
    result =(x2 - x1) * (y2 - y1);
    
    return result;
  }
  
  public void show(){
    System.out.println("<직사각형 좌표와 넓이>");
    System.out.println("(" + x1 + "," + y1 + ")" + ","
        + "(" + x2 + "," + y2 + ")" + "넓이 : " + squre());
  }
  
  boolean equals(Rectangle r){
    return true;
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Rectangle r = new Rectangle();
    Rectangle s = new Rectangle(1,1,2,3);
    
    r.show();
    s.show();
    System.out.println(s.squre());
    r.set(-2, 2, -1, 4);
    r.show();
    System.out.println(r.squre());
    
    if(r.equals(s))
      System.out.println("두 사각형은 같습니다.");
  }

}
