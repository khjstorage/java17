package RestClass;

class Door implements OpenCloseIf, PaintIf {

	@Override
	public void Red() {
		// TODO Auto-generated method stub
		System.out.println("Paint the door red");
	}

	@Override
	public void Blue() {
		// TODO Auto-generated method stub
		System.out.println("Paint the door blue");
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Door Open");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Door Close");
	}

}
