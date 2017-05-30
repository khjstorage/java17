package oopTest;

class Desktop {
  String brand;  // ÇÊµå
  double cpu;
  int ram;
  boolean wifi;
}

public class DesktopUse {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Desktop desktop = new Desktop();
    System.out.println(desktop.brand);
    System.out.println(desktop.cpu);
    System.out.println(desktop.ram);
    System.out.println(desktop.wifi);
 
    System.out.println("---------------");
    desktop.brand = "LG";
    desktop.cpu = 3.5;
    desktop.ram = 8;
    desktop.wifi = true;
    
    System.out.println(desktop.brand);
    System.out.println(desktop.cpu);
    System.out.println(desktop.ram);
    System.out.println(desktop.wifi);
  }

}
