package by.home.test14;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MapMain {

	public static void main(String[] args) {
		
		
		Map <Integer,Integer> hashmap = new HashMap<Integer,Integer>();
		int n=10;
		Random r=new Random();
		for (int i=0; hashmap.size()<n; i++){
			hashmap.put(i,r.nextInt(n));
		}
		System.out.println("������ ��������� ������"+hashmap);
		Collection<Integer> list1=hashmap.values();
		Object [] arr = list1.toArray();
		System.out.print("��������� � ������: ");
		for (int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
			
		}
		System.out.println("\n");
		Arrays.sort(arr);
		System.out.print("���������������� ��������= ");
		for (int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
		System.out.println("Min �������� �������= "+arr[0]);
		System.out.println("Max �������� �������= "+arr[9]);
		
	}
}
