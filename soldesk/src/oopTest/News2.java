package oopTest;

import java.text.DecimalFormat;

class News2 {
	private String title;
	private int view;
	private String media;
	private int input;
	
	private News2(){}
	
	private News2(String title, int view, String media, int input){
		this.title = title;
		this.view = view;
		this.media = media;
		this.input = input;
	}
	
	public static News2 getInstance(String title, int view, String media)
	{
		int input = view *200;
		
		if(input < 300000){
			input = 300000;
		}
		
		News2 news = new News2(title, view, media, input);
		
		return news;
	}
	
	public void print(){
		DecimalFormat df = new DecimalFormat("#,###,### 원");
		
		System.out.println("제목: "+title);
		System.out.println("조회수: "+view);
		System.out.println("미디어: "+media);
		System.out.println("입금액: "+df.format(input));
	}
	
}





