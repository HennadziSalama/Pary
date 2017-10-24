package by.home.test7;

public class Telephon {
	int number;
	boolean camera;
	public Telephon() {
	}
	
	public Telephon(int number) {
		this.number=number;
	}
	
	public Telephon(boolean camera) {
		this.camera=camera;
	}
	
	public Telephon(int number, boolean camera) {
		this(number);
		this.camera=camera;
	}
			
}
	
		

