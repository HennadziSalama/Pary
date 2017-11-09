package by.home.test13;

import java.util.Scanner;

public class Throw {

	public static void main(String[] args) throws Exception {
		int a=enterIntegerNumber();
//		Не видит этого дальше если есть ошибка
		System.out.print(a);
		int b = 5;
		System.out.println(b);
	}		
	public static int enterIntegerNumber() throws Exception {
		System.out.println("Введите целое число: ");
		Scanner numb= new Scanner (System.in);
		if (numb.hasNextInt()) {
			System.out.print("Введено число: ");
			return numb.nextInt();
		}
		else {
			throw new Exception ("Введено не целое число");
		}
	}
}
