package CollectionClass;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetAddAllTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1 = new HashSet<String>();
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("D");
		
		Set<String> set2 = new HashSet<String>();
		set2.add("E");
		set2.add("F");
		
		set1.addAll(set2);
		System.out.println(set1);
		
		Set<String> set = new HashSet<String>();
		set.add("±Ë");
		set.add("¿Ã");
		set.add("¿±");
		set.add("∞≠");
		
		set.add("¿±");
		System.out.println(set.size() + " / "+set);
		
		set.remove("±Ë");
		System.out.println(set.size() + " / " +set);
		
		Iterator<String> ita = set.iterator();
		
		while(ita.hasNext()){
			System.out.println(ita.next());
		}
	}

}









