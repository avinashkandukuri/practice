package practice1;

public class Stringlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		String Str1 = new String("Welcome to Tutorialspoint.com");
		System.out.println(Str1);
		String Str2 = new String("Tutorials");
		int wordCount= 1;
		for(int i=0; i < Str1.length(); i++){
			if (Str1.charAt(i) == ' ')
			wordCount++;
		}
		System.out.print("String Length :");
		System.out.println(Str1.length());
		System.out.print("String Length :");
		System.out.println(Str2.length());
		System.out.println("wordcount=" + wordCount);
		System.out.println("Replace=" + Str1.replace(Str2, "wordcount"));
		System.out.println(Str1.toLowerCase());
	}
}


	