package by.home.test16;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Programka {

	public static void main(String[] args) throws IOException {
//		��������� ���� � ����� 
		System.out.print("������� ���� � �����: ");
		Scanner a= new Scanner (System.in);
		String put=a.nextLine();
		File f=new File(put);
		if (f.exists()){
			System.out.print("������� ����� ������� ������ ��������: ");
			String text=a.nextLine();
			FileWriter fw=new FileWriter(put,true);
			fw.write(text+'\n');
			fw.flush();
			fw.close();
		}
		else {
			System.out.println("�� ������ ����");
		}

	}

}
