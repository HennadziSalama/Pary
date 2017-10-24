package by.home.homework8;

public class Prujinka {
	boolean pru;
	
	Prujinka p2=new Prujinka();
	public void pruzinkaEst() {
		pru=true;
		System.out.println("Пружина есть, можно выдвинуть стержень");
	}
	public void pruzinkaNet() {
		pru=false;
		System.out.println("Пружина отсутствует, невозможно выдвинуть стержень");
	}
}
