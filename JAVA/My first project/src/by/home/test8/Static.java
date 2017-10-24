package by.home.test8;

public class Static {
	public static int sum (int firstNumber, int secondNumber) {
		int a=firstNumber+secondNumber;
				return a;
	} 
	public static int sum (int firstNumber, int secondNumber,int thirdNumber ) {
		int a=firstNumber+secondNumber+thirdNumber;
				return a;
	} 
	public static int sum (int []a) {
		int summorise=0;
		for (int i=0;i<a.length;i++) {
			summorise+=a[i];
		}
		return summorise;
	}
	public static int sum (Integer...arr) {
		int summorise=0;
		for (int i=0;i<arr.length;i++) {
			summorise+=arr[i];
	}
		return summorise;
	}
	public static int difference (int firstNumber, int secondNumber) {
		int b=firstNumber-secondNumber;
				return b;
	} 
	public static int multiply (int firstNumber, int secondNumber) {
		int c=firstNumber*secondNumber;
				return c;
	} 
	public static int division (int firstNumber, int secondNumber) {
		int d=firstNumber/secondNumber;
				return d;
	}	
	static final double PI=3.14;
}	
				

