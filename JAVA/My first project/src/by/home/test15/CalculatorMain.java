package by.home.test15;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator <Integer,Integer> cal=new Calculator <Integer,Integer>();
		cal.setOneNumber(5);
		cal.setTwoNumber(3);
		cal.getOneNumber();
		cal.getTwoNumber();
		System.out.println(cal.getOneNumber());
		System.out.println(cal.getTwoNumber());
		Calculator <String,String> cal1=new Calculator <String,String>();
		cal1.setOneNumber("Solo");
		cal1.setTwoNumber("Molo");
		cal1.getOneNumber();
		cal1.getTwoNumber();
		System.out.println(cal1.getOneNumber());
		System.out.println(cal1.getTwoNumber());
		
		
		
	}

}
