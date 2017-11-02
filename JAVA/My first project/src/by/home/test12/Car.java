package by.home.test12;

import by.home.test12.Car;

public class Car implements Cloneable{
	String model;
	Transmission transmission;
	boolean isOpenDoor1=false;
	@Override
	public String toString() {
		return "Car [model=" + model + ", transmission=" + transmission + "]";
	}
	
	@Override 
	 protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static class Door {
		boolean isOpen=false;

		@Override
//		Переопределение
		public String toString() {
			return "Door [isOpen=" + isOpen + "]";
		}
	}
	
	public class Door1{

		public void isOpenDoor1(){
		isOpenDoor1=true;
		
		}

		
	}
		
}
	
	

