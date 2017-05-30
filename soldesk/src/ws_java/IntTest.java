package ws_java;

public class IntTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String name = "벤 스틸러";
    int java = 80;
    int jsp =  90;
    int spring = 70;
    int project = 100;
    int tot = java + jsp + spring + project;
    int avg = tot / 4; // 정수 / 정수 = 정수, 소수점 짤림.
    
    System.out.println("성명: " + name);
    System.out.println("JAVA: " + java);
    System.out.println("JSP: " + jsp);
    System.out.println("Spring: " + spring);
    System.out.println("Project: " + project);
    System.out.println("총점: " + tot);
    System.out.println("평균: " + avg);
  }

}
