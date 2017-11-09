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
//		≈сли делаем ошибку в первом с целым числом то дробное он не проверит надо вынести заново try дл€ дробного числа
	}		
	public static int enterIntegerNumber() throws Exception {
		System.out.println("¬ведите целое число: ");
		Scanner numb= new Scanner (System.in);
		if (numb.hasNextInt()) {
			System.out.print("¬ведено целое число: ");
			return numb.nextInt();
		}
		else {
			throw new Exception ("¬ведено не целое число");
		}
	}
	public static double enterDoubleNumber() throws Exception {
		System.out.println("¬ведите дробное число: ");
		Scanner numb1= new Scanner (System.in);
		if (numb1.hasNextDouble()) {
			System.out.print("¬ведено дробное число: ");
			return numb1.nextDouble();
		}
		else {
			throw new Exception ("¬ведено не дробное число");
		}
	}
}
