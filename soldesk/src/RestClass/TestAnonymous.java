package RestClass;

import java.awt.*;
import java.awt.event.*;

//import java.awt.Button;
//import java.awt.Frame;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;

public class TestAnonymous extends Frame{
	public TestAnonymous(){
		super("�͸�Ŭ������ ����");
		
		Button btn = new Button("Ŭ��~!!!!");
		add(btn);
		setSize(300,300);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestAnonymous();
	}

}
