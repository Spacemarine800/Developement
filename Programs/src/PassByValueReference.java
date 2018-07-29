public class PassByValueReference {

	public static void main(String[] args) {
		
		int a = 9;
		System.out.println("Value of a: "+a);
		new PassByValueReference().passByValue(a);
		System.out.println("Value of a after passByValue: "+a);
		new PassByValueReference().passByReference(a);
		System.out.println("Value of a after passByReference: "+a);

	}
	
	public void passByValue(int b){
		System.out.println("Pass By Value");
		b = b + 10;
		System.out.println("Value: "+b);
	}
	
	public void passByReference(int a){
		System.out.println("Pass By Reference");
		a = a + 20;
		System.out.println("Value: "+a);
	}

}
