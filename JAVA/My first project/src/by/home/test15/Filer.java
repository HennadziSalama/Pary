package by.home.test15;

import java.io.File;
import java.io.IOException;

public class Filer {

	public static void main(String[] args) throws IOException {
		File f=new File("D:/Salama","Salama.txt");
//		������� ����
		f.createNewFile();
//		������� ����
		f.delete();
		System.out.println(f.delete());
//		������� ����
		f.createNewFile();
//		���� �� ����
		System.out.println(f.exists());
//		���������� ������ ����
		System.out.println(f.getAbsolutePath());
//		���������� ��� �����
		System.out.println(f.getName());
//		���������� ��� ��������
		System.out.println(f.getParent());
//		���������� 
		System.out.println(f.isDirectory());
		
	}

}
