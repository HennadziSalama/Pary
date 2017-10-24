package by.home.homework5;

import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table v = new Table();
		SimpleDateFormat issued=new SimpleDateFormat("MM/YY");
		System.out.println(issued.format(v.gc.getTime()));

	}

}
