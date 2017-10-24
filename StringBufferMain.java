package by.home.test9;

public class StringBufferMain {

	public static void main(String[] args) {
		StringBuffer a=new StringBuffer ("Мама мыла раму");
		
		StringBuffer b=new StringBuffer ("Мама не мыла раму");
		a.length();
		System.out.println(a.length());
		a.charAt(5);
		System.out.println(a);
		a.setCharAt(5,'i');
		System.out.println(a);
		a.insert(5,6);
		System.out.println(a);
		a.delete(5,7);
		System.out.println(a);
		a.deleteCharAt(5);
		System.out.println(a);
		a.append(b);
		System.out.println(a.append(b));
		a.reverse();
		System.out.println(a);
		a.replace(1,3,"fdsg");
		System.out.println(a);
		a.substring(5);
		System.out.println(a);

	}

}
