package by.home.test5;
import java.util.Random;
import java.util.Scanner;
import static java.lang.Math.*;
public class test5 {
	public static void main(String[] args) {
//������ ������ (�������)
//		Scanner n= new Scanner (System.in);
//		System.out.print("������� ���������� ��������� ������� m: ");
//		int m;
//		int p;
//		m=n.nextInt();
//		int[] a=new int[m];
//		Scanner h= new Scanner (System.in);
//		for (int i=0;i<m;i++) {
//			System.out.print("������� "+i+ " ������� �������: ");
//			p=h.nextInt();
//			a[i]=p;
//		}
//		System.out.print("������: ");
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
//		System.out.println(i+" ������� �������: "+a[i]);
//		}
//		System.out.print("����� ������: ");
//		for (int i=0;i<m;i++) {
//			System.out.print(a[i]);
//		}
//������ ������ (�������)
//		Scanner n= new Scanner (System.in);
//		System.out.print("������� ���������� ��������� ������� m: ");
//		int m;
//		int p;
//		m=n.nextInt();
//		int[] a=new int[m];
//		Scanner h= new Scanner (System.in);
//		for (int i=0;i<m;i++) {
//			System.out.print("������� "+i+ " ������� �������: ");
//			p=h.nextInt();
//			a[i]=p;
//		}
//		System.out.print("������: ");
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
//		System.out.println(i+" ������� �������: "+a[i]);
//		}
//		System.out.print("����� ������: ");
//		for (int i=0;i<m;i++) {
//			System.out.print(a[i]);
//		}
//������ ������ Math
//		Scanner a= new Scanner (System.in);
//		System.out.print("������� ������ R: ");
//		double r=a.nextDouble();
//		double pi=Math.PI;
//		double r2=Math.pow(r,2);
//		double S=r2*pi;
//		System.out.println(S);
//��������� ������ import static java.lang.Math.*;	
//		Scanner a= new Scanner (System.in);
//		System.out.print("������� ������ R: ");
//		double r=a.nextDouble();
//		double pi=PI;
//		double r2=pow(r,2);
//		double S=r2*pi;
//		System.out.println(S);
//����� ������ Random
		Random r=new Random();
		int u = r.nextInt(6);
		System.out.println(u);
//������ ������ Random �������� �� -30 �� 90
//				Random r=new Random();
//				int a=120;
//				int u = r.nextInt(120);
//				System.out.println(u-30);		
//		Scanner n= new Scanner (System.in);
//		System.out.print("������� ���������� ��������� ������� m: ");
//		int m;
//		m=n.nextInt();
//		double[] a=new double[m];
//		
//		for (int i=0;i<m;i++) {
//			Random r=new Random();
//			double u = r.nextDouble();
//			System.out.print("��������� "+i+ " ������� �������: "+u);
//			a[i]=u;
//		}
//		System.out.print("������: ");
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
//		System.out.println(i+" ������� �������: "+a[i]);
//		}
//		System.out.print("����� ������: ");
//		for (int i=0;i<m;i++) {
//			System.out.print(a[i]);
//		}
	}
}
