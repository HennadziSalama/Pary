package by.home.test9;

public class AnimalMain {

	public static void main(String[] args) {
		
		Cat c = new Cat();
		c.catchMouse();
		c.setName("barsik");
		System.out.println(c.getName());
		Dog d = new Dog();
		d.catchLayer();
		d.setName("Bobik");
		
		d.speak();
		System.out.println(d.getName());
		
	}

}
