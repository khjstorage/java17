package CollectionClass;

import java.util.*;

public class MapPutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Map<String, String> map = new HashMap<String, String>();
			map.put("A", "1");
			map.put("B", "2");
			map.put("C", "3");
			
			// �̹� Ű�� ��ϵǾ� �ִ� ��� �����.
			map.put("A", "5");
			System.out.println(map);
		}
		
		{
			Map<String, String> map = new HashMap<String, String>();
			map.put("A", "1");
			
			// �̹� Ű�� ��ϵǾ� �ִ� ���� �ƹ��͵� �� ��.
			map.putIfAbsent("A", "VB");
			System.out.println(map);
			
			map.putIfAbsent("B", "2");
			System.out.println("Ű�� �̹� ���� ��� : "+map);
		}
		
		{
			Map<String, String> map = new HashMap<String, String>();
			map.put("A", "VB");
			map.put("B", "VBScript");
			
			// A�� ���� Java�� ���
			map.replace("A", "Java");
			System.out.println("A�� ���� ��� ��� : "+map);
			
			// B���� VBScript�� ��쿡�� JavaScript�� ���
			boolean isReplaced = map.replace("B", "VBScript","JavaScript");
			System.out.println("�ٲ� ����� : "+ isReplaced +" / "+map);
			
			//Map�� ��� ����� ���� �빮�ڷ� ��ȯ
			map.replaceAll( (key, value) -> key.toString());
			System.out.println("�빮�ڷ� �ٲ� ��� : "+map);
		}
		
		// ���ٽ��� ��ȯ ���� Map�� �߰�
		{
			Map<String, String> map = new HashMap<String, String>();
			map.put("A", "1");
			
			map.compute("B", (key, existValue) -> {
				if(existValue !=null){
					return existValue;
				}else{
					return "Nothing";
				}
			});
			
			System.out.println(map);
			
			// Ű�� �������� �ʴ� ��쿡�� ���ٽ��� ��ȯ���� Map�� �߰�
			map.computeIfAbsent("B", (key) -> key + " does not exist");
			map.computeIfAbsent("C", (key) -> key + " does not exist");
			
			System.out.println("computeIfAbsent : "+map);
			
			// Ű�� �����ϴ� ��� ���ٽ��� ��ȯ������ ���� ��
			map.computeIfPresent("B", (key, existValue) -> key +" is "+existValue);
			System.out.println("computeIfPresent : "+map);
		}
		
		//merge() ���
		{
			Map<String, String> map = new HashMap<String, String>();
			map.put("A", "good");
			
			// ������ Ű�� �����ϰ� �Ǹ� ��� ���� ����� ������
			// Ű�� �������� ������ ������ ������ entry�� �߰� �ȴ�.
			map.merge("A", "Java", (oldValue, newValue) -> newValue+" is "+oldValue);
			map.merge("B", "Java", (oldValue, newValue) -> newValue+" is "+oldValue);
			System.out.println("merge�� ��� : "+map);
			
		}
	}

}












