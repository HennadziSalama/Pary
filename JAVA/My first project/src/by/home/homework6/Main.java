package by.home.homework6;


public class Main {

	public static void main(String[] args) {
		ModelCar model=new ModelCar("Ford","Galaxy");
		NumberVehicle licensePlate=new NumberVehicle("1234 AB-4");
		ColorCar color=new ColorCar("Blue");
		Engine engine=new Engine(2.0,"45613HG123",320,"Diesiel");
		Transmission transmission=new Transmission("Automatic",5);
		Carcase carcase=new Carcase("Miniven","461321JK163");
		Tank tank=new Tank(60,120);
		
		Car car = new Car();
		car.transmission = transmission;
		
		System.out.println(car.transmission.quantityTransmission);
						
	}

}
