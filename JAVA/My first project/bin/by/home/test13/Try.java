package by.home.test13;

import java.util.Scanner;

public class Try {

	public static void main(String[] args) {
		try{
			int a=enterIntegerNumber();
			System.out.println(a);	
			double b=enterDoubleNumber();
			System.out.println(b);	
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.err.println(e.getMessage());
		}
//		���� ������ ������ � ������ � ����� ������ �� ������� �� �� �������� ���� ������� ������ try ��� �������� �����
	}		
	public static int enterIntegerNumber() throws Exception {
		System.out.println("������� ����� �����: ");
		Scanner numb= new Scanner (System.in);
		if (numb.hasNextInt()) {
			System.out.print("������� ����� �����: ");
			return numb.nextInt();
		}
		else {
			throw new Exception ("������� �� ����� �����");
		}
	}
	public static double enterDoubleNumber() throws Exception {
		System.out.println("������� ������� �����: ");
		Scanner numb1= new Scanner (System.in);
		if (numb1.hasNextDouble()) {
			System.out.print("������� ������� �����: ");
			return numb1.nextDouble();
		}
		else {
			throw new Exception ("������� �� ������� �����");
		}
	}
}
