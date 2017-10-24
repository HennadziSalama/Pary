package by.home.test8;

import java.util.Random;
import java.util.Scanner;

import by.home.test8.Calculator;

public class Main {

	public static void main(String[] args) {
		Calculator calculator= new Calculator();	
		int sum1 = calculator.sum(2,3);
		int sum3 = calculator.sum(2,3,5);
		
		System.out.println(sum1);
		System.out.println(sum3);
		int difference1=calculator.difference(2,3);
		System.out.println(difference1);
		
		
		Scanner n= new Scanner (System.in);
		System.out.print("Введите количество элементов массива m: ");
		int m;
		m=n.nextInt();
		int[] a=new int[m];
		Random r=new Random();
		for (int i=0;i<m;i++) {
			a[i]=r.nextInt(m);
			System.out.println(i+" элемент массива: "+a[i]);
					
		}
		System.out.print("Массив: ");
		for (int i=0;i<m;i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		System.out.println(calculator.sum(a));
		
		
		System.out.println(calculator.sum(1,5,6,8,9,4));
	} 
	
}


