package CollectionClass;

public class Man implements Comparable<Man> {
	private String name;
	private int age;
	
	public Man(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return name+" (age : "+age+")";
	}

	@Override
	public int compareTo(Man man) {
		// TODO Auto-generated method stub
		if(this.age<man.age){
			return -1;
		}else if(this.age==man.age){
			return 0;
		}else
		{
			return 1;
		}
	}

}






