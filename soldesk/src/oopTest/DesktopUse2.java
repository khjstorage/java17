package oopTest;

class Desktop2 {
  String name;
  double cpu;
  int ram;
  double hdd;
  
  public void print(){
    System.out.println();
    System.out.println("브랜드명: " + name);
    System.out.println("CPU: " + cpu);
    System.out.println("RAM: " + ram);
    System.out.println("HDD: " + hdd);
  }
  
  public void print2(){
    System.out.println();
    System.out.println("브랜드명: " + name + " 제조");
    System.out.println("CPU: " + cpu + " GHz");
    System.out.println("RAM: " + ram + " GB");
    System.out.println("HDD: " + hdd + " TB");
  }
 
  public void print3(){
    System.out.println();
    System.out.println("① 브랜드명: " + name + " 제조");
    System.out.println("② CPU: " + cpu + " GHz");
    System.out.println("③ RAM: " + ram + " GB");
    System.out.println("④ HDD: " + hdd + " TB");
  }
}

public class DesktopUse2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Desktop2 desktop = new Desktop2();
    desktop.name = "LG";
    desktop.cpu = 3.5;
    desktop.ram = 8;
    desktop.hdd = 1.0;
    
    desktop.print();
    desktop.print2();
    desktop.print3();
  }

}
