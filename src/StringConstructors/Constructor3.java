package StringConstructors;

public class Constructor3 {
	// String(StringBuffer sb)
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("this is StringBuffer Object");
		String s1 = new String(stringBuffer);
		
		System.out.println("copied from string buffer object to string object  : "+ s1);
		System.out.println(s1.equals(stringBuffer)); // true
		
		//System.out.println(s1 == stringBuffer); // incpatable types can not be compaired to each other
		
		
	}

}
