package by.home.homework8;

public class Sterjen {
	boolean str;
	
	Sterjen s1=new Sterjen();
	public void sterjenVydvinut() {
		str=true;
		System.out.println("Стержень выдвинут, можно писать");
	}
	public void sterjenZadvinut() {
		str=false;
		System.out.println("Стержень задвинут, невозможно писать");
	}
		

}
