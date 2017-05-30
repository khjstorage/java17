/*
 * 간단한 예약 시스템임
 * 1) 공연은 하루에 한 번 있다.
 * 2) 좌석은 S석, A석, B석 타입이 있으며 모두 10석의 좌석이 있다.
 * 3) 공연 예약 시스템의 메뉴는 "예약", "조회", "취소", "끝내기"가 있다.
 * 4) 예약은 한 자리만 예약할 수 있고 좌석 타입, 예약자 이름, 좌석 번호를 순서대로 입력받아 예약한다.
 * 5) 조회는 모든 종류의 좌석을 표시한다.
 * 6) 취소는 예약자의 이름을 입력하여 취소한다.
 * 7) 없는 이름, 없는 번호, 없는 메뉴, 잘못된 취소 등에 대해서 오류 메시지를 출력하고 사용자가 다시
 *    시도하도록 한다.
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
      System.out.print("좌석구분 : S(1), A(2), B(3) >>> ");
      int choice = rd.nextInt();
      
      if(choice < 1 || choice >3){
        System.out.println("다시 선택해주세요.");
        continue;
      }
      
      printSeat(choice);
      
      System.out.print("이름>> ");
      String name = rd.next();
      System.out.print("번호>> ");
      int seatNum = rd.nextInt();
      
      if(already(choice, seatNum, name)){
        System.out.println("예약을 완료하였습니다.");
      }else{
        System.out.println("이미 예약된 좌석입니다.");
      }
      
      break;
    }
  }
  
  public void check(){
    for(int i=0;i<3;i++)
      printSeat(i+1);
    
    System.out.println("조회를 완료하였습니다.");
    System.out.println();
  }
  
  public void cancel(){
    rd = new Scanner(System.in);
    
    System.out.print("좌석 구분 : S(1), A(2), B(3) >>> ");
    int choice = rd.nextInt();
    printSeat(choice);
    
    System.out.print("이름>> ");
    String name = rd.next();
    
    for(int i=0;i<10;i++){
      if(seats[choice-1][i].equals(name + " "))
        seats[choice-1][i] = "__ ";
    }
    
    System.out.println("취소를 완료하였습니다."+"\n");
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
      System.out.print("예약(1) / 조회(2) / 취소(3) / 끝내기(4) >>> ");
      menu = rd.nextInt();
      
      if(menu < 1 || menu > 4){
        System.out.println("다시 선택해주세요.");
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
        System.out.println("종료합니다.");
        flag = false;
      }
    }
  }

}
