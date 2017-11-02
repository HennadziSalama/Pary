package by.home.test12;

import by.home.test12.Car;

public class CarMain {

	public static void main(String[] args) throws CloneNotSupportedException {
//			Первый метод просто копирует ссылки
		Transmission t1=new Transmission();
		t1.type="auto";
		Car car1 = new Car();
		car1.transmission=t1;
		car1.model="audi";
		System.out.println(car1);
		Car car2 = (Car)car1.clone();
		System.out.println(car2);
		car1.model="ford";
		System.out.println(car1);
//		Не меняется во втором (косяк метода или не косяк просто так меняется) а здесь разные ссылки
		System.out.println(car2);
		t1.type="mechanic";
//		Меняется и в первом и втором (косяк метода или не косяк просто так меняется) тут ссылка на коробку передач 
		System.out.println(car1);
		System.out.println(car2);
		
		Car.Door door=new Car.Door();
		
		door.isOpen=true;
		System.out.println(door);
		
//		Привязываем дверь к машине в которой она будет менять параметры 		
		Car.Door1 door1= car1.new Door1();
		System.out.println(car1.isOpenDoor1);
		door1.isOpenDoor1();
		System.out.println(car1.isOpenDoor1);
	}

}
