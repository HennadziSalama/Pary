package by.home.test9;

public class Car {
	int s;
	int p;
	private int maxSpeed=100;
		
	
	
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	public int getMaxPower() {
		return maxPower;
	}

	public void setMaxPower(int maxPower) {
		this.maxPower = maxPower;
	}

	public int getMaxHeight() {
		return maxHeight;
	}

	public void setMaxHeight(int maxHeight) {
		this.maxHeight = maxHeight;
	}

	private int maxWeight=5000;
		
	
	private int maxPower=100;
	
	
	private int maxHeight=2;
	
	
	

	public Car() {
	}
	
	public Car(int s) {
		this.s=s;
	}
	
	public Car(int s,int p) {
		this.s=s;
		this.p=p;
	}	
	
}
