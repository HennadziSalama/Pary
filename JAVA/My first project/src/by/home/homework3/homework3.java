package by.home.homework3;

import java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {
//		Scanner scanner= new Scanner (System.in);
//		int count= 0;
//		int number=10;
////		���������� ��������
//		int corrent=0; 
////		��������������
//		
////		����������
//		int pre=1;
//				while (corrent<=number) {
//				int prepre=0;	
//				System.out.println(corrent);
//				prepre=corrent;
//				corrent+=pre;
//				pre=prepre;
//				corrent++;
//			}
//������ �������
//		int [] a={1,2,3,2,1};
//		boolean t =true;
//		for (int i=0; i<a.length;i++)
//			if(a[i]!=a[a.length-i-1])
//				t=false;
//				System.out.println(t?"��� ���������":"��� �� ���������");
//������ ������� � ����������
		Scanner n= new Scanner (System.in);
		System.out.print("������� ���������� ��������� ������� n: ");
		int m;
		int p;
		m=n.nextInt();
		int[]a=new int[m];
		Scanner h= new Scanner (System.in);
		for (int i=0;i<a.length;i++) {
			System.out.print("������� "+i+ " ������� �������: ");
			p=h.nextInt();
			a[i]=p;
		}
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
//������ ������� 1	
//		System.out.println("������� ����� ����������� �����");
//		Scanner int1= new Scanner (System.in);
//		int f=int1.nextInt();
//		System.out.println(sumDigitsInNumber(f));
//		}
//	public static int sumDigitsInNumber(int number) {
//		int a=number%10;
//		int b=(number-a)/10%10;
//		int c=((number-a)-(b*10))/100;
//		return a+b+c;
//������ ������� 2	
//		Scanner scanner= new Scanner (System.in);
//		System.out.println("������� ����� ����������� �����");
//		int f=int1.nextInt();
//		
//		System.out.println(sumDigitsInNumber(f));
//		}
//	public static int sumDigitsInNumber(int number) {
//		int a=number%10;
//		int b=(number-a)/10%10;
//		int c=((number-a)-(b*10))/100;
//		return a+b+c;		
//������ �������	
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

