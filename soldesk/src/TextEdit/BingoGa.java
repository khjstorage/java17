package TextEdit;

import java.awt.*; 
import java.awt.event.*; 

public class BingoGa extends Frame {
  final int SIZE = 5;  // �������� ũ��
  int bingoCnt = 0;  // �ϼ��� ������ ��

  Button[] btnArr = null; 
  boolean[][] bArr = new boolean[SIZE][SIZE]; // ������ üũ���� Ȯ���� ���� �迭

   // ������ ��ư�� ����� ���ڿ�, �������� ũ�⿡ ���� �̵��� �Ϻθ� ���� �� �ִ�.
  String[] values = { 
        "�۽�","��η�","������","������ǥ","���", 
        "������","�����","�аԺ���","�׶��ָ�","�ٹ�", 
        "��Ŭ����","�鰳","�𺧷�","����","���", 
        "��������","������","����û��","��õ��","���", 
        "���Ƿ�","������","��","����","����", 
        "���ȣ","�����","������","���̽�","����", 
        "���̳���","����Ŭ��","���ִ�","�������","������", 
        "������","����","����","ī��","Ĳ��", 
        "�¿�","��Ƽ��","�丣�Ҹ�","��ǳ","�ͺ�����", 
        "��ũ�Ҵ�","�ϴ���","�Ϸ�","�Ѱ���","�淹����", 
        "ȭ����","���" 
  };
  
  public BingoGa() {
    // TODO Auto-generated constructor stub
   
    this("Bingo Game"); 
  } 

  BingoGa(String title) { 
    super(title); 

    setLayout(new GridLayout(SIZE, SIZE));
    
    btnArr = new Button[SIZE*SIZE];
    MyEventHandler handler = new MyEventHandler();
    addWindowListener(handler);
    
    shuffle();		// ���ڿ� �迭�� ���� �۾�
    
    // Frame�� ��ư �߰�
    for(int i=0;i<SIZE*SIZE;i++){
    	btnArr[i] = new Button(values[i]);
    	add(btnArr[i]);
    	btnArr[i].addActionListener(handler);
    }
    
    setBounds(500, 200, 300, 300);  // x:500, y:200 ũ�� : 300*300
    setVisible(true);
  }
  
  // �������� ��ư�� ���� ���ڿ� �迭���� ����Ǿ��ִ� values�� ���ڿ����� ���´�.
  void shuffle(){
	  for(int i=0;i<values.length*2;i++){
		  int r1 = (int)(Math.random()*values.length);
		  int r2 = (int)(Math.random()*values.length);
		  
		  String tmp = values[r1];
		  values[r1] =values[r2];
		  values[r2] = tmp;
	  }
  }
  
  // 2���� �迭 bArr�� ����ϴ� ���
  void print(){
	  for(int i=0;i<bArr.length;i++){
		  for(int j=0;j<bArr.length;j++){
			  System.out.print(bArr[i][j] ? "O":"X");
		  }
		  System.out.println();
	  }
	  System.out.println("-----------------------------");
  }
  
  // ���� �������� �ϼ��� �Ǹ� �ϼ��� ������ ������� ����
  boolean checkBingo(){
	  bingoCnt = 0;
	  int garoCnt = 0;		// �������� 0���� ����
	  int seroCnt = 0;		// �������� 0���� ����
	  int crossCnt1 = 0;		// �밢���� 0���� ����
	  int crossCnt2 = 0;		// ���밢�� 0���� ����
	  
	  // ���� �������� �ϼ��� �Ǹ� �ϼ��� ������ ������� ǥ��
	  for(int i = 0;i<SIZE;i++){
		  garoCnt =0;
		  seroCnt = 0;
		  
		  for(int j=0;j<SIZE;j++){
			  if(bArr[i][j]){
				  garoCnt++;
				  
				  if(garoCnt==SIZE){
					  for(int a=i*SIZE, b=SIZE;a<btnArr.length&&b>0;a++,b--){
						  btnArr[a].setBackground(Color.GREEN);
					  }
				  }//if end
			  }// �������� �� ä���� �� ������� ��ư ���� ����
			  
			  // ���� �� �� ä���� �� ������� ��ư ����
			  if(bArr[j][i]){
				  seroCnt++;
				  
				  if(seroCnt==SIZE){
					  for(int a=i, b=SIZE;a<btnArr.length&&b>0;a+=SIZE, b--){
						  btnArr[a].setBackground(Color.GREEN);
					  }
				  }
			  }
			  
			  if(i==j&&bArr[i][i]) crossCnt1++;
			  if(i+j==SIZE-1&&bArr[i][j]) crossCnt2++;
		  }//for j end
		  
		  // ���밢�� ��ư ���� ����
		  if(crossCnt2 == SIZE){
			  ++bingoCnt;
			  for(int a=SIZE-1;a<btnArr.length-1;a+=(SIZE-1)){
				  btnArr[a].setBackground(Color.green);
			  }
		  }
		  
		  // �밢�� ��ư ���� ����
		  if(crossCnt1 ==SIZE){
			  ++bingoCnt;
			  for(int a=0;a<btnArr.length;a+=SIZE+1){
				  btnArr[a].setBackground(Color.GREEN);
			  }
		  }
		  
		  if(garoCnt==SIZE) ++bingoCnt;
		  if(seroCnt==SIZE) ++bingoCnt; 		  
	  }// for i end
	  
	  System.out.println(bingoCnt);
	  return bingoCnt >= SIZE;
  }
  
  class MyEventHandler extends WindowAdapter implements ActionListener{
	  public void actionPerformed(ActionEvent ae){
		  Button btn = (Button)ae.getSource();	// ���õǾ��� button ��ü���� �������� �۾�
		  
		  System.out.println(btn.getLabel());		// ������ ��ư�� �̸��� ���
		  
		  // ��ư�� ���õǾ����� ���õǾ��� ��ư�� ����� 2�����迭�� ��ġ���� '0'���� ����
		  for(int i=0;i<btnArr.length;i++){
			  if(btnArr[i]==btn){
				  bArr[i/SIZE][i%SIZE] = true;
				  break;
			  }
		  }
		  
		  btn.setBackground(Color.YELLOW);
		  print();
		  //checkBingo()
		  if(checkBingo()){
			  System.out.println("Bingo~~~ �ϼ�");
		  }
	  }
	  
	  public void windowClosing(WindowEvent e){
		  e.getWindow().setVisible(false);
		  e.getWindow().dispose();
		  System.exit(0);
	  }
  }


  public static void main(String[] args) {
    // TODO Auto-generated method stub
    BingoGa win = new BingoGa("Bingo Game Ver1.0"); 
    win.show(); 

  }

}






