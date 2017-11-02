package by.home.test12Car;

public class Main {

	public static void main(String[] args) {
		Car car=new Car();
		Car car1=new Car(){
			public void go() {
				System.out.println("Я еду очень быстро");
			}
		};
		car.go();
		car1.go();
		System.out.println(car.getModel());
		car.setModel("Zepar");
		car.getModel();
		System.out.println(car.getModel());
		
	}

}
