package javaSample;

public class ConversationBook extends Book {
	String conversationLanguage;
	
	public ConversationBook(){
		this.conversationLanguage = null;
	}

	public String getConversationLanguage() {
		return conversationLanguage;
	}

	public void setConversationLanguage(String conversationLanguage) {
		this.conversationLanguage = conversationLanguage;
	}
	
	void getConversationBookInfo(){
		System.out.println("상품 ID >> "+getID());
		System.out.println("상품 설명 >> "+explanation);
		System.out.println("생산자 >> "+producer);
		System.out.println("가격 >> "+price);
		System.out.println("ISBN >> "+ISBN);
		System.out.println("책 제목 >> "+bookTitle);
		System.out.println("저자 >> "+author);
		System.out.println("언어 >> "+conversationLanguage);
	}
}



