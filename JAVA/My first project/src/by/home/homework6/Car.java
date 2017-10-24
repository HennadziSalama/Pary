package by.home.homework6;

import java.util.GregorianCalendar;


public class Car {
	ModelCar modelCar;
	NumberVehicle numberVehicle;
	ColorCar colorCar;
	Engine engine;
	Transmission transmission;
	Carcase carcase;
	Tank tank;
	 
	
	boolean go;
	
	public void carGo () {
		go=true;
	} 
	public void carDontGO () {
		go=false;
	} 
	public void state () {
			 
		if (go==true){
			System.out.println ("Заведена");
		}
		else {
			System.out.println ("Заглушена");
		}
	}
	
}

