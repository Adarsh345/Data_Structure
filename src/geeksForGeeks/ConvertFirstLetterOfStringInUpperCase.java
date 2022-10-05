package geeksForGeeks;

import java.util.Scanner;

public class ConvertFirstLetterOfStringInUpperCase {
	public String firstLetterIntoUpperCase(String s) {
		String result = "";
		String replacedString = s.replaceAll("\\s(2,)","").trim();
		System.out.println(replacedString);
		for(int i = 0 ; i<s.length(); i++) {
		   if(s.charAt(i) == ' ') {
			   result = result + s.replace(s.charAt(i),(char) (s.charAt(i)-32) );
		   }else {
			   result =result + s.charAt(i);
		   }
		}
		return result; 
	}
	public static void main(String[] args) {
        Scanner scn   = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = scn.nextLine();
        System.out.println("String withOut conversion :" + s);
        ConvertFirstLetterOfStringInUpperCase c = new ConvertFirstLetterOfStringInUpperCase();
        System.out.println("String after conversion : "+ c.firstLetterIntoUpperCase(s));
	}
}
