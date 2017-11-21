package by.home.test16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class VvodVyvod {

	public static void main(String[] args) throws IOException {
//		«аписываем (но перезаписывает файл, мен€ет весь текст на тот который мы здесь указали) используетс€ дл€ двоичного кода
//		FileOutputStream fos=new FileOutputStream("D:/Salama/Salama.txt");
//		String s="’отелось бы";
//		byte [] arrayForWrite=s.getBytes();
//		fos.write(arrayForWrite);
//		ƒописываем при true и перезаписываем при false
		FileWriter fw=new FileWriter("D:/Salama/Salama.txt",false);
		fw.write("“екст23 дл€ записи"+'\n'+"dsgsdg");
		fw.flush();
		
		}
}
