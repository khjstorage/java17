package TextEdit;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

public class DemoNote extends JFrame {
	//������� ����
	JTextArea text;
	Container pane;
	JMenuBar nb = new JMenuBar();
	JMenu file, help;
	JMenuItem new1, open1, save1, close1, help1;
	JFileChooser open = new JFileChooser();
	
	public DemoNote(){
		super("MemoNote");
		pane = getContentPane();
		pane.setLayout(new BorderLayout());
		setJMenuBar(nb); // �޴��� ����
		
		// �޴� �� �޴� ������ ����
		file = new JMenu("����(F)");
		help = new JMenu("����(I)");
		
		// Ű���� �����ȣ ����
		file.setMnemonic('F');
		help.setMnemonic('I');
		
		//���� �޴� ���� ����
		new1 = new JMenuItem("������");
		open1 = new JMenuItem("����");
		save1 = new JMenuItem("����");
		close1 = new JMenuItem("�ݱ�");
		
		// �޴� ����Ű�� ���� �۾�
		new1.setAccelerator(KeyStroke.getKeyStroke('N', Event.CTRL_MASK));	 // CTRL+N
		open1.setAccelerator(KeyStroke.getKeyStroke('O', Event.CTRL_MASK));	 // CTRL+O
		save1.setAccelerator(KeyStroke.getKeyStroke('S', Event.CTRL_MASK));	 // CTRL+S
		close1.setAccelerator(KeyStroke.getKeyStroke('Q', Event.CTRL_MASK));	 // CTRL+Q
		
		// ���� �޴� ����
		help1 = new JMenuItem("����");
		help1.setAccelerator(KeyStroke.getKeyStroke('R', Event.CTRL_MASK));   // CTRL+R
		
		// �����޴��� �޴� �׸�� ���̱�
		file.add(new1);
		file.add(open1);
		file.add(save1);
		file.add(close1);
		help.add(help1);
		
		//�޴��ٿ� �����޴� ���̱�
		nb.add(file);
		nb.add(help);
		
		// text box �����
		text = new JTextArea();
		text.setCaretColor(Color.black);
		text.setSelectedTextColor(Color.white);
		text.setSelectionColor(Color.blue);
		text.setBackground(Color.white);
		
		pane.add(new JScrollPane(text));
		
		// �޴����� ������ �޴��� Ŭ������ �� �߻��Ǵ� �̺�Ʈ ó��
		new1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text.setText("");
			}
		});
		
		// �޴����� ���⸦ Ŭ������ �� �̺�Ʈ ó��
		open1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int re = open.showOpenDialog(DemoNote.this);
				
				if(re==JFileChooser.APPROVE_OPTION){
					File file_open = open.getSelectedFile();		// ���õ� ���ϸ��� �����´�.
					
					FileInputStream fis;			// ���� �ý����� ���� �Է� ����Ʈ ��� ��Ʈ�� Ŭ���� ����
					ByteArrayOutputStream bo;
					try{
						fis = new FileInputStream(file_open);
						bo = new ByteArrayOutputStream();
						int i =0;
						
						while( (i = fis.read()) != -1 ){
							bo.write(i);
						}
						text.setText(bo.toString());
						fis.close();
						bo.close();
					}catch(FileNotFoundException fe){				
					}catch(IOException ie){
						
					}
				}
			}
		});
		
		// �޴����� ������ Ŭ������ �� �̺�Ʈ ó��
		save1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int re = open.showSaveDialog(DemoNote.this);
				
				if(re == JFileChooser.APPROVE_OPTION){
					File file_save = open.getSelectedFile();		// ������ ���ϸ� ��������
					
					try{
						PrintWriter pw = new PrintWriter(
								new BufferedWriter(new FileWriter(file_save)));
						pw.write(text.getText());
						pw.close();
						text.setText("");
					}catch(FileNotFoundException ie){} catch(IOException fe){}
				}
			}
		});
		
		// �ݱ� �޴� �̺�Ʈ ó��
		close1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
				System.exit(0);
			}
		});
		
		// ���� �޴� �̺�Ʈ ó��
		help1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(pane, "Demo Note 1.0 version");
			}
		});
		
	}// DemoNote ������ �޼��� ��

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoNote note = new DemoNote();
		note.setSize(500, 400);
		note.setVisible(true);
	}

}











