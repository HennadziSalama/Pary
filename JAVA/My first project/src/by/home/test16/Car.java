package by.home.test16;

import java.io.Serializable;

public class Car implements Serializable {
	
	
	private String marka;

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	private double enginecapasity;
		
	public double getEnginecapasity() {
		return enginecapasity;
	}

	public void setEnginecapasity(double enginecapasity) {
		this.enginecapasity = enginecapasity;
	}

	private int yearofissue;
		
	public int getYearofissue() {
		return yearofissue;
	}

	
	public void setYearofissue(int yearofissue) {
		this.yearofissue = yearofissue;
	}
	
	@Override
	public String toString() {
		return "Car [marka=" + marka + ", enginecapasity=" + enginecapasity + ", yearofissue=" + yearofissue + "]";
	}
	
	public Car() {
	}
	
	public Car(String marka) {
		this.marka=marka;
	}
	
	public Car(String marka, double enginecapasity) {
		this.marka=marka;
		this.enginecapasity=enginecapasity;
	}	
	public Car(String marka, double enginecapasity,int yearofissue) {
		this.marka=marka;
		this.enginecapasity=enginecapasity;
		this.yearofissue=yearofissue;
	}	
	
}


