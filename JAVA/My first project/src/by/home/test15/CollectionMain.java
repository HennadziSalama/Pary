package by.home.test15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionMain {

	public static void main(String[] args) {
		ArrayList <Double> list=new ArrayList <Double>();
		list.add(0,100.0);
		list.add(1,90.0);
		list.add(2,80.0);
		list.add(3,70.0);
		list.add(4,60.0);
		list.add(5,50.0);
		list.add(6,40.0);
		list.add(7,30.0);
		list.add(8,20.0);
		list.add(9,10.0);
		list.add(10,0.0);
		System.out.println("Не отсортированная коллекция: "+list);
		Collections.sort(list);
		System.out.println("Отсортированная коллекция: "+list);
		Collections.reverse(list);
		System.out.println("Перевернутая коллекция: "+list);
		Collections.min(list);
		System.out.println("Min значение: "+Collections.min(list));
		Collections.max(list);
		System.out.println("Max значение: "+Collections.max(list));
		ArrayList <Double> list1=new ArrayList <Double>();
		list1.add(0,10.0);
		list1.add(1,9.0);
		list1.add(2,8.0);
		list1.add(3,7.0);
		list1.add(4,6.0);
		list1.add(5,5.0);
		list1.add(6,4.0);
		list1.add(7,3.0);
		list1.add(8,2.0);
		list1.add(9,1.0);
		list1.add(10,1.0);
		Collections.copy(list,list1);
		System.out.println("Заменил list на list1 и получился новый лист list: "+list);
		Collections.shuffle(list);
		System.out.println("Заменил все элементы на случайные: "+list);
		Collections.fill(list,4.0);
		System.out.println("Заменил все элементы lista на 4: "+list);	
	}
}
