package by.home.test16;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Chtenije {

	public static void main(String[] args) throws IOException {
//		Читаем файл
		FileReader fr=new FileReader ("D:/Salama/Salama.txt");
		int i=-1;
		while((i=fr.read())!=-1){
			System.out.print((char)i);
		}
		
	}
}
