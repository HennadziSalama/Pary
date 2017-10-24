package by.home.test4;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
//		Scanner numb= new Scanner (System.in);
//		System.out.println("Введите число: ");	
//		if (numb.hasNextInt()) {
//			int a=numb.nextInt();
//			System.out.print(a*a*a);
//			}
//		else {System.out.print("Введена ересь");
//		}
//		Scanner numb= new Scanner (System.in);
//		System.out.println("Введите число: ");
//		int number=numb.nextInt();
//		boolean ischeck=true;
//		for (int i=2;i<number;i++){
//			if (number%i==0) {
//				ischeck=false;
//				System.out.print("Составное");
//				break;
//			}
//			else {
//				System.out.print("Простое");
//				break;
//					
//			}
//		 	}		
		
		
//		int [] arroy={1,2,3,5,6,7,5,1,2,3};
//		for (int i=0;i<10;i++){
//		System.out.println(arroy[i]);}
		
//		int [] arroy=new int [10];
			
//		System.out.println(arroy[i]);}
		int [][] arroy=new int [5][5];
		int a=1;		
		for (int i=0;i<5;i++){
			for (int j=0;j<5;j++){
			arroy[i][j]=a;
			System.out.print(arroy[i][j]+" ");
			a++; 
		}
			System.out.println();
//			Просто переводит курсор на новую строку
		}		
		
	}

}
