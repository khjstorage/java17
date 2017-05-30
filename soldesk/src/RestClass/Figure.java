package RestClass;

class Figure extends DObject {
	String type;
	
	Figure(){
		type = "";
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		switch(type){
		case "Line":
			System.out.println("Line\n");
			break;
		case "Rect":
			System.out.println("Rect\n");
			break;
		case "Circle":
			System.out.println("Circle\n");
			break;
		default:
			System.out.println("");
		}
	}

}


