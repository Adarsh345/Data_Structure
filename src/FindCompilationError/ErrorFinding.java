package FindCompilationError;

public class ErrorFinding {
	public static void main(String[] args) {
		char [] ch =  {'a','b','c','d','e','f','d','e'};
		
		// String s1 = new String(ch , -2, 4); 
		// java.lang.StringIndexOutOfBoundsException
		
		// String s2 = new String(ch , 1, -5);
		//java.lang.StringIndexOutOfBoundsException:
		
		//String s3 = new String(ch , 2, 7);
		//java.lang.StringIndexOutOfBoundsException:
		
		String s4 = new String(ch , 2, 5);
		System.out.println(s4);
		
		String s5 = new String(ch , 0, 2);
		System.out.println(s5);
		
		String s6 = new String(ch , 6, 1);
		System.out.println(s6);
		
	}

}
