package javaSample;

public class Book extends Product{
	int ISBN;
	String author;
	String bookTitle;
	
	public Book(){
		this.ISBN = -1;
		this.author = null;
		this.bookTitle = null;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	void getBookInfo(){
		System.out.println("상품 ID >> "+getID());
		System.out.println("상품 설명 >> "+explanation);
		System.out.println("생산자 >> "+producer);
		System.out.println("가격 >> "+price);
		System.out.println("ISBN >> "+ISBN);
		System.out.println("책 제목 >> "+bookTitle);
		System.out.println("저자 >> "+author);
	}
}








