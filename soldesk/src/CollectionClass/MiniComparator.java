package CollectionClass;

import java.util.Comparator;

public class MiniComparator implements Comparator<MiniVo> {

	@Override
	public int compare(MiniVo first, MiniVo second) {
		// TODO Auto-generated method stub
		double firstValue = Double.parseDouble(first.getVolume());
		double secondValue = Double.parseDouble(second.getVolume());
		
		if(firstValue>secondValue){
			return -1;
		}else if(firstValue<secondValue){
			return 1;
		}else{
			return 0;
		}
	}

}
