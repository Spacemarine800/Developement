
public class StringMethods {

	public static void main(String[] args) {
		String testString = "We are now testing the String methods";
		
		System.out.println("IndexOf");
		System.out.println("First Index of r: " +testString.indexOf("r"));
		System.out.println("Last Index of r: " +testString.lastIndexOf("r"));
	
		System.out.println("Length");
		System.out.println("Length of string: " +testString.length());
		
		String stringArr[] = testString.split(" ");
		for(int i=0; i < stringArr.length; i++){
			System.out.println(stringArr[i]);
		}
	}
}
