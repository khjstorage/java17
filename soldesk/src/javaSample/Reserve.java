/*
 * ������ ���� �ý�����
 * 1) ������ �Ϸ翡 �� �� �ִ�.
 * 2) �¼��� S��, A��, B�� Ÿ���� ������ ��� 10���� �¼��� �ִ�.
 * 3) ���� ���� �ý����� �޴��� "����", "��ȸ", "���", "������"�� �ִ�.
 * 4) ������ �� �ڸ��� ������ �� �ְ� �¼� Ÿ��, ������ �̸�, �¼� ��ȣ�� ������� �Է¹޾� �����Ѵ�.
 * 5) ��ȸ�� ��� ������ �¼��� ǥ���Ѵ�.
 * 6) ��Ҵ� �������� �̸��� �Է��Ͽ� ����Ѵ�.
 * 7) ���� �̸�, ���� ��ȣ, ���� �޴�, �߸��� ��� � ���ؼ� ���� �޽����� ����ϰ� ����ڰ� �ٽ�
 *    �õ��ϵ��� �Ѵ�.
 */


package javaSample;

import java.util.*;

class Menu{
  private static Scanner rd;
  String[][] seats = new String[3][10];
  
  public Menu(){
    int i, j;
    
    for(i=0;i<3;i++){
      for(j=0;j<10;j++){
        seats[i][j] = "__ ";
      }
    }
  }
  
  public void printSeat(int seatChoice){
    String SAB = null;
    
    switch(seatChoice){
    case 1:
      SAB = "S>> ";
      break;
    case 2:
      SAB = "A>> ";
      break;
    case 3:
      SAB = "B>> ";
      break;
    }
    
    System.out.print(SAB);
    
    for(int i=0;i<10; i++)
      System.out.print(seats[seatChoice - 1][i]);
    
    System.out.println();
  }
  
  public boolean already(int seatChoice, int seatNum, String name){
    if(seats[seatChoice - 1][seatNum - 1].equals("__ ")){
      seats[seatChoice - 1][seatNum - 1] = (name + " ");
      
      return true;
    }else
      return false;
  }
  
  public void reserve(){
    rd = new Scanner(System.in);
    
    while(true){
      System.out.print("�¼����� : S(1), A(2), B(3) >>> ");
      int choice = rd.nextInt();
      
      if(choice < 1 || choice >3){
        System.out.println("�ٽ� �������ּ���.");
        continue;
      }
      
      printSeat(choice);
      
      System.out.print("�̸�>> ");
      String name = rd.next();
      System.out.print("��ȣ>> ");
      int seatNum = rd.nextInt();
      
      if(already(choice, seatNum, name)){
        System.out.println("������ �Ϸ��Ͽ����ϴ�.");
      }else{
        System.out.println("�̹� ����� �¼��Դϴ�.");
      }
      
      break;
    }
  }
  
  public void check(){
    for(int i=0;i<3;i++)
      printSeat(i+1);
    
    System.out.println("��ȸ�� �Ϸ��Ͽ����ϴ�.");
    System.out.println();
  }
  
  public void cancel(){
    rd = new Scanner(System.in);
    
    System.out.print("�¼� ���� : S(1), A(2), B(3) >>> ");
    int choice = rd.nextInt();
    printSeat(choice);
    
    System.out.print("�̸�>> ");
    String name = rd.next();
    
    for(int i=0;i<10;i++){
      if(seats[choice-1][i].equals(name + " "))
        seats[choice-1][i] = "__ ";
    }
    
    System.out.println("��Ҹ� �Ϸ��Ͽ����ϴ�."+"\n");
    printSeat(choice);
  }
}

class Reserve {
  private static Scanner rd;
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Menu m = new Menu();
    rd = new Scanner(System.in);
    int menu;
    boolean flag = true;
    
    while(flag){
      System.out.print("����(1) / ��ȸ(2) / ���(3) / ������(4) >>> ");
      menu = rd.nextInt();
      
      if(menu < 1 || menu > 4){
        System.out.println("�ٽ� �������ּ���.");
        continue;
      }
      
      switch(menu){
      case 1:
        m.reserve();
        break;
      case 2:
        m.check();
        break;
      case 3:
        m.cancel();
        break;
      case 4:
        System.out.println("�����մϴ�.");
        flag = false;
      }
    }
  }

}
