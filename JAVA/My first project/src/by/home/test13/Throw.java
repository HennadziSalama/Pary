package by.home.test13;

import java.util.Scanner;

public class Throw {

	public static void main(String[] args) throws Exception {
		int a=enterIntegerNumber();
//		�� ����� ����� ������ ���� ���� ������
		System.out.print(a);
		int b = 5;
		System.out.println(b);
	}		
	public static int enterIntegerNumber() throws Exception {
		System.out.println("������� ����� �����: ");
		Scanner numb= new Scanner (System.in);
		if (numb.hasNextInt()) {
			System.out.print("������� �����: ");
			return numb.nextInt();
		}
		else {
			throw new Exception ("������� �� ����� �����");
		}
	}
}
