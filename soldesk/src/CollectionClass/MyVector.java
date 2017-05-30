package CollectionClass;

import java.util.*;

public class MyVector {
	protected Object[] data = null;	// 객체를 담기 위한 객체 배열 선언
	protected int capacity = 0;		// 용량
	protected int size = 0;				// 객체배열에 저장된 객체의 개수 
	
	public MyVector(){
		this(10);
	}
	
	public MyVector(int capacity){
		if(capacity<0)
			throw new IllegalArgumentException("유효하지 않은 값입니다. : "+capacity);
		this.capacity = capacity;
		data = new Object[capacity];
	}
	
	// MyVector가 비어있는지 확인
	public boolean isEmpty(){
		return size == 0;
	}
	
	public int capacity(){
		return capacity;
	}
	
	public int size(){
		return size;
	}
	
	// 객체 배열이 최소한 지정된 용량을 확보하도록 하는 기능
	public void ensureCapacity(int minCapacity){
		int newCapacity = capacity;
		
		if(minCapacity > capacity){
			newCapacity = capacity*2;
		}
		
		if(minCapacity>newCapacity){
			newCapacity = minCapacity;
		}
		
		setCapacity(newCapacity);
	}
	
	//객체 배열의 용량을 지정된 용량으로 변경
	public void setCapacity(int newCapacity){
		if(this.capacity==newCapacity) return;
		
		Object[] tmp = new Object[newCapacity];
		System.out.println("메모리가 확보되었습니다.");
		System.arraycopy(data, 0, tmp, 0, size);
		this.data = tmp;
		this.capacity = newCapacity;
	}
	
	//객체배열에 객채를 저장
	public boolean add(Object obj){
		ensureCapacity(size+1);
		data[size++]= obj;
		
		return true;
	}
	
	//객체 배열에 저장된, index번째의 객체 반환
	public Object get(int index){
		if(index<0 || index>=size)
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
		
		return data[index];
	}
	
	//객체 배열의 index번쨰의 위치에 객체를 저장하고. 기존의 객체 반환
	public Object set(int index, Object obj){
		if(index>=size)
			throw new ArrayIndexOutOfBoundsException(index);
		
		Object oldValue = data[index];
		data[index] = obj;
		
		return oldValue;
	}
	
	//지정된 객체를 지정한 위치에서 찾기: 객체배열에 값이 없으면 -1을 반환
	public int indexOf(Object obj, int index){
		if(obj==null){
			for(int i=index;i<size;i++){
				if(data[i]==null)
					return i;
			}
		}else {
			for(int i=index;i<size;i++){
				if(obj.equals(data[i]))
					return i;
			}
		}
		
		return -1;
	}
	
	//지정된 객체를 지정한 위치에서 찾기: 객체배열에 값이 없으면 -1을 반환(뒤에서부터 검색)
	public int lastIndexOf(Object obj, int index){
		if(index>=size)
			throw new IndexOutOfBoundsException(index+">="+size);
		
		if(obj==null){
			for(int i=index;i>=0;i--){
				if(data[i]==null)
					return i;
			}
		}else {
			for(int i=index;i>=0;i--){
				if(obj.equals(data[i]))
					return i;
			}
		}
		
		return -1;
	}
	
	
	// 지정된 객체가 객체배열에 존재하는지 확인
	public boolean contains(Object obj){
		
		return indexOf(obj, 0)>=0;
	}
	
	public int indexOf(Object obj){
		
		return indexOf(obj, 0);
	}
	
	public int lastIndeOf(Object obj){
		return lastIndexOf(obj, size-1);
	}
	
	// 객체배열에서 index번째에 있는 객체 삭제
	public Object remove(int index){
		Object oldObj = null;
		
		if(index<0 || index>=size){
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
		}
		
		oldObj = data[index];
		
		// 삭제하고자 하는 객체가 마지막 객체가 아니라면 배열 복사를 통해 빈자리를
		// 채워주워야 한다.
		if(index !=size-1){
			System.arraycopy(data, index+1, data, index, size-index-1);
		}
		
		data[size-1] = null;
		size--;
		
		return oldObj;
		
	}
	
	// 객체배열에서 index번째에 있는 객체 삭제
	public boolean remove(Object obj){
		for(int i=0;i<size;i++){
			if(obj.equals(data[i])){
				remove(i);
				return true;
			}
		}
		
		return false;
	}
	
	//객체 배열 비우기
	public void clear(){
		for(int i=0;i<size;i++)
			data[i] = null;
		
		size = 0;
	}
	
	//객체 배열 복사 반환
	public Object[] toArray(){
		Object[] result = new Object[size];
		System.arraycopy(data, 0, result, 0, size);
		
		return result;
	}
	
	//객체 배열에 저장된 모든 객체를 출력
	public String toString(){
		StringBuffer sb = new StringBuffer(100);
		
		sb.append("[");
		
		for(int i=0;i<size;i++){
			if(i!=0)
				sb.append(",");
			sb.append(get(i).toString());
		}
		
		sb.append("]");
		
		return sb.toString();
	}
}













