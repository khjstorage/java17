package oopTest;

class FieldTest{
  // 필드(변수) 3개 선언
  String level1;
  String level2;
  String level3;
}

public class FieldUse {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    FieldTest field = new FieldTest(); // 객체 생성
    field.level1 = "객체지향";
    field.level2 = "웹프로그램";
    field.level3 = "개발프레임워크";
    
    System.out.println(field.level1);
    System.out.println(field.level2);
    System.out.println(field.level3);
  }

}
