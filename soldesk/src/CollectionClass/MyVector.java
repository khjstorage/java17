package CollectionClass;

import java.util.*;

public class MyVector {
	protected Object[] data = null;	// ��ü�� ��� ���� ��ü �迭 ����
	protected int capacity = 0;		// �뷮
	protected int size = 0;				// ��ü�迭�� ����� ��ü�� ���� 
	
	public MyVector(){
		this(10);
	}
	
	public MyVector(int capacity){
		if(capacity<0)
			throw new IllegalArgumentException("��ȿ���� ���� ���Դϴ�. : "+capacity);
		this.capacity = capacity;
		data = new Object[capacity];
	}
	
	// MyVector�� ����ִ��� Ȯ��
	public boolean isEmpty(){
		return size == 0;
	}
	
	public int capacity(){
		return capacity;
	}
	
	public int size(){
		return size;
	}
	
	// ��ü �迭�� �ּ��� ������ �뷮�� Ȯ���ϵ��� �ϴ� ���
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
	
	//��ü �迭�� �뷮�� ������ �뷮���� ����
	public void setCapacity(int newCapacity){
		if(this.capacity==newCapacity) return;
		
		Object[] tmp = new Object[newCapacity];
		System.out.println("�޸𸮰� Ȯ���Ǿ����ϴ�.");
		System.arraycopy(data, 0, tmp, 0, size);
		this.data = tmp;
		this.capacity = newCapacity;
	}
	
	//��ü�迭�� ��ä�� ����
	public boolean add(Object obj){
		ensureCapacity(size+1);
		data[size++]= obj;
		
		return true;
	}
	
	//��ü �迭�� �����, index��°�� ��ü ��ȯ
	public Object get(int index){
		if(index<0 || index>=size)
			throw new IndexOutOfBoundsException("������ ������ϴ�.");
		
		return data[index];
	}
	
	//��ü �迭�� index������ ��ġ�� ��ü�� �����ϰ�. ������ ��ü ��ȯ
	public Object set(int index, Object obj){
		if(index>=size)
			throw new ArrayIndexOutOfBoundsException(index);
		
		Object oldValue = data[index];
		data[index] = obj;
		
		return oldValue;
	}
	
	//������ ��ü�� ������ ��ġ���� ã��: ��ü�迭�� ���� ������ -1�� ��ȯ
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
	
	//������ ��ü�� ������ ��ġ���� ã��: ��ü�迭�� ���� ������ -1�� ��ȯ(�ڿ������� �˻�)
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
	
	
	// ������ ��ü�� ��ü�迭�� �����ϴ��� Ȯ��
	public boolean contains(Object obj){
		
		return indexOf(obj, 0)>=0;
	}
	
	public int indexOf(Object obj){
		
		return indexOf(obj, 0);
	}
	
	public int lastIndeOf(Object obj){
		return lastIndexOf(obj, size-1);
	}
	
	// ��ü�迭���� index��°�� �ִ� ��ü ����
	public Object remove(int index){
		Object oldObj = null;
		
		if(index<0 || index>=size){
			throw new IndexOutOfBoundsException("������ ������ϴ�.");
		}
		
		oldObj = data[index];
		
		// �����ϰ��� �ϴ� ��ü�� ������ ��ü�� �ƴ϶�� �迭 ���縦 ���� ���ڸ���
		// ä���ֿ��� �Ѵ�.
		if(index !=size-1){
			System.arraycopy(data, index+1, data, index, size-index-1);
		}
		
		data[size-1] = null;
		size--;
		
		return oldObj;
		
	}
	
	// ��ü�迭���� index��°�� �ִ� ��ü ����
	public boolean remove(Object obj){
		for(int i=0;i<size;i++){
			if(obj.equals(data[i])){
				remove(i);
				return true;
			}
		}
		
		return false;
	}
	
	//��ü �迭 ����
	public void clear(){
		for(int i=0;i<size;i++)
			data[i] = null;
		
		size = 0;
	}
	
	//��ü �迭 ���� ��ȯ
	public Object[] toArray(){
		Object[] result = new Object[size];
		System.arraycopy(data, 0, result, 0, size);
		
		return result;
	}
	
	//��ü �迭�� ����� ��� ��ü�� ���
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













