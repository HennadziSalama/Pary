package by.home.homework2;

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		Scanner numb1= new Scanner (System.in);
		System.out.print("������� 1-�� �����: ");
		if (numb1.hasNextInt()) {
			int a= numb1.nextInt();
			Scanner numb2= new Scanner (System.in);
			System.out.print("������� 2-�� �����: ");
			if (numb2.hasNextInt()) {
			int b= numb2.nextInt();
			Scanner operation= new Scanner (System.in);
			System.out.print("������� ��������: ");
			String c= operation.nextLine();
			switch (c){
			case "+": 
				int result1=a+b;
				System.out.print("���������: "+a+"+"+b+"="+result1);
			break;
			case "-": 
				int result2=a-b;
			System.out.print("���������: "+a+"-"+b+"="+result2);
			break;
			case "*":
				int result3=a*b;
				System.out.print("���������: "+a+"*"+b+"="+result3);
			break;
			case "/": 
				int result4=a/b;
				System.out.print("���������: "+a+"/"+b+"="+result4);
			break;
			default: 
				System.out.print("�� ������ ��������");
			break;} 
	    } 
			else {System.out.println("��������� 2-�� ����� �� �����");}
		}   else {System.out.println("��������� 1-�� ����� �� �����");}
	}
}


