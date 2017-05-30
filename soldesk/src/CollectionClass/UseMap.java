package CollectionClass;

import java.util.*;

public class UseMap {
	public void useHashTable(){
		Hashtable<String, String> map = new Hashtable<String, String>();
		
		map.put("A", "세심하다. 친절하다.");
		map.put("B", "성질더럽다.");
		map.put("AB", "이상하다.");
		map.put("O", "우유부단하다.");
		
		System.out.println("크기 : "+map.size()+" / "+map);
		map.put("A", "소심하다.");
		System.out.println("크기 : "+map.size()+" / "+map);
		
		String booleanType = "a";
		String value = map.get(booleanType.toUpperCase());
		
		if(value !=null){
			System.out.println(booleanType+"형의 특징은 "+value);
		}else{
			System.out.println(booleanType+"형은 사람의 것이 아닙니다.");
		}
		
		map.remove("B");
		System.out.println(map);
	}
	
	public void useHashMap(){
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("장유유서", "노인공경");
		map.put("고진감래", "고생끝에 낙이온다.");
		map.put("필사즉생", "죽으려 하면 살것이다.");
		map.put("낙장불입", "한번 낸 패는 되돌릴 수 없다.");
		map.put("일석이조", "죽으려 하면 살것이다.");
		map.put("개과천선", "더 좋은 모습으로 찾아뵙겠습니다.");
		map.put("토사구팽", "토끼사냥이 끝나면 사냥개가 필요없다.");
		
		System.out.println("크기 : "+map.size()+" / "+map);
		String key = "필사생";
		String value = map.get(key);
		
		if(value != null){
			System.out.println(key+"의 뜻은 "+value);
		}else
			System.out.println(key+"의 뜻은 준비되지 않았습니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseMap um = new UseMap();
		um.useHashTable();
		System.out.println("================================");
		um.useHashMap();
	}

}












