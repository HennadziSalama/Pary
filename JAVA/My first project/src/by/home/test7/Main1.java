package by.home.test7;

public class Main1 {

	public static void main(String[] args) {
		Calculator calculator= new Calculator();	
		int sum1 = calculator.sum(2,3);
		int sum3 = calculator.sum(2,3,5);
		
		System.out.println(sum1);
		System.out.println(sum3);
		int difference1=calculator.difference(2,3);
		System.out.println(difference1);
		

	}

}
