package by.home.homework8;

import java.util.Scanner;

public class PolindromWord {

	public static void main(String[] args) {
		System.out.print("������� �����: ");
		Scanner word = new Scanner(System.in);
		String slovo=word.next();
		System.out.println("��������� �����: "+slovo);
				
		String [] s=slovo.split("");
		int k=slovo.length();
		System .out.println("���������� �������� � �����: "+k);
		System .out.print("������ ��������: ");
		for (int i=0; i<k;i++) {
		System.out.print(s[i]);	
		}
		System.out.println();
		
		boolean u = true;
		for(int i=0;i<k;i++){
			if(!s[i].equals(s[k-i-1])){
				u=false;
				break;
			}		
		}
		System.out.println(u?"��� ���������":"��� �� ���������");
	}
}

