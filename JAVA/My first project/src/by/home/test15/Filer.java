package by.home.test15;

import java.io.File;
import java.io.IOException;

public class Filer {

	public static void main(String[] args) throws IOException {
		File f=new File("D:/Salama","Salama.txt");
//		Создает файл
		f.createNewFile();
//		Удаляет файл
		f.delete();
		System.out.println(f.delete());
//		Создает файл
		f.createNewFile();
//		Есть ли файл
		System.out.println(f.exists());
//		Возвращает полный путь
		System.out.println(f.getAbsolutePath());
//		Возвращает имя файла
		System.out.println(f.getName());
//		Возвращает имя каталога
		System.out.println(f.getParent());
//		Возвращает 
		System.out.println(f.isDirectory());
		
	}

}
