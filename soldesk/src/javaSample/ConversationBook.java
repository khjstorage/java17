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
		System.out.println("��ǰ ID >> "+getID());
		System.out.println("��ǰ ���� >> "+explanation);
		System.out.println("������ >> "+producer);
		System.out.println("���� >> "+price);
		System.out.println("ISBN >> "+ISBN);
		System.out.println("å ���� >> "+bookTitle);
		System.out.println("���� >> "+author);
		System.out.println("��� >> "+conversationLanguage);
	}
}



