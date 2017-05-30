package oopTest;

public class Food {
  String menu;
  int price;
  int count;
  int total;
  
  // 기본 생성자, 생략 가능, 선언하지 않을시 자동 생성됨.
  public Food(){
    System.out.println("객체 생성");
  }
  
  public Food(String menu, int price, int count){
    this.menu = menu;
    this.price = price;
    this.count = count;
    this.total = price * count;
  }
  
  public void print(){
    System.out.println("----------------------");
    System.out.println("메뉴명: " + menu);
    System.out.println("단   가: " + price);
    System.out.println("갯   수: " + count);
    System.out.println("총금액: " + total);
  }
}
