package javaSample;

public class CompactDics extends Product {
	String albumTitle;
	String artist;
	
	public CompactDics(){
		this.albumTitle = null;
		this.artist = null;
	}

	public String getAlbumTitle() {
		return albumTitle;
	}

	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	void getCompactDiscInfo(){
		System.out.println("��ǰ ID >> "+getID());
		System.out.println("��ǰ ���� >> "+explanation);
		System.out.println("������ >> "+producer);
		System.out.println("���� >> "+price);
		System.out.println("�ٹ� ���� >> "+albumTitle);
		System.out.println("���� >> "+artist);
	}
}
