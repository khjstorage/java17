package oopTest;

public class Food {
  String menu;
  int price;
  int count;
  int total;
  
  // �⺻ ������, ���� ����, �������� ������ �ڵ� ������.
  public Food(){
    System.out.println("��ü ����");
  }
  
  public Food(String menu, int price, int count){
    this.menu = menu;
    this.price = price;
    this.count = count;
    this.total = price * count;
  }
  
  public void print(){
    System.out.println("----------------------");
    System.out.println("�޴���: " + menu);
    System.out.println("��   ��: " + price);
    System.out.println("��   ��: " + count);
    System.out.println("�ѱݾ�: " + total);
  }
}
