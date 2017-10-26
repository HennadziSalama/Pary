package by.home.test9;

public class Animal {
	
	protected String name="Pet";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String poroda="Big foot";
	public String getPoroda() {
		return poroda;
	}
	public void setPoroda(String poroda) {
		this.poroda = poroda;
	}
	private double weigdht=20;
	public double getWeigdht() {
		return weigdht;
	}
	public void setWeigdht(double weigdht) {
		this.weigdht = weigdht;
	}
	private int age=20;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public void go () {
		
		System.out.println("Может ходить");
	} 
	public final void speak () {
		
		System.out.println("Может издавать звуки");
	} 
	
}

