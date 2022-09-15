package StringConstructors;

public class DemoConstuctors {
	public static void main(String[] args) {
        // Constructor 1.
		//Create empty string  object , not null String object 
		String s = new String();
		if(s != null) {
			System.out.println("this object produced not null object");
		}if(s.isEmpty()) {
			System.out.println("This is an empty string");
		}if(s.isBlank()) {
			System.out.println("this is blank string");
		}if(s.equals("")) {
			System.out.println("this is an empty string");
		}
		
		System.out.println();
		System.out.println();
		
		if(s != null && s.isEmpty() && s.isBlank() && s.equals("")) {
			System.out.println("this all condition are true");
		}
		
	}
}
