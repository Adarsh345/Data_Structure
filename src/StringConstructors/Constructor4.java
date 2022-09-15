package StringConstructors;

public class Constructor4 {
	public static void main(String[] args) {
      //String(StringBuilder)
		
		StringBuilder stringBuilder = new StringBuilder("this is StringBuilderObject"); 
		String string = new String(stringBuilder);
		System.out.println("StringBuilder object contained from string object /n"+string);
		
	}
}
