package IOStream;

import java.io.Serializable;

public class UserClass implements Serializable {
	private static final long serialVersionUID = 4220461820168818967L;
	String name;
	int age;
	
	public UserClass(){}
	
	public UserClass(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString(){
		return "UserClass [name="+name+", age="+age+"]";
	}
}









