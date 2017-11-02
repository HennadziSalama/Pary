package by.home.test12;

public class Transmission1 {

	String type;

	@Override
	public String toString() {
		return "Transmission [type=" + type + "]";
	}
	Transmission1(){
	}
	Transmission1(Transmission1 trans){
		this.type=trans.type;
	}
}
