package by.home.test7;

import by.home.test7.Car;

public class Main {

	public static void main(String[] args) {
		Car car=new Car();
		car.carOn();
		car.state();
		car.carOff();
		car.state();
		
		
		car.nextTrans();	
		car.lowTrans();
		car.nextTrans();
		car.nextTrans();
		int correntTrans=car.nextTrans();
		System.out.println(correntTrans);
		
		System.out.println(car.maxSpeed);
		car.maxSpeed=220;
		System.out.println(car.maxSpeed);
		car.carGO(20,2,"Ford");
		car.carGO(40,1,"Masserati");
		
		
	}
}
