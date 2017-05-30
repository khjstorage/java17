package javaSample;

import java.util.Scanner;

class ProductTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner s = new Scanner(System.in);
    Product pBook[] = new Book[10];
    Product pCom[] = new CompactDics[10];
    Product pCon[] = new ConversationBook[10];
    
    int count = 0;
    String string;
    
    for(int i=0;i<10; i++){
      pBook[i] = new Book();
      pCom[i] = new CompactDics();
      pCon[i] = new ConversationBook();
    }
    
    while(true){
      System.out.print("��ǰ�߰�(1), ��� ��ǰ ��ȸ(2), ������(3) >> ");
      int chooseList = s.nextInt();
      
      switch(chooseList){
      case 1:
        if(count == 10){
          System.out.println("�����Ͱ� ���� á���ϴ�.");
          break;
        }else{
          System.out.print("��ǰ ���� å(1), ����CD(2), ȸȭå(3) >> ");
          int chooseInsert = s.nextInt();
          
          switch(chooseInsert){
          case 1:
            pBook[count].setID(count);
            System.out.print("��ǰ ���� >> ");
            s.nextLine();
            pBook[count].explanation = s.nextLine();
            
            System.out.print("������ >> ");
            pBook[count].producer = s.nextLine();
            
            System.out.print("���� >> ");
            pBook[count].price = s.nextInt();
            
            System.out.print("å ���� >> ");
            s.nextLine();
            string = s.nextLine();
            pBook[count].setBookTitle(string);
            
            System.out.print("���� >> ");
            string = s.nextLine();
            pBook[count].setAuthor(string);
            
            System.out.print("ISBN >> ");
            int ISBN = s.nextInt();
            pBook[count].setISBN(ISBN);
            count++;
            break;
          case 2:
            pCom[count].setID(count);
            System.out.print("��ǰ ���� >> ");
            s.nextLine();
            pCom[count].explanation = s.nextLine();
            
            System.out.print("������ >> ");
            pCom[count].producer = s.nextLine();
            
            System.out.print("���� >> ");
            pCom[count].price = s.nextInt();
            
            System.out.print("�ٹ� ���� >> ");
            s.nextLine();
            string = s.nextLine();
            pCom[count].setAlbumTitle(string);
            
            System.out.print("���� >> ");
            string = s.nextLine();
            pCom[count].setArtist(string);
            count++;
            break;
          case 3:
            pCon[count].setID(count);
            System.out.print("��ǰ ���� >> ");
            s.nextLine();
            pCon[count].explanation = s.nextLine();
            
            System.out.print("������ >> ");
            pCon[count].producer = s.nextLine();
            
            System.out.print("���� >> ");
            pCon[count].price = s.nextInt();
            
            System.out.print("å ���� >> ");
            s.nextLine();
            string = s.nextLine();
            pCon[count].setBookTitle(string);
            
            System.out.print("���� >> ");
            string = s.nextLine();
            pCon[count].setAuthor(string);
            
            System.out.print("��� >> ");
            string = s.nextLine();
            pCon[count].setConversationLanguage(string);
            
            System.out.print("ISBN >> ");
            ISBN = s.nextInt();                
            pCon[count].setISBN(ISBN);
            
            count++;
            break;
          }
          System.out.println();
        }
        break;
      case 2:
        for(int i=0; i<10; i++){
          if(pBook[i].getID() == i)
            pBook[i].getBookInfo();
          else if(pCon[i].getID() == i)
            pCon[i].getConversationBookInfo();
          else if(pCom[i].getID() == i)
            pCom[i].getCompactDiscInfo();
        }//for ��
        
        break;
      case 3:
        System.exit(0);
      }
    }
    
  } 

}
