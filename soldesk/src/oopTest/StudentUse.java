package oopTest;

public class StudentUse {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Student stu = new Student();
    System.out.println(stu);
    System.out.println(stu.hashCode());
    
//    Student stu2 = null; // 메모리를 할당받지 못한 상태
//    System.out.println(stu2);
//    System.out.println(stu2.hashCode());
    stu.no = "IT20150401";
    stu.name = "아로미";
    stu.score = 8.5;
    
    System.out.println("----------------------");
    System.out.println("학번: " + stu.no);
    System.out.println("성명: " + stu.name);
    System.out.println("점수: " + stu.score);
  }

}
