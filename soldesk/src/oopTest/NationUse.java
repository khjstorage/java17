package oopTest;

public class NationUse {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Nation nation = new Nation();
    System.out.println("KOR -> " + nation.getNation("KOR"));
    System.out.println("JAP -> " + nation.getNation("JAP"));
    System.out.println("CHA -> " + nation.getNation("CHA"));
 
    System.out.println("-----------------------");
    System.out.println("KOR -> " + nation.getGDP("KOR") + " $");
    System.out.println("JAP -> " + nation.getGDP("JAP") + " $");
    System.out.println("CHA -> " + nation.getGDP("CHA") + " $");
  }

}
