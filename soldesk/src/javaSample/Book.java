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
		System.out.println("��ǰ ID >> "+getID());
		System.out.println("��ǰ ���� >> "+explanation);
		System.out.println("������ >> "+producer);
		System.out.println("���� >> "+price);
		System.out.println("ISBN >> "+ISBN);
		System.out.println("å ���� >> "+bookTitle);
		System.out.println("���� >> "+author);
	}
}








