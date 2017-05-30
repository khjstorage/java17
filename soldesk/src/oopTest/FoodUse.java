package oopTest;

public class FoodUse {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Food food = new Food();
    food.print();
 
    Food food2 = new Food("¾ßÃ¤ ±è¹ä", 1500, 1);
    food2.print();
 
    Food food3 = new Food("Á¤µ¿ ±¹¹ä", 6000, 2);
    food3.print();
 
    Food food4 = new Food("¼ø´ë±¹", 6000, 3);
    food4.print();
  }

}
