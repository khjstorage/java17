package oopTest;

public class StudentUse {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Student stu = new Student();
    System.out.println(stu);
    System.out.println(stu.hashCode());
    
//    Student stu2 = null; // �޸𸮸� �Ҵ���� ���� ����
//    System.out.println(stu2);
//    System.out.println(stu2.hashCode());
    stu.no = "IT20150401";
    stu.name = "�Ʒι�";
    stu.score = 8.5;
    
    System.out.println("----------------------");
    System.out.println("�й�: " + stu.no);
    System.out.println("����: " + stu.name);
    System.out.println("����: " + stu.score);
  }

}
