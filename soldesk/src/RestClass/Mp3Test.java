package RestClass;

class Mp3Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardMP3 am = new AcompanyMP3();
		StandardMP3 bm = new BcompanyMP3();
		
		System.out.println("----- A�� ��ǰ�׽�Ʈ -----");
		am.playMp3();
		am.listenFM();
		System.out.println("----- B�� ��ǰ�׽�Ʈ -----");
		bm.playMp3();
		bm.listenFM();
	}

}
