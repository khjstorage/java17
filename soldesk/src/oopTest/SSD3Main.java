package oopTest;

public class SSD3Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    SSD3 ssd1 = new SSD3(); // ��ü ����
    ssd1.name = "ADATA 128 GB";
    ssd1.price = 52000;
    ssd1.dc = ssd1.price - 3000;
    ssd1.point = (int)(ssd1.dc  * 0.05); // 5%
    ssd1.count = 1;
    
    System.out.println("��ǰ��: " + ssd1.name);
    System.out.println("����: " + ssd1.price);
    System.out.println("���ΰ�: " + ssd1.dc);
    System.out.println("����Ʈ: " + ssd1.point);
    System.out.println("���ż���: " + ssd1.count);
    System.out.println("------------------------------");
 
    SSD3 ssd2 = new SSD3(); // ��ü ����
    ssd2.name = "ADATA 256 GB";
    ssd2.price = 65000;
    ssd2.dc = ssd2.price - 3000;
    ssd2.point = (int)(ssd2.dc  * 0.05); // 5%
    ssd2.count = 3;
    
    System.out.println("��ǰ��: " + ssd2.name);
    System.out.println("����: " + ssd2.price);
    System.out.println("���ΰ�: " + ssd2.dc);
    System.out.println("����Ʈ: " + ssd2.point);
    System.out.println("���ż���: " + ssd2.count);
    System.out.println("------------------------------");
    
    SSD3 ssd3 = new SSD3(); // ��ü ����
    ssd3.name = "ADATA 512 GB";
    ssd3.price = 100000;
    ssd3.dc = ssd3.price - 3000;
    ssd3.point = (int)(ssd3.dc  * 0.05); // 5%
    ssd3.count = 3;
    
    System.out.println("��ǰ��: " + ssd3.name);
    System.out.println("����: " + ssd3.price);
    System.out.println("���ΰ�: " + ssd3.dc);
    System.out.println("����Ʈ: " + ssd3.point);
    System.out.println("���ż���: " + ssd3.count);
    System.out.println("------------------------------");    
  }

}
