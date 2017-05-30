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
			
			// 이미 키가 등록되어 있는 경우 덮어쓴다.
			map.put("A", "5");
			System.out.println(map);
		}
		
		{
			Map<String, String> map = new HashMap<String, String>();
			map.put("A", "1");
			
			// 이미 키가 등록되어 있는 경우는 아무것도 안 함.
			map.putIfAbsent("A", "VB");
			System.out.println(map);
			
			map.putIfAbsent("B", "2");
			System.out.println("키가 이미 없는 경우 : "+map);
		}
		
		{
			Map<String, String> map = new HashMap<String, String>();
			map.put("A", "VB");
			map.put("B", "VBScript");
			
			// A의 값을 Java로 덮어씀
			map.replace("A", "Java");
			System.out.println("A의 값을 덮어쓴 경우 : "+map);
			
			// B값이 VBScript인 경우에만 JavaScript로 덮어씀
			boolean isReplaced = map.replace("B", "VBScript","JavaScript");
			System.out.println("바꾼 결과는 : "+ isReplaced +" / "+map);
			
			//Map의 모든 요소의 값을 대문자로 변환
			map.replaceAll( (key, value) -> key.toString());
			System.out.println("대문자로 바꾼 결과 : "+map);
		}
		
		// 람다식의 반환 값을 Map에 추가
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
			
			// 키가 존재하지 않는 경우에만 람다식의 반환값을 Map에 추가
			map.computeIfAbsent("B", (key) -> key + " does not exist");
			map.computeIfAbsent("C", (key) -> key + " does not exist");
			
			System.out.println("computeIfAbsent : "+map);
			
			// 키가 존재하는 경우 람다식의 반환값으로 덮어 씀
			map.computeIfPresent("B", (key, existValue) -> key +" is "+existValue);
			System.out.println("computeIfPresent : "+map);
		}
		
		//merge() 사용
		{
			Map<String, String> map = new HashMap<String, String>();
			map.put("A", "good");
			
			// 기존에 키가 존재하게 되면 결과 값을 덮어쓰게 되지만
			// 키가 존재하지 않으면 지정한 값으로 entry가 추가 된다.
			map.merge("A", "Java", (oldValue, newValue) -> newValue+" is "+oldValue);
			map.merge("B", "Java", (oldValue, newValue) -> newValue+" is "+oldValue);
			System.out.println("merge한 결과 : "+map);
			
		}
	}

}












