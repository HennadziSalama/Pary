package by.home.homework8;

import java.util.Scanner;

public class Pen {
	Korpus korpus;
	Sterjen sterjen;
	Prujinka prujinka;
	
	
	int limit=100;
	public static void main (String[] args) {
		System.out.println("Напишите ваш текст");	
		Pen p=new Pen();
		Scanner vvod=new Scanner (System.in);
		String v1=vvod.nextLine();
		int k=v1.length();
		for (int i=100; i<k;i++) {
			if(k>100){
				System.out.println("Написать данный текст невозможно, не хватает чернил");	
			}
			else { 
				System.out.println("v1");
			}
		}
			
				
		
	}
}
