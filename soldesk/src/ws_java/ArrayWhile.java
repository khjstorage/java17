package ws_java;

public class ArrayWhile {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String[] movies = new String[6];
    movies[0] = "���������";
    movies[1] = "�׷���Ƽ";
    movies[2] = "������ ����� ������ �ȴ�.";
    movies[3] = "���ͽ��ڶ�";
    movies[4] = "�̹����̼� ����";
    movies[5] = "�ϻ�";
 
    int index = 0;
    while(true){
      System.out.println(movies[index]);
      index++;
      if (index == 6){
        break;      
      }
    }
    
    System.out.println("--> �迭�� ũ��: " + movies.length);
  }

}
