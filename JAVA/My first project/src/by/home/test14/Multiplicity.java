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
		
		
		System.out.println("��������� ������ 0: "+list);
		System.out.println("��������� ������ 1: "+list1);
		
		list.addAll(list1);
		System.out.println("��������� list1 � list � ������� ����� ����: "+list);
		list.remove(10);
		System.out.println("������� �������: "+list.remove(10));
		System.out.println("������� �������: "+list);
				
		System.out.println("��������� ���� � ��������� ����� �������: "+list.contains(0));
		
		System.out.println("��������� ���� � ��������� ��� ��: "+list.isEmpty());
		
		list.removeAll(list1);
		System.out.println("������� �������� lista �� ������ lista1: "+list.removeAll(list1));
		System.out.println("����� ����: "+list);
		
		list.size();
		System.out.println("���������� ���������� ��������: "+list.size());
		
		Object [] array=list.toArray();
		for (Integer a:list){
		System.out.println("������� �������: "+a);
		}
//		����� � �������� ����� �������� � ��� for
		System.out.println("����� �������: "+array.length);
		System.out.println("������: "+Arrays.toString(array));
		
		list.clear();
		System.out.println("������� ���: "+list);
		
		
		
		
		

	}

}
