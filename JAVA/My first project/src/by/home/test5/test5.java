package by.home.test5;
import java.util.Random;
import java.util.Scanner;
import static java.lang.Math.*;
public class test5 {
	public static void main(String[] args) {
//Первая задача (выборка)
//		Scanner n= new Scanner (System.in);
//		System.out.print("Введите количество элементов массива m: ");
//		int m;
//		int p;
//		m=n.nextInt();
//		int[] a=new int[m];
//		Scanner h= new Scanner (System.in);
//		for (int i=0;i<m;i++) {
//			System.out.print("Введите "+i+ " элемент массива: ");
//			p=h.nextInt();
//			a[i]=p;
//		}
//		System.out.print("Массив: ");
//		for (int i=0;i<m;i++) {
//			System.out.print(a[i]);
//		}
//		System.out.println();
//		int min=0;
//		for (int i=0; i<m;i++){
//		    min=i;
//			for(int j=i+1;j<m;j++){
//				if (a[min]>a[j]){
//					min=j;
//				}
//			}
//			p = a[i];
//			a[i] = a[min];
//			a[min] = p;
//		}
//		for (int i=0;i<m;i++) {
//		System.out.println(i+" элемент массива: "+a[i]);
//		}
//		System.out.print("Новый массив: ");
//		for (int i=0;i<m;i++) {
//			System.out.print(a[i]);
//		}
//Вторая задача (пузырек)
//		Scanner n= new Scanner (System.in);
//		System.out.print("Введите количество элементов массива m: ");
//		int m;
//		int p;
//		m=n.nextInt();
//		int[] a=new int[m];
//		Scanner h= new Scanner (System.in);
//		for (int i=0;i<m;i++) {
//			System.out.print("Введите "+i+ " элемент массива: ");
//			p=h.nextInt();
//			a[i]=p;
//		}
//		System.out.print("Массив: ");
//		for (int i=0;i<m;i++) {
//			System.out.print(a[i]);
//		}
//		System.out.println();
//		for (int i=0; i<m;i++){
//			for(int j=0;j<m-i-1;j++){
//				if (a[j]>a[j+1]){
//					int d=a[j];
//					a[j]=a[j+1];					
//					a[j+1]=d;
//				}
//			}
//		}
//		for (int i=0;i<m;i++) {
//		System.out.println(i+" элемент массива: "+a[i]);
//		}
//		System.out.print("Новый массив: ");
//		for (int i=0;i<m;i++) {
//			System.out.print(a[i]);
//		}
//Третья задача Math
//		Scanner a= new Scanner (System.in);
//		System.out.print("Введите радиус R: ");
//		double r=a.nextDouble();
//		double pi=Math.PI;
//		double r2=Math.pow(r,2);
//		double S=r2*pi;
//		System.out.println(S);
//Четвертая задача import static java.lang.Math.*;	
//		Scanner a= new Scanner (System.in);
//		System.out.print("Введите радиус R: ");
//		double r=a.nextDouble();
//		double pi=PI;
//		double r2=pow(r,2);
//		double S=r2*pi;
//		System.out.println(S);
//Пятая задача Random
		Random r=new Random();
		int u = r.nextInt(6);
		System.out.println(u);
//Шестая задача Random диапазон от -30 до 90
//				Random r=new Random();
//				int a=120;
//				int u = r.nextInt(120);
//				System.out.println(u-30);		
//		Scanner n= new Scanner (System.in);
//		System.out.print("Введите количество элементов массива m: ");
//		int m;
//		m=n.nextInt();
//		double[] a=new double[m];
//		
//		for (int i=0;i<m;i++) {
//			Random r=new Random();
//			double u = r.nextDouble();
//			System.out.print("Случайный "+i+ " элемент массива: "+u);
//			a[i]=u;
//		}
//		System.out.print("Массив: ");
//		for (int i=0;i<m;i++) {
//			System.out.print(a[i]);
//		}
//		System.out.println();
//		for (int i=0; i<m;i++){
//			for(int j=0;j<m-i-1;j++){
//				if (a[j]>a[j+1]){
//					double d=a[j];
//					a[j]=a[j+1];					
//					a[j+1]=d;
//				}
//			}
//		}
//		for (int i=0;i<m;i++) {
//		System.out.println(i+" элемент массива: "+a[i]);
//		}
//		System.out.print("Новый массив: ");
//		for (int i=0;i<m;i++) {
//			System.out.print(a[i]);
//		}
	}
}
