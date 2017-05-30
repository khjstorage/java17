package RestClass;

public class StringStack implements Stack {
	Object stack;
	
	public StringStack(){
		this.stack ="";
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return stack.toString().length();
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		return stack;
	}

	@Override
	public boolean push(Object obj) {
		// TODO Auto-generated method stub
		this.stack = obj;
		
		if(this.stack.equals(""))
			return false;
		else
			return true;
	}

}
