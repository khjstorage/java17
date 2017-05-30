package oopTest;

class Dev2 {
	private String name;
	private int java;
	private int web;
	private int dbms;
	private int tot;
	private int avg;
	
	Dev2(){}
	
	Dev2(String name, int java, int web, int dbms){
		this.name = name;
		this.java = java;
		this.web = web;
		this.dbms = dbms;
	}
	
	public void calc(){
		tot = java+web+dbms;
		avg = tot/3;
	}
	
	public void print(){
		System.out.println("¼º¸í: "+name);
		System.out.println("JAVA: "+java);
		System.out.println("WEB: "+web);
		System.out.println("DBMS: "+dbms);
		System.out.println("ÃÑÁ¡: "+tot);
		System.out.println("Æò±Õ: "+avg);
	}
}





