package CollectionClass;

import java.util.*;

public class IteratorTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> movie = new HashSet<String>();
		
		movie.add("���");
		movie.add("������ ����");
		movie.add("�ܿ�ձ�");
		movie.add("��ũ ����Ʈ");
		movie.add("�ظ�����");
		movie.add("������ ��");
		
		Iterator<String> itr = movie.iterator();
		
		while(itr.hasNext()){
			String s = itr.next();
			System.out.println(s);
		}
	}

}







