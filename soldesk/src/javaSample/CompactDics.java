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
		System.out.println("상품 ID >> "+getID());
		System.out.println("상품 설명 >> "+explanation);
		System.out.println("생산자 >> "+producer);
		System.out.println("가격 >> "+price);
		System.out.println("앨범 제목 >> "+albumTitle);
		System.out.println("가수 >> "+artist);
	}
}
