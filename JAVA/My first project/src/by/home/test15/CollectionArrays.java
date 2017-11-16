package by.home.test15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionArrays {

	public static void main(String[] args) {
		Integer a[]={1,21,22,53,64,85,62,37,8,9,10};
		System.out.print("������ 1: ");
		for (int i=0;i<=10;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		
		Integer b[]={21,32,2,3,6,8,2,3,80,19,1};
		System.out.print("������ 2: ");
		for (int i=0;i<=10;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println(" ");
		
		Arrays.toString(a);
		System.out.println("������� ������ ��� ������: "+Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println("��������� ������: "+Arrays.toString(a));
		
		List<Integer> l = Arrays.asList(a);
		System.out.println("������ �� ������� ����: "+l);
		
		boolean c=Arrays.equals(a,b);
		System.out.println("���������� �������: "+c);
		
		Integer[] d = Arrays.copyOf(a,10);
		System.out.print("�������� 9 ��������� �� �������: ");
		for (int i=0;i<=9;i++) {
			System.out.print(d[i]+" ");
		}
		System.out.println(" ");
					
		Integer[] e = Arrays.copyOfRange(a,1,5);
		System.out.print("�������� � 1 �� 5 ������� �� �������: ");
		for (int i=0;i<=3;i++) {
			System.out.print(e[i]+" ");
		}
		System.out.println(" ");
		
		System.out.println("���� ������ ����� � ������� : "+Arrays.binarySearch(a, 21));
		
		Arrays.fill(a,10);
		System.out.println("�������� ��� �������� �������: "+Arrays.toString(a));
	}
}
