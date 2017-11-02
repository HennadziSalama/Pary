package by.home.test12;

public class Exceptions {

	public static void main(String[] args) {
		
		try{
			int a=2/0;
			System.out.println(a);
		}catch (ArithmeticException ex){
			System.out.println("Вы попытались делить на ноль");
		}
		

	}

}
