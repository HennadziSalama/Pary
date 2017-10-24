package by.home.homework6;

public class Transmission {
	
	int quantityTransmission;
		
	public Transmission(String typeTransmission, int quantityTransmission) {
		this.quantityTransmission = quantityTransmission;
		System.out.println ("Тип коробки передач: "+typeTransmission);
		System.out.println ("Количество передач (без учета заднего хода): "+quantityTransmission);		
	}
}
