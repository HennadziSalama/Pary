package by.home.test16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class VvodVyvod {

	public static void main(String[] args) throws IOException {
//		���������� (�� �������������� ����, ������ ���� ����� �� ��� ������� �� ����� �������) ������������ ��� ��������� ����
//		FileOutputStream fos=new FileOutputStream("D:/Salama/Salama.txt");
//		String s="�������� ��";
//		byte [] arrayForWrite=s.getBytes();
//		fos.write(arrayForWrite);
//		���������� ��� true � �������������� ��� false
		FileWriter fw=new FileWriter("D:/Salama/Salama.txt",false);
		fw.write("�����23 ��� ������"+'\n'+"dsgsdg");
		fw.flush();
		
		}
}
