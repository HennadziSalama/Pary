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
			System.err.println("Произошла математическая ошибка");
		} catch (Exception e) {
			System.err.println("Произошла системая ошибка обратитесь к системному администратору");
		}
		try{
			double b=enterDoubleNumber();
			System.out.println(b);	
		} catch (EnterException e) {
			System.err.println(e.getMessage());
		}
		catch (Exception e) {
			System.err.println("Произошла системая ошибка обратитесь к системному администратору");
		}
//		Если делаем ошибку в первом с целым числом то дробное он не проверит надо вынести заново try для дробного числа
	}		
	public static int enterIntegerNumber() throws EnterException {
		System.out.println("Введите целое число: ");
		Scanner numb= new Scanner (System.in);
		if (numb.hasNextInt()) {
			System.out.println("Введено целое число: ");
			return numb.nextInt();
		}
		else {
			throw new EnterException ("Введено не целое число");
		}
	}
	public static double enterDoubleNumber() throws EnterException {
		System.out.println("Введите дробное число: ");
		Scanner numb1= new Scanner (System.in);
		if (numb1.hasNextDouble()) {
			System.out.println("Введено дробное число: ");
			return numb1.nextDouble();
		}
		else {
			throw new EnterException ("Введено не дробное число");
		}
	}		
}


