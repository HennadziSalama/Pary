package by.home.test10;

public class CarMain {

	public static void main(String[] args) {
		Car car1 = new Car("Zepar");
				
		Car car2 = new Car("Zepar");
		
		car1.toString();
		car2.toString();
		
		System.out.println(car1.equals(car2));
		System.out.println(car1.toString());

	}

}
