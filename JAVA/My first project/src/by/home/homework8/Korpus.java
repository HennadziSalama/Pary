package by.home.homework8;

public class Korpus {
	boolean str;
	boolean pru;
	Korpus k1=new Korpus();
	public void write() {
		if (str==true&pru==true){
			System.out.println("Ручка готова, можно писать");	
		}
		else System.out.println("Ручка не готова, вы не можете писать");
	}
	
}
