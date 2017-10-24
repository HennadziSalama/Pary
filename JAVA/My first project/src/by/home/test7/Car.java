package by.home.test7;

import java.util.GregorianCalendar;

public class Car {
	GregorianCalendar age=new GregorianCalendar();
	int minSpeed=5;
	String color= "blue";
	int maxSpeed=100;
	int minWeight=500;
	int maxWeight=5000;
	int maxPower=100;
	int transmission=0;
	
	boolean isRun;
	
	public void carOn () {
		isRun=true;
	} 
	public void carOff () {
		isRun=false;
	} 
	public void state () {
		
	 
		if (isRun==true){
			System.out.println ("Заведена");
		}
		else {
			System.out.println ("Заглушена");
		}
	}
	public int nextTrans () {
		transmission++;
		return transmission;
	} 
	public int lowTrans () {
		transmission--;
		return transmission;
	} 
	
	
	public void carGO (int spead, int hj, String name) {
				
			System.out.println ("Марка: "+name);
			System.out.println ("Стартовый номер машины: "+hj);		
		    System.out.println ("Машина едет: "+spead);
	}
}
