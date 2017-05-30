package CollectionClass;

import java.util.*;
import java.util.function.*;

public class LambdaTest {
	public static void printAll(List<Developer> list){
		list.forEach(System.out::println);   // list.forEach((x) -> System.out::println(x));
	}
	
	public static void printDevOrderBySkill(List<Developer> list){
		Collections.sort(list, (Developer d1, Developer d2)->d1.getSkill().compareTo(d2.getSkill()) );
		list.forEach(System.out::println);
	}
	
	public static int sumAll(List<Integer> numbers, Predicate<Integer> list){
		int total =0;
		
		for(int number : numbers){
			if(list.test(number))
			{
				total +=number;
			}
		}
		
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//thread ����, �������
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("oraclejava community thread1.....");
			}
		}).start();
		
		// ���ٽ� ���
		new Thread( () -> System.out.println("oraclejava community thread2.....")).start();
		
		List<Integer> list = Arrays.asList(1, 8, 3, 9, 4, 7);
		int sum1 = sumAll(list, n->true);			// ��� �� 32�� ����
		int sum2 = sumAll(list, n->n%2==0);	// ¦���� �� 12�� ����
		int sum3 = sumAll(list, n-> n>5);		// 5���� ū ������ 24�� ����
		
		//���� ���
		list.forEach(System.out::println);
		System.out.println("sum1 = "+sum1);
		System.out.println("sum2 = "+sum2);
		System.out.println("sum3 = "+sum3);
		System.out.println("------------------------------");
		
		List<Developer> dev = new ArrayList<Developer>();
		dev.add(new Developer("JAVA", 10));
		dev.add(new Developer("ORACLE", 15));
		dev.add(new Developer("C#", 7));
		dev.add(new Developer("ANDROID", 5));
		printAll(dev);
		System.out.println("------------------------------");
		printDevOrderBySkill(dev);
	}

}







