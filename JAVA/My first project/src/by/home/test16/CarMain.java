package by.home.test16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CarMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		FileOutputStream fos=new FileOutputStream("D:/Salama/Car.txt");
//		
//		ObjectOutputStream oos=new ObjectOutputStream(fos);
//		
//		Car car=new Car("Zepar", 1.6, 1880);
//		Car car1=new Car("Audi", 2.3, 1999);
//		Car car2=new Car("Ford", 1.3, 2007);
//		Car car3=new Car("Jili", 2.1, 2017);
//		Car car4=new Car("Ferrari", 10.0, 2017);
//		
//		ArrayList <Car> list=new ArrayList <Car>();
//		list.add(0,car);
//		list.add(1,car1);
//		list.add(2,car2);
//		list.add(3,car3);
//		list.add(4,car4);
//		oos.writeObject(list);
		FileInputStream fis=new FileInputStream ("D:/Salama/Car.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		ArrayList <Car> list= (ArrayList <Car>)ois.readObject();
		System.out.println(list);

	}

}
