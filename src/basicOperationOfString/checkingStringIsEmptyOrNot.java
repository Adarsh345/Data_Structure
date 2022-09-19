package basicOperationOfString;

import java.util.Scanner;

public class checkingStringIsEmptyOrNot {
	public static void main(String[] args) {
      String s1 = "";
      String s2 = " ";
      String s3 = "a";
      String s4 = new String();
      String s5 = new String("");
      String s6 = new String(" ");
      String s7 = new String("a");
      
      System.out.println("is s1 empty : "+s1.isEmpty()); // true
      System.out.println("is s2 empty :"+ s2.isEmpty()); // false
      System.out.println("is s3 empty :"+ s3.isEmpty()); //false
      System.out.println();
      System.out.println("is s4 empty : "+s4.isEmpty()); // true
      System.out.println("is s5 empty :"+ s5.isEmpty()); // true
      System.out.println("is s6 empty :"+ s6.isEmpty()); //false
      System.out.println("is s7 empty :"+ s7.isEmpty()); // false
      
		/*
		 * String s8 = null; System.out.println("is s8 empty : "+s8.isEmpty());
		 * 
		 *  java.lang.NullPointerException: Cannot invoke "String.isEmpty()" because "s8" is null
	        at basicOperationOfString.checkingStringIsEmptyOrNot
		 */
      
		/*
		 * String s9; System.out.println("is s9 empty :" + s9.isEmpty());
		 * java.lang.Error: Unresolved compilation problem: 
	       The local variable s9 may not have been initialized
		 */
      Scanner scn = new Scanner (System.in);
      System.out.println("\n Enter string 1 :");
      System.out.println(scn.nextLine().isEmpty());
      
      System.out.println("\n Enter string 2 :");
      System.out.println(scn.nextLine().isEmpty());
      
      System.out.println("\n Enter string 3 :");
      System.out.println(scn.nextLine().isEmpty());
      
	}
}
