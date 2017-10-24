package by.home.test3;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
//		Первое задание
//		Scanner numb= new Scanner (System.in);
//		System.out.print("Введите целое число: ");
//		if (numb.hasNextInt()) {
//			int a=numb.nextInt();
//		    int i= 0;
//		    while (i<=a) {
//			    System.out.println(i);
//			    i++;
//			}
//		    a--;
//		    do {
//			    System.out.println(a);
//			    a--;
//		    } while (0<=a); 
//		}
//		else {
//		System.out.print("Введено не целое число");
//		}
//		Второе задание
//		Scanner numb= new Scanner (System.in);
//		System.out.println("Введите целое число: ");
//			if (numb.hasNextInt()) {
//				int a=numb.nextInt();
//					for (int i=0;i<=a;i++){
//						System.out.println(i);
//					}
//					a--;
//					for (int i=0;i<=a;a--){
//						System.out.println(a);
//					}
//			}		
//			else {
//				System.out.print("Введено не целое число");
//			}
//			Третье задание
//		Scanner numb= new Scanner (System.in);
//		System.out.println("Введите целое число: ");
//			if (numb.hasNextInt()) {
//				int a=numb.nextInt();
//					for (int i=0;i<=a;i++){
//						if (i==3||i==6) {
//							continue;
//						}
//						System.out.println(i);
//					}
//					a--;
//					for (int i=0;i<=a;a--){
//						if (a==3||a==6) {
//							continue;
//						}
//						System.out.println(a);
//					}
//								}		
//			else {
//				System.out.print("Введено не целое число");
//			}
//			Четвертое задание
//			Scanner numb= new Scanner (System.in);
//			System.out.println("Введите целое число: ");
//				if (numb.hasNextInt()) {
//					int a=numb.nextInt();
//						for (int i=0;i<=a;i++){
//							if (i%2==1) {
//								continue;
//							}
//							System.out.println(i);
//						}
//						a = a-2;
//						for (int i=0;i<=a;a--){
//							if (a%2==1) {
//								continue;
//							}
//							System.out.println(a);
//						}
//									}		
//				else {
//					System.out.print("Введено не целое число");
//				}
//				Пятое задание
				Scanner numb= new Scanner (System.in);
				System.out.println("Введите целое число: ");
					if (numb.hasNextInt()) {
						int a=numb.nextInt();
						int i= 2;
						while (i<=a) {
						    System.out.println(i);
						    i=i+2;
						}
					}
					else {
						System.out.print("Введено не целое число");
					}
					
		}
}

