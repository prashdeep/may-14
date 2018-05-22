package java_14th_may;

public class StringDemo {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = new String("Hello");
		String str3 = "He"+"llo";
		String str4 = "He".concat("llo");
		
		
		//string methods
		
		//System.out.println(str1.toUpperCase().toLowerCase());;
		String str5 = "hello";
		
		System.out.println(str1.toUpperCase().toLowerCase().equalsIgnoreCase(str5) );
		String s9 = "   131331131    ";
		//System.out.println(s9);
		//System.out.println(s9.replaceAll("1", "2"));
		System.out.println(str3.equals(str4));
	}
}
