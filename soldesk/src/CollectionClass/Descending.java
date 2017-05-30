package CollectionClass;

import java.util.Comparator;

public class Descending implements Comparator<Object> {

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		if(obj1 instanceof Comparable && obj2 instanceof Comparable){
			Comparable c1 = (Comparable)obj1;
			Comparable c2 = (Comparable)obj2;
			
			return c1.compareTo(c2) * -1;
		}
		
		return -1;
	}

}
