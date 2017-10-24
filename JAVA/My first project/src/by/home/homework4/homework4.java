package by.home.homework4;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math.*;
public class homework4 {
	public static void main(String[] args) {
		Scanner n= new Scanner (System.in);
		System.out.print("Введите количество элементов массива m: ");
		int m;
		m=n.nextInt();
		int r1=-20;
		int r2=1267;
		int[] a=new int[m];
		for (int i=0;i<m;i++) {
			Random r=new Random();
			int u = r.nextInt(r2-r1);
			System.out.println("Случайный "+i+ " элемент массива: "+(u+r1));
			a[i]=(u+r1);
		}
		System.out.print("Массив: ");
		for (int i=0;i<m;i++) {
			System.out.print(" "+a[i]);
		}
		System.out.println();
		for (int i=0; i<m;i++){
			for(int j=0;j<m-i-1;j++){
				if (a[j]>a[j+1]){
					int d=a[j];
					a[j]=a[j+1];					
					a[j+1]=d;
				}
			}
		}
		for (int i=0;i<m;i++) {
		System.out.println(i+" элемент массива: "+a[i]);
		}
		System.out.print("Новый массив: ");
		for (int i=0;i<m;i++) {
			System.out.print(" "+a[i]);
		}
	}
}
