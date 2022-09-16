package StringConstructors;

public class Constructor6 {
	/*
	 * Constructor 7 which takes char array as input and and the value offset ,
	 * count
	 * String(char [] char , int offset , int count);
	 */
	public static void main(String[] args) {
       char [] ch = {'a','b','c','d','e','f','g','h'};
       String s7 = new String(ch , 1 , 3);
       System.out.println(s7); // b c d 
	}
}
