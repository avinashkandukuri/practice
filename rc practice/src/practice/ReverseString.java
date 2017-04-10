package practice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "avinsah";
		System.out.println("name of the string" + " " + name);
		int length = name.length();
		System.out.println("length of the " + length);
		String reverse = new StringBuffer(name).reverse().toString();
		System.out.println("reverse word" + "  " + reverse);

	}

}
