package comparingStringObjectWithOrWithOutCase;

public class equalsTest {
	
	public static void main(String[] args) {

		String s1 = "a";
		String s2 = "a";
		String s3 = new String("a");
		String s4 = new String("a");
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		StringBuffer sb2 =new StringBuffer("a");
		StringBuffer sb1 = new StringBuffer("a");
		System.out.println(sb1 == sb2);
		System.out.println();
		// In string class .equals methods is overridden for content compression
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		// In string buffer class equals method went for reference comparison
		System.out.println(sb1.equals(sb2)); 
		
		String s5 = "a";
		String s6 = "A";
		System.out.println(s5 == s6); // false
		System.out.println(s5.equals(s6)); // false
		System.out.println(s5.equalsIgnoreCase(s6));//true
		
		Example e1 = new Example(5);
		Example e2 = new Example(5);
		Example e3 = new Example(6);
		Example e4 = e3 ; 
		System.out.println(e1 == e2); // false
		System.out.println(e2 == e3); // false
		System.out.println(e3 == e4); // true	
		
		System.out.println();
		
		System.out.println(e1.equals(e2)); // true
		System.out.println(e2.equals(e3)); // false
		System.out.println(e3.equals(e4)); // true
		
		Sample s = new Sample();
		System.out.println(s.equals(null)); // false
		System.out.println(s == null);  // false
		System.out.println(e1 == null); // false
		System.out.println(e1.equals(null));//false
		
		
	}
}
