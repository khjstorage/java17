package oopTest;

class Movie {
  /**
   * ���
   * @param name ��ȭ��
   */
  public void print(String name){
    System.out.println("��ȭ��: " + name);
  }
 
  public void print(String name, String type){
    System.out.println("----------------------------");
    System.out.println("��ȭ��: " + name);
    System.out.println("��   ��: " + type);
  }
 
  public void print(String name, String type, int time){
    System.out.println("----------------------------");
    System.out.println("��ȭ��: " + name);
    System.out.println("��   ��: " + type);
    System.out.println("��   ��: " + time);
  }
  
  public void print(String[] actor){
    System.out.println("----------------------------");
    for(int index=0; index < actor.length; index++){ // 0 ~ 4
      System.out.println(actor[index]);
    }
  }
}

public class MovieUse {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Movie movie = new Movie();
    movie.print("��Ʈ��");
    movie.print("��Ʈ��", "�׼�/�ڹ�");
    movie.print("��Ʈ��", "�׼�/�ڹ�", 120);
 
    String[] actor = new String[5];
    actor[0] = "������";
    actor[1] = "������";
    actor[2] = "������";
    actor[3] = "���޼�";
    actor[4] = "������";
    
    movie.print(actor);
  }

}
