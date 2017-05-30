package CollectionClass;

public class Developer {
	private String skill;
	private int carri;
	
	public Developer(String skill, int carri){
		this.skill = skill;
		this.carri = carri;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public int getCarri() {
		return carri;
	}

	public void setCarri(int carri) {
		this.carri = carri;
	}
	
	@Override
	public String toString(){
		return getSkill() + "::" +getCarri();
	}
}






