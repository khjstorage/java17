package CollectionClass;

import java.util.*;

public class UseMap {
	public void useHashTable(){
		Hashtable<String, String> map = new Hashtable<String, String>();
		
		map.put("A", "�����ϴ�. ģ���ϴ�.");
		map.put("B", "����������.");
		map.put("AB", "�̻��ϴ�.");
		map.put("O", "�����δ��ϴ�.");
		
		System.out.println("ũ�� : "+map.size()+" / "+map);
		map.put("A", "�ҽ��ϴ�.");
		System.out.println("ũ�� : "+map.size()+" / "+map);
		
		String booleanType = "a";
		String value = map.get(booleanType.toUpperCase());
		
		if(value !=null){
			System.out.println(booleanType+"���� Ư¡�� "+value);
		}else{
			System.out.println(booleanType+"���� ����� ���� �ƴմϴ�.");
		}
		
		map.remove("B");
		System.out.println(map);
	}
	
	public void useHashMap(){
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("��������", "���ΰ���");
		map.put("��������", "������� ���̿´�.");
		map.put("�ʻ����", "������ �ϸ� ����̴�.");
		map.put("�������", "�ѹ� �� �д� �ǵ��� �� ����.");
		map.put("�ϼ�����", "������ �ϸ� ����̴�.");
		map.put("����õ��", "�� ���� ������� ã�ƺ˰ڽ��ϴ�.");
		map.put("��籸��", "�䳢����� ������ ��ɰ��� �ʿ����.");
		
		System.out.println("ũ�� : "+map.size()+" / "+map);
		String key = "�ʻ��";
		String value = map.get(key);
		
		if(value != null){
			System.out.println(key+"�� ���� "+value);
		}else
			System.out.println(key+"�� ���� �غ���� �ʾҽ��ϴ�.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseMap um = new UseMap();
		um.useHashTable();
		System.out.println("================================");
		um.useHashMap();
	}

}












