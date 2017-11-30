package by.home.test19;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class DataBaseManager {

	public static Connection getDBConnection (){
		Connection dBConnection=null;
//		Registriruem driver
		try{
		    Class.forName("com.mysql.jdbc.Driver");
		}catch (Exception e){
			System.out.println("Ne udalos zaregistrirovac driver");
		}
//		Ustanavlivaem soedinienie
		try{
			dBConnection=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","password");
		}catch (SQLException e){
			System.out.println("Ne udalos ustanavit soedinienie");
		}
		return dBConnection;
	}
}
