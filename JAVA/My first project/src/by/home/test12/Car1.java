package by.home.test12;


	public class Car1 implements Cloneable{
		String model;
		Transmission1 transmission;
		@Override
		public String toString() {
			return "Car [model=" + model + ", transmission=" + transmission + "]";
		}
		
		@Override 
		 protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
		
		Car1(){
			
		}
		Car1(Car1 car1){
			this.model=car1.model;
			this.transmission=new Transmission1(car1.transmission);
		}
	}
	
