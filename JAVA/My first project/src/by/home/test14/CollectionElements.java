package by.home.test14;
import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class CollectionElements {

	public static void main(String[] args) {
		
			ArrayList <Double> list=new ArrayList <Double>();
			list.add(0,1.0);
			list.add(1,2.0);
			list.add(2,3.0);
			list.add(3,4.0);
			list.add(4,5.0);
			list.add(5,6.0);
			list.add(6,7.0);
			list.add(7,8.0);
			list.add(8,9.0);
			list.add(9,10.0);
			list.add(10,10.0);
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
			System.out.println("��������� ������ 0: "+list);
			System.out.println("��������� ������ 1: "+list1);
			System.out.println("���������� 0 ������: "+list.get(0));
			list.addAll(9,list1);
			System.out.println("��������� � 9 ������ ����� ����: "+list);
			System.out.println("���������� �� �������� ������ ������: "+list.indexOf(10.0));
			System.out.println("���������� �� �������� ������ ���������: "+list.lastIndexOf(10.0));
			list.remove(21);
			System.out.println("������� �������: "+list);
			list.set(20,0.0);
			System.out.println("��������� ������ ����������: "+list);
			List<Double> list2 = list.subList(0,5);
			System.out.println("������ ����� ���� �� ��������� ����������� ���� �� ���� ��������: "+list2);
	}
}

