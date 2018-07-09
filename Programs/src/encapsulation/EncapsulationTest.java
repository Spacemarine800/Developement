package encapsulation;

public class EncapsulationTest {

	public static void main(String[] args) {
		TheEncapsulationTest encapsulationTest = new TheEncapsulationTest();
		encapsulationTest.setSomeText("This text was set with a Setter");
		
		System.out.println(encapsulationTest.getSomeText());

	}

}
