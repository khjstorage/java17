package ThreadTest;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Sum extends RecursiveTask<Long> {
	static final int SEQUENTIAL_THRESHOLD =5;
	int low;		// �迭�� ���� index
	int high; 		// �迭�� �� index
	int[] array;	// ��ü �迭
	
	Sum(int[] arr, int lo, int hi){
		array = arr;
		low = lo;
		high = hi;
	}

	@Override
	protected Long compute() {
		// TODO Auto-generated method stub
		if(high-low<=SEQUENTIAL_THRESHOLD){
			long sum =0;
			
			for(int i=low;i<high;++i){
				sum+=array[i];
			}
			
			return sum;
		}else{
			int mid = low+(high-low)/2;
			Sum left = new Sum(array, low, mid);
			Sum right = new Sum(array, mid, high);
			left.fork();
			long rightAns = right.compute();
			long leftAns = left.join();
			
			return leftAns + rightAns;	// ���� ���� ��� ���� ����� ����
		
		}
		
	}
	
	static long sumArray(int[] array){
		int beforeSize = ForkJoinPool.commonPool().getPoolSize();
		System.out.println("ForkJoin commoPool beforeSize="+beforeSize);
		
		long result = ForkJoinPool.commonPool().invoke(new Sum(array,0,array.length));
        
		int afterSize=ForkJoinPool.commonPool().getPoolSize();
		System.out.println("ForkJoin commonPool afterSize="+afterSize);

		return result;
	}

}










