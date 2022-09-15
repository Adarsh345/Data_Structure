package StringConstructors;

public class Counstruction2 {
	/*
	 * String s2 = new String(value);
	 * 
	 * Creates string object with given string object character
	 * it performs string copy operation 
	 * 
	 */
	public static void main(String[] args) {
		String s1 = "Adarsh"; 
		String s2 = new String(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1 == s2);      // false
		
		//Test case 2 
		
		String s3 = new String("bbc"); 
		String s4 = s3; 
		System.out.println(s3.equals(s4)); // true
		System.out.println(s4 == s3);      // true
		
	}	

}
