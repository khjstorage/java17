package oopTest;

class FieldTest{
  // �ʵ�(����) 3�� ����
  String level1;
  String level2;
  String level3;
}

public class FieldUse {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    FieldTest field = new FieldTest(); // ��ü ����
    field.level1 = "��ü����";
    field.level2 = "�����α׷�";
    field.level3 = "���������ӿ�ũ";
    
    System.out.println(field.level1);
    System.out.println(field.level2);
    System.out.println(field.level3);
  }

}
