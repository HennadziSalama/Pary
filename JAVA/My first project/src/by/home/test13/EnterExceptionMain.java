package by.home.test13;

import java.util.Scanner;

public class EnterExceptionMain {

	public static void main(String[] args) {
		try{
			int a=enterIntegerNumber();
			System.out.println(a);
			int c=2/0;
		} catch (EnterException e) {
			System.err.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.err.println("��������� �������������� ������");
		} catch (Exception e) {
			System.err.println("��������� �������� ������ ���������� � ���������� ��������������");
		}
		try{
			double b=enterDoubleNumber();
			System.out.println(b);	
		} catch (EnterException e) {
			System.err.println(e.getMessage());
		}
		catch (Exception e) {
			System.err.println("��������� �������� ������ ���������� � ���������� ��������������");
		}
//		���� ������ ������ � ������ � ����� ������ �� ������� �� �� �������� ���� ������� ������ try ��� �������� �����
	}		
	public static int enterIntegerNumber() throws EnterException {
		System.out.println("������� ����� �����: ");
		Scanner numb= new Scanner (System.in);
		if (numb.hasNextInt()) {
			System.out.println("������� ����� �����: ");
			return numb.nextInt();
		}
		else {
			throw new EnterException ("������� �� ����� �����");
		}
	}
	public static double enterDoubleNumber() throws EnterException {
		System.out.println("������� ������� �����: ");
		Scanner numb1= new Scanner (System.in);
		if (numb1.hasNextDouble()) {
			System.out.println("������� ������� �����: ");
			return numb1.nextDouble();
		}
		else {
			throw new EnterException ("������� �� ������� �����");
		}
	}		
}


