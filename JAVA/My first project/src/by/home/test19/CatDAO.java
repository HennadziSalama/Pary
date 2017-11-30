package by.home.test19;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class CatDAO {
	public static void insert(Cat cat) throws SQLException{
		String query="insert into cats (name,age)"+
	                 " values ('"+cat.name+"',"+cat.age+")";
		System.out.println(query);
		Connection dBConnection = DataBaseManager.getDBConnection();

//		Zapros k sostajaniju
		Statement statement=null;
		try {
			statement=(Statement)dBConnection.createStatement();
//		Vypolnic vasz zapros (molnija w MySQL)
			statement.execute(query);
		} catch (SQLException e) {
			System.out.println("Vyvodit put gde voznikla oszibka");
			e.printStackTrace();
		}
		finally {
			if (statement!=null){
				statement.close();
			}
			if (dBConnection!=null){
				dBConnection.close();
			}
		}
	}
	public static void update(Cat cat) throws SQLException{
		String query="update cats set name='"+cat.name+"',age="+cat.age+" where id="+cat.id+";";
		System.out.println(query);
   	Connection dBConnection = DataBaseManager.getDBConnection();

//	Zapros k sostajaniju
	Statement statement=null;
	try {
		statement=(Statement)dBConnection.createStatement();
//	Vypolnic vasz zapros (molnija w MySQL)
		statement.execute(query);
	} catch (SQLException e) {
		System.out.println("Vyvodit put gde voznikla oszibka");
		e.printStackTrace();
	}
	finally {
		if (statement!=null){
			statement.close();
		}
		if (dBConnection!=null){
			dBConnection.close();
		}
	}
	}
	public static ArrayList<Cat> read() throws SQLException{
		String query="select *from cats";
		System.out.println(query);
	Connection dBConnection = DataBaseManager.getDBConnection();

//	Zapros k sostajaniju
	Statement statement=null;
	ArrayList<Cat> cats=new ArrayList<Cat>();

	try {
		statement=(Statement)dBConnection.createStatement();
//	Vypolnic vasz zapros (molnija w MySQL)
		ResultSet rs=statement.executeQuery(query);
		while (rs.next()){
		Cat cat=new Cat();
		cat.name=rs.getString("name");
		cat.age=rs.getInt("age");
		cat.id=rs.getInt("id");
		cats.add(cat);
		}
	} catch (SQLException e) {
		System.out.println("Vyvodit put gde voznikla oszibka");
		e.printStackTrace();
	}
	finally {
		if (statement!=null){
			statement.close();
		}
		if (dBConnection!=null){
			dBConnection.close();
		}
		
	}
		return cats;
	}
	public static void delete(Cat cat) throws SQLException{
		String query="delete from cats where id="+cat.id+";";
		System.out.println(query);
   	Connection dBConnection = DataBaseManager.getDBConnection();

//	Zapros k sostajaniju
	Statement statement=null;
	try {
		statement=(Statement)dBConnection.createStatement();
//	Vypolnic vasz zapros (molnija w MySQL)
		statement.execute(query);
	} catch (SQLException e) {
		System.out.println("Vyvodit put gde voznikla oszibka");
		e.printStackTrace();
	}
	finally {
		if (statement!=null){
			statement.close();
		}
		if (dBConnection!=null){
			dBConnection.close();
		}
	}
	}
}
