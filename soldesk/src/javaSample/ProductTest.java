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
      System.out.print("상품추가(1), 모든 상품 조회(2), 끝내기(3) >> ");
      int chooseList = s.nextInt();
      
      switch(chooseList){
      case 1:
        if(count == 10){
          System.out.println("데이터가 가득 찼습니다.");
          break;
        }else{
          System.out.print("상품 종류 책(1), 음악CD(2), 회화책(3) >> ");
          int chooseInsert = s.nextInt();
          
          switch(chooseInsert){
          case 1:
            pBook[count].setID(count);
            System.out.print("상품 설명 >> ");
            s.nextLine();
            pBook[count].explanation = s.nextLine();
            
            System.out.print("생산자 >> ");
            pBook[count].producer = s.nextLine();
            
            System.out.print("가격 >> ");
            pBook[count].price = s.nextInt();
            
            System.out.print("책 제목 >> ");
            s.nextLine();
            string = s.nextLine();
            pBook[count].setBookTitle(string);
            
            System.out.print("저자 >> ");
            string = s.nextLine();
            pBook[count].setAuthor(string);
            
            System.out.print("ISBN >> ");
            int ISBN = s.nextInt();
            pBook[count].setISBN(ISBN);
            count++;
            break;
          case 2:
            pCom[count].setID(count);
            System.out.print("상품 설명 >> ");
            s.nextLine();
            pCom[count].explanation = s.nextLine();
            
            System.out.print("생산자 >> ");
            pCom[count].producer = s.nextLine();
            
            System.out.print("가격 >> ");
            pCom[count].price = s.nextInt();
            
            System.out.print("앨범 제목 >> ");
            s.nextLine();
            string = s.nextLine();
            pCom[count].setAlbumTitle(string);
            
            System.out.print("가수 >> ");
            string = s.nextLine();
            pCom[count].setArtist(string);
            count++;
            break;
          case 3:
            pCon[count].setID(count);
            System.out.print("상품 설명 >> ");
            s.nextLine();
            pCon[count].explanation = s.nextLine();
            
            System.out.print("생산자 >> ");
            pCon[count].producer = s.nextLine();
            
            System.out.print("가격 >> ");
            pCon[count].price = s.nextInt();
            
            System.out.print("책 제목 >> ");
            s.nextLine();
            string = s.nextLine();
            pCon[count].setBookTitle(string);
            
            System.out.print("저자 >> ");
            string = s.nextLine();
            pCon[count].setAuthor(string);
            
            System.out.print("언어 >> ");
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
        }//for 끝
        
        break;
      case 3:
        System.exit(0);
      }
    }
    
  } 

}
