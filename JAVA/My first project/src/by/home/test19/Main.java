package by.home.test19;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Main {

	public static void main(String[] args) throws SQLException {

		Cat cat=new Cat();
		cat.name = "Sonya";
		cat.age = 5;
		cat.id=3;
//		CatDAO.insert(cat);
//		CatDAO.update(cat);
//		CatDAO.delete(cat);
		ArrayList<Cat> cats=CatDAO.read();
		System.out.println(cats);
		
	}

}
