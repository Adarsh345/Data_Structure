package Testing;

import java.util.Scanner;

public class ComparingString {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		if(s.equals("Adarsh")) {
			System.out.println("this is equal string");
		}else {
			System.out.println("this is not a equal string");
		}
	}

}
