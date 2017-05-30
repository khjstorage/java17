package javaSample;

class Student {
	String name = "";
	int classNo = 0;
	int studentNo = 0;
	int korScore = 0;
	int mathScore = 0;
	int engScore = 0;
	int total = 0;
	
	public Student(String name, int classNo, int studentNo, int korScore, int mathScore, int engScore) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.classNo = classNo;
		this.studentNo = studentNo;
		this.korScore = korScore;
		this.mathScore = mathScore;
		this.engScore = engScore;
		
		total = korScore+mathScore+engScore;
	}
	
	public String toString(){
		return name + "\t"
				+ classNo + "\t"
				+ studentNo + "\t"
				+ korScore + "\t"
				+ mathScore + "\t"
				+ engScore + "\t"
				+ total + "\t";
	}
}





