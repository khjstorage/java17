package ExceptionTest;

class Person{
	long Id;
	
	public boolean equals(Object obj){
		if(obj!=null && obj instanceof Person)
		{
			return Id ==((Person)obj).Id;
		}else{
			return false;
		}
	}
	
	Person(long id){
		this.Id = id;
	}
}

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		if(p1==p2){
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		}else{
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");
		}
		
		if(p1.equals(p2))
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		else
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");
	}

}




