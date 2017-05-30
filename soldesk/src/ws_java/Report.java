package ws_java;

public class Report {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int report = 0;
    
    report = report + 1;
    System.out.println("1.report: " + report);
 
    report++;
    System.out.println("2.report: " + report);
 
    ++report;
    System.out.println("3.report: " + report);
    
    report--;
    System.out.println("4.report: " + report);
    
    --report;
    System.out.println("5.report: " + report);
    
    int su1 = 0;
    int su2 = 0;
    
    int sum = ++su1 + su2++; // ±«¿Â æ∆¥‘
    
    // su1 = su1 + 1;
    // sum = su1 + su2;  // 1 + 0
    // su2 = su2 + 1;
    
    System.out.println("su1: " + su1);
    System.out.println("su2: " + su2);
    System.out.println("sum: " + sum);
  }

}
