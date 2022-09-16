package FindCompilationError;

public class RuleOfCounstructor {
	public static void main(String[] args) {
		// we can to pass null as argument directly to constructor , it leads to
		// ce : ambiguous error becouse it is matched with all parameters of string
		// class constructors

		// String s = new String(null);
		// is ambiguous

		// RULE 3
		/*
		 * we can not create string object with null , it leads to RE
		 * NullPointerException
		 * 
		 */ String s1 = null; // allowed
//    String s2 = new String (s1);
		/*
		 * java.lang.NullPointerException
		 */

		// String s3 = new String ((StringBuffer) null);
		/*
		 * java.lang.NullPointerException
		 */
		 
		 String s4 = new String("Null");
		 System.out.println("s4 : "+s4);
		 System.out.println("s4 : "+s4.length());
		 
		// empty String creation
		 
		 String s100 = "";
		 System.out.println(s100.isEmpty()); // true
		 System.out.println(s100 == null);   // false
		 
		 String s101 = " ";
		 System.out.println(s101.isEmpty()); // false
		 System.out.println(s101 == null);   // false
		 
		 String s102 = new String();
		 System.out.println(s102.isEmpty()); // true
		 System.out.println(s102 == null);   // false
		 
		 String s103 = new String("");
		 System.out.println(s103.isEmpty()); // true
		 System.out.println(s103 == null);   // false
		 
		 

	}
}
