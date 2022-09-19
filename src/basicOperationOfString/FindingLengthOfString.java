package basicOperationOfString;

import java.util.Scanner;

public class FindingLengthOfString {
	
	static String s11  ; 
	public static void main(String[] args) {
       String s1 = ""; //0
       String s2 = " "; //1
       String s3 = "ab"; //2
       String s4 = new String(); //0 
       String s5 = new String(""); //0
       String s6 = new String(" ");//1
       String s7 = new String("ab"); //2
       
       System.out.println(s1.length());
       System.out.println(s2.length());
       System.out.println(s3.length());
       System.out.println(s4.length());
       System.out.println(s5.length());
       System.out.println(s6.length());
       System.out.println(s7.length());

		/*
		 * String s8 = null; System.out.println(s8.length()); //npe
		 */
       String s9 = "null";
       System.out.println(s9.length()); //4
       
		/*
		 * String s10; System.out.println(s10.length()); //NPE
		 * 
		 * Unresolved compilation problem: 
	       The local variable s10 may not have been initialized
		 */
       
      // System.out.println("s11 length :"+s11.length());
       //System.out.println("s11 empty : "+s11.isEmpty());
       
       Scanner scn = new Scanner(System.in);
       System.out.println("\n Enter String 1 :");
       System.out.println("you entered : "+scn.nextLine().length()+" characters");
       
	}
}
