package by.home.test12;

public class CarMain1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Transmission1 t1=new Transmission1();
		t1.type="auto";
		Car1 c1 = new Car1();
		c1.transmission=t1;
		c1.model="audi";
		
		System.out.println(c1);
		Car1 c2 = new Car1(c1);
		System.out.println(c2);
		
		c1.model="ford";
		System.out.println(c1);
		System.out.println(c2);
		
		t1.type="mechanic";
		System.out.println(c1);
		System.out.println(c2);
		
	}

}
