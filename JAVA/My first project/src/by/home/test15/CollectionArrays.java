package by.home.test15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionArrays {

	public static void main(String[] args) {
		Integer a[]={1,21,22,53,64,85,62,37,8,9,10};
		System.out.print("Массив 1: ");
		for (int i=0;i<=10;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		
		Integer b[]={21,32,2,3,6,8,2,3,80,19,1};
		System.out.print("Массив 2: ");
		for (int i=0;i<=10;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println(" ");
		
		Arrays.toString(a);
		System.out.println("Выводит массив как строку: "+Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println("Сортирует массив: "+Arrays.toString(a));
		
		List<Integer> l = Arrays.asList(a);
		System.out.println("Делает из массива лист: "+l);
		
		boolean c=Arrays.equals(a,b);
		System.out.println("Сравнивает массивы: "+c);
		
		Integer[] d = Arrays.copyOf(a,10);
		System.out.print("Копирует 9 элементов из массива: ");
		for (int i=0;i<=9;i++) {
			System.out.print(d[i]+" ");
		}
		System.out.println(" ");
					
		Integer[] e = Arrays.copyOfRange(a,1,5);
		System.out.print("Копирует с 1 по 5 элемент из массива: ");
		for (int i=0;i<=3;i++) {
			System.out.print(e[i]+" ");
		}
		System.out.println(" ");
		
		System.out.println("Ищет данное число и выводит : "+Arrays.binarySearch(a, 21));
		
		Arrays.fill(a,10);
		System.out.println("Заменяет все элементы массива: "+Arrays.toString(a));
	}
}
