package oopTest;

public class SSD3Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    SSD3 ssd1 = new SSD3(); // 객체 생성
    ssd1.name = "ADATA 128 GB";
    ssd1.price = 52000;
    ssd1.dc = ssd1.price - 3000;
    ssd1.point = (int)(ssd1.dc  * 0.05); // 5%
    ssd1.count = 1;
    
    System.out.println("제품명: " + ssd1.name);
    System.out.println("가격: " + ssd1.price);
    System.out.println("할인가: " + ssd1.dc);
    System.out.println("포인트: " + ssd1.point);
    System.out.println("구매수량: " + ssd1.count);
    System.out.println("------------------------------");
 
    SSD3 ssd2 = new SSD3(); // 객체 생성
    ssd2.name = "ADATA 256 GB";
    ssd2.price = 65000;
    ssd2.dc = ssd2.price - 3000;
    ssd2.point = (int)(ssd2.dc  * 0.05); // 5%
    ssd2.count = 3;
    
    System.out.println("제품명: " + ssd2.name);
    System.out.println("가격: " + ssd2.price);
    System.out.println("할인가: " + ssd2.dc);
    System.out.println("포인트: " + ssd2.point);
    System.out.println("구매수량: " + ssd2.count);
    System.out.println("------------------------------");
    
    SSD3 ssd3 = new SSD3(); // 객체 생성
    ssd3.name = "ADATA 512 GB";
    ssd3.price = 100000;
    ssd3.dc = ssd3.price - 3000;
    ssd3.point = (int)(ssd3.dc  * 0.05); // 5%
    ssd3.count = 3;
    
    System.out.println("제품명: " + ssd3.name);
    System.out.println("가격: " + ssd3.price);
    System.out.println("할인가: " + ssd3.dc);
    System.out.println("포인트: " + ssd3.point);
    System.out.println("구매수량: " + ssd3.count);
    System.out.println("------------------------------");    
  }

}
