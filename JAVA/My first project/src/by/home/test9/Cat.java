package by.home.test9;

public class Cat extends Animal{
	
	private int countCatchMouse;
	
//	public String name = "Vaska";
	public void setName(String name) {
		super.name = name;
	}
	
	public void catchMouse(){
		System.out.println("ловлю мышей");
	}
	public void speak () {
		
		System.out.println("MAU");
	}
}
