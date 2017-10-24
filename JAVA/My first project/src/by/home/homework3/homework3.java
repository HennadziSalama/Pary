package by.home.homework3;

import java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {
//		Scanner scanner= new Scanner (System.in);
//		int count= 0;
//		int number=10;
////		Количество операций
//		int corrent=0; 
////		Предпредыдущее
//		
////		Предыдущее
//		int pre=1;
//				while (corrent<=number) {
//				int prepre=0;	
//				System.out.println(corrent);
//				prepre=corrent;
//				corrent+=pre;
//				pre=prepre;
//				corrent++;
//			}
//Первое задание
//		int [] a={1,2,3,2,1};
//		boolean t =true;
//		for (int i=0; i<a.length;i++)
//			if(a[i]!=a[a.length-i-1])
//				t=false;
//				System.out.println(t?"Это полиндром":"Это не полиндром");
//Второе задание с половинкой
		Scanner n= new Scanner (System.in);
		System.out.print("Введите количество элементов массива n: ");
		int m;
		int p;
		m=n.nextInt();
		int[]a=new int[m];
		Scanner h= new Scanner (System.in);
		for (int i=0;i<a.length;i++) {
			System.out.print("Введите "+i+ " элемент массива: ");
			p=h.nextInt();
			a[i]=p;
		}
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
//Второе задание 1	
//		System.out.println("Введите любое трехзначное число");
//		Scanner int1= new Scanner (System.in);
//		int f=int1.nextInt();
//		System.out.println(sumDigitsInNumber(f));
//		}
//	public static int sumDigitsInNumber(int number) {
//		int a=number%10;
//		int b=(number-a)/10%10;
//		int c=((number-a)-(b*10))/100;
//		return a+b+c;
//Второе задание 2	
//		Scanner scanner= new Scanner (System.in);
//		System.out.println("Введите любое трехзначное число");
//		int f=int1.nextInt();
//		
//		System.out.println(sumDigitsInNumber(f));
//		}
//	public static int sumDigitsInNumber(int number) {
//		int a=number%10;
//		int b=(number-a)/10%10;
//		int c=((number-a)-(b*10))/100;
//		return a+b+c;		
//Третье задание	
//		int[][]arroy=new int [5][5];
//		int a=1;
//	for (int i=0;i<5;i++){
//		for (int j=0;j<5;j++){
//			arroy[i][j]=a;
//		System.out.print(arroy[i][j]+" ");
//		a++;
//		}
//	System.out.println();
//	}		
	}
}

