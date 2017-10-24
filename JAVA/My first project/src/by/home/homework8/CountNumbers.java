package by.home.homework8;

import java.util.Scanner;

public class CountNumbers {

	public static void main(String[] args) {
		System.out.print("Введите текст: ");
		Scanner t = new Scanner(System.in);
		String text=t.nextLine();
		System.out.println("Введенный текст: "+text);
					
		String Str = new String(text);
			
		for (String retval : text.split("")) {
			System.out.print(retval);
		}
		System.out.println();
		String [] s=text.split("");
		int k =text.split(" +").length;
		System.out.println("Количество слов в тексте: "+k);
	}
}
