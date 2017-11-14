package by.home.test14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Multiplicity {

	public static void main(String[] args) {
		HashSet <Integer> list=new HashSet <Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(10);
		HashSet <Integer> list1=new HashSet <Integer>();
		list1.add(10);
		list1.add(9);
		list1.add(8);
		list1.add(7);
		
		
		System.out.println("Введенный список 0: "+list);
		System.out.println("Введенный список 1: "+list1);
		
		list.addAll(list1);
		System.out.println("Вставляет list1 в list и создает новый лист: "+list);
		list.remove(10);
		System.out.println("Удаляет элемент: "+list.remove(10));
		System.out.println("Удаляет элемент: "+list);
				
		System.out.println("Проверяет если в множестве такой элемент: "+list.contains(0));
		
		System.out.println("Проверяет если в множестве что то: "+list.isEmpty());
		
		list.removeAll(list1);
		System.out.println("Удаляет элементы lista из списка lista1: "+list.removeAll(list1));
		System.out.println("Новый лист: "+list);
		
		list.size();
		System.out.println("Возвращает количество множеств: "+list.size());
		
		Object [] array=list.toArray();
		for (Integer a:list){
		System.out.println("Элемент массива: "+a);
		}
//		Здесь в принципе будет работать и без for
		System.out.println("Длина массива: "+array.length);
		System.out.println("Массив: "+Arrays.toString(array));
		
		list.clear();
		System.out.println("Удаляет все: "+list);
		
		
		
		
		

	}

}
