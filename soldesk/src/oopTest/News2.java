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
		DecimalFormat df = new DecimalFormat("#,###,### ��");
		
		System.out.println("����: "+title);
		System.out.println("��ȸ��: "+view);
		System.out.println("�̵��: "+media);
		System.out.println("�Աݾ�: "+df.format(input));
	}
	
}





