package by.home.test16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Filer {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("D:/Salama/Salama.txt");
//		-1 означает что больше нет элементов и выводит его как результат
		int i=-1;
		while((i=fis.read())!=-1){
			System.out.print((char)i);
		}
//		Так не работает
//		FileInputStream fis=new FileInputStream("D:/Salama/Salama.txt");
//		
//		while((fis.read())!=-1){
//			System.out.print((char)fis.read());
//		}
		
	}
}
